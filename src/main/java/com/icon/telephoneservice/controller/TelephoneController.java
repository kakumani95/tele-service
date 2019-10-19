package com.icon.telephoneservice.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.icon.telephoneservice.model.Telephone;
import com.icon.telephoneservice.service.impl.TelephoneServiceImpl;

@RestController
public class TelephoneController {

	@Autowired
	TelephoneServiceImpl telephoneService;

	@GetMapping("/telephones")
	public Set<Telephone> getTelephoneDetails() {
		return telephoneService.getAllTelephoneDetails();
	}

	@GetMapping("/telephone")
	public Telephone getTelephoneDetails(@RequestParam("Id") String val) {
		Telephone telephone = telephoneService.getTelephoneDetailsById(Integer.parseInt(val));
		return telephone;
	}

	@PostMapping("/telephone")
	public String saveTelephoneDetails(@RequestBody Telephone telephone) {
		telephoneService.saveTelephone(telephone);
		return "Saved..!";
	}
	
	@PutMapping("/telephone")
	public String updateTelephone(@RequestBody Telephone telephone) {
		telephoneService.updateTelephone(telephone);
		return "Updated..!";
	}
}
