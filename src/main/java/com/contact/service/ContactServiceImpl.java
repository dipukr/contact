package com.contact.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.contact.entity.Contact;
import com.contact.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactRepository contactRepository;
	
	public void saveContact(Contact contact) {
		contactRepository.save(contact);
	}

	public List<Contact> findAll() {
		List<Contact> contacts = contactRepository.findAll();
		return contacts;
	}

	public void deleteContact(int id) {
		contactRepository.deleteById(id);
	}

	public Contact getContact(int id) {
		Contact contact = contactRepository.findById(id);
		return contact;
	}

	public void updateContact(Contact contact) {
		contactRepository.update(contact);		
	}
}
