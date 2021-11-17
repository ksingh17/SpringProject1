package com.rapipay.ticket.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class TicketDetails {

	private int ticketId;
	private String ticketClass;
	private String source;
	private String destination;
	private int numOfPassenger;
	private int totalAmount;

	private TrainDetails train;
	
	

	public TicketDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TicketDetails(int ticketId, String ticketClass, String source, String destination, int numOfPassenger,
			int totalAmount, TrainDetails train) {
		super();
		this.ticketId = ticketId;
		this.ticketClass = ticketClass;
		this.source = source;
		this.destination = destination;
		this.numOfPassenger = numOfPassenger;
		this.totalAmount = totalAmount;
		this.train = train;
	}

	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	public String getTicketClass() {
		return ticketClass;
	}

	public void setTicketClass(String ticketClass) {
		this.ticketClass = ticketClass;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getNumOfPassenger() {
		return numOfPassenger;
	}

	public void setNumOfPassenger(int numOfPassenger) {
		this.numOfPassenger = numOfPassenger;
	}

	public int getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}

	public TrainDetails getTrain() {
		return train;
	}

	
	public void setTrain(TrainDetails train) {
		this.train = train;
	}
	
	@Override
	public String toString() {
		return "TicketDetails [ticketId=" + ticketId + ", ticketClass=" + ticketClass + ", source=" + source
				+ ", destination=" + destination + ", numOfPassenger=" + numOfPassenger + ", totalAmount=" + totalAmount
				+ ", train=" + train + "]";
	}


}
