package com.rapipay.ticket.runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rapipay.ticket.bean.Admin;
import com.rapipay.ticket.bean.TicketDetails;
import com.rapipay.ticket.dao.TicketDao;

public class MainClass {

	public static void main(String[] args) {

		TicketDao ticketdao = new TicketDao();

		ApplicationContext spring = new ClassPathXmlApplicationContext("spring-conf.xml");
		Admin admin1 = (Admin) spring.getBean("admin1");
		Admin admin2 = (Admin) spring.getBean("admin2");
		Admin admin3 = (Admin) spring.getBean("admin3");

		ticketdao.adminlist.add(admin1);
		ticketdao.adminlist.add(admin2);
		ticketdao.adminlist.add(admin3);

		TicketDetails td1 = (TicketDetails) spring.getBean("ticket1");
		TicketDetails td2 = (TicketDetails) spring.getBean("ticket2");
		
		ticketdao.ticketlist.add(td1);
		ticketdao.ticketlist.add(td2);
		
		for(Admin ad: ticketdao.adminlist)
		{
			System.out.println(ad);
		}
		System.out.println("-----------");
		for(TicketDetails td: ticketdao.ticketlist)
		{
			System.out.println(td);
		}
		
		System.out.println("-----------");
		try {
			ticketdao.login("Shivani", "Aa12345#");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}

	}
}
