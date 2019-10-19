package com.icon.telephoneservice.model;

import java.io.Serializable;

public class Contact implements Serializable{

	private int id;
	private Long number;
	private String serviceProvider;
	private int planAmt;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Long getNumber() {
		return number;
	}

	public void setNumber(Long number) {
		this.number = number;
	}

	public String getServiceProvider() {
		return serviceProvider;
	}

	public void setServiceProvider(String serviceProvider) {
		this.serviceProvider = serviceProvider;
	}

	public int getPlanAmt() {
		return planAmt;
	}

	public void setPlanAmt(int planAmt) {
		this.planAmt = planAmt;
	}

	public Contact() {
		
	}
	public Contact(int id, Long number, String serviceProvider, int planAmt) {
		super();
		this.id = id;
		this.number = number;
		this.serviceProvider = serviceProvider;
		this.planAmt = planAmt;
	}

}
