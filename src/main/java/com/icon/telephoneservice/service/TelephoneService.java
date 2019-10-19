package com.icon.telephoneservice.service;

import java.util.Set;

import com.icon.telephoneservice.model.Telephone;

public interface TelephoneService {

	public Set<Telephone> getAllTelephoneDetails();
	
	public Telephone getTelephoneDetailsById(int id);
	
	public void saveTelephone(Telephone telephone);
	
	public void updateTelephone(Telephone telephone);
	
	
}
