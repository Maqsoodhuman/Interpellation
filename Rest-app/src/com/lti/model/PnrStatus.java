package com.lti.model;

import java.time.LocalDate;
import java.util.List;

public class PnrStatus {
	
	private int pnrNo;
	private int trainNO;
	private LocalDate travelDate;
	
	public int getPnrNo() {
		return pnrNo;
	}

	public void setPnrNo(int pnrNo) {
		this.pnrNo = pnrNo;
	}

	public int getTrainNO() {
		return trainNO;
	}

	public List<Passenger> getPassengers() {
		return passengers;
	}

	public void setPassengers(List<Passenger> passengers) {
		this.passengers = passengers;
	}

	public void setTrainNO(int trainNO) {
		this.trainNO = trainNO;
	}

	public LocalDate getTravelDate() {
		return travelDate;
	}

	public void setTravelDate(LocalDate travelDate) {
		this.travelDate = travelDate;
	}

	private List<Passenger> passengers;
	

}
