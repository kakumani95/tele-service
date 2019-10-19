package com.icon.telephoneservice.utils;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.icon.telephoneservice.model.Contact;
import com.icon.telephoneservice.model.Telephone;

@Component
public class TelephonoUtils {
	static Set<Telephone> telephoneSet = new HashSet<>();

	public static Set<Telephone> getTelephoneDetails() {
		Contact con1 = new Contact(1, 9959902682L, "airtel", 199);
		Contact con2 = new Contact(2, 7286048359L, "jio", 399);
		Set<Contact> contacts = new HashSet<Contact>();
		contacts.add(con1);
		contacts.add(con2);

		Telephone telephone = new Telephone();
		telephone.setId(1);
		telephone.setImiNumber("37589755345457385");
		telephone.setActiveFlg(Boolean.TRUE);
		telephone.setModel("k20 pro");
		telephone.setContacts(contacts);

		telephoneSet.add(telephone);
		return telephoneSet;
	}

	public void saveTelephone(Telephone telephone) {
		telephoneSet.add(telephone);
	}

	public void updateTelephone(Telephone telephone) {
		telephoneSet = telephoneSet.stream().filter(t -> t.getId() != telephone.getId()).collect(Collectors.toSet());
		telephoneSet.add(telephone);
	}

	public static void main(String[] args) {

	}
}
