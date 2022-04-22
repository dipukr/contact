package com.contact.service;

import java.util.List;
import com.contact.entity.Contact;

public interface ContactService {
	public void saveContact(Contact contact);
	public List<Contact> findAll();
	public void updateContact(Contact contact);
	public void deleteContact(int id);
	public Contact getContact(int id);
}
