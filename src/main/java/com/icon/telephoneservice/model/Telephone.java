package com.icon.telephoneservice.model;

import java.io.Serializable;
import java.util.Set;

public class Telephone implements Serializable {

	private int id;
	private String imiNumber;
	private String model;
	private boolean activeFlg;
	private Set<Contact> contacts;

	public Telephone() {
		
	}
	public Telephone(int id, String imiNumber, String model, boolean activeFlg, Set<Contact> contacts) {
		super();
		this.id = id;
		this.imiNumber = imiNumber;
		this.model = model;
		this.activeFlg = activeFlg;
		this.contacts = contacts;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getImiNumber() {
		return imiNumber;
	}

	public void setImiNumber(String imiNumber) {
		this.imiNumber = imiNumber;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public boolean isActiveFlg() {
		return activeFlg;
	}

	public void setActiveFlg(boolean activeFlg) {
		this.activeFlg = activeFlg;
	}

	public Set<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(Set<Contact> contacts) {
		this.contacts = contacts;
	}

}
