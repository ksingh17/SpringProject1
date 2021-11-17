package com.rapipay.ticket.bean;

import org.springframework.stereotype.Component;


public class TrainDetails {

	
	private int trainNumber;
	private String trainName;
	private String source;
	private String destination;


	public TrainDetails() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getTrainNumber() {
		return trainNumber;
	}

	public void setTrainNumber(int trainNumber) {
		this.trainNumber = trainNumber;
	}

	public String getTrainName() {
		return trainName;
	}

	public void setTrainName(String trainName) {
		this.trainName = trainName;
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


	@Override
	public String toString() {
		return "TrainDetails [trainNumber=" + trainNumber + ", trainName=" + trainName + ", source=" + source
				+ ", destination=" + destination + "]";
	}
	
	

}
