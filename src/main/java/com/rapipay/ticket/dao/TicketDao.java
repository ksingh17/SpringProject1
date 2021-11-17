package com.rapipay.ticket.dao;

import java.util.ArrayList;
import java.util.List;

import com.rapipay.ticket.bean.Admin;
import com.rapipay.ticket.bean.TicketDetails;

public class TicketDao {
	
	
	public List<Admin> adminlist=new ArrayList<Admin>();
	
	public List<TicketDetails> ticketlist=new ArrayList<TicketDetails>();
    
	public void login(String uname,String password) throws Exception
	{
		for(Admin admin: adminlist)
		{
			if(admin.getUserName().equals(uname) && admin.getPassword().equals(password))
			{
				showTrains();
				break;
			}
			else
			{
				throw new Exception("Invalid username or password exception ");
			}
		}
		
	}

	private void showTrains() {
		// TODO Auto-generated method stub
		for(TicketDetails td: ticketlist)
		{
			System.out.println(td.getTrain());
		}
		
	}
	
}
