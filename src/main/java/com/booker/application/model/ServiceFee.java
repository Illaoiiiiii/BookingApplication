package com.booker.application.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class ServiceFee {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int serviceFeeId;
	private float amount;
	@OneToMany
	List<TravelService> travelService;
	LocalDate date;
	
	public int getServiceFeeId() {
		return serviceFeeId;
	}
	public void setServiceFeeId(int serviceFeeId) {
		this.serviceFeeId = serviceFeeId;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public List<TravelService> getService() {
		return travelService;
	}
	public void setService(List<TravelService> travelService) {
		this.travelService = travelService;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	
}
