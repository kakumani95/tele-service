package com.icon.telephoneservice.service.impl;

import java.util.Set;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.icon.telephoneservice.model.Telephone;
import com.icon.telephoneservice.service.TelephoneService;
import com.icon.telephoneservice.utils.TelephonoUtils;

@Service
public class TelephoneServiceImpl implements TelephoneService {

	@Resource
	private TelephonoUtils telephoneUtils;

	@Override
	public Set<Telephone> getAllTelephoneDetails() {
		return TelephonoUtils.getTelephoneDetails();
	}

	@Override
	public Telephone getTelephoneDetailsById(int id) {
		return TelephonoUtils.getTelephoneDetails().stream().filter(t -> t.getId() == id).findAny().orElse(null);
	}

	@Override
	public void saveTelephone(Telephone telephone) {
		telephoneUtils.saveTelephone(telephone);
	}

	@Override
	public void updateTelephone(Telephone telephone) {
		telephoneUtils.updateTelephone(telephone);
	}

	
}
