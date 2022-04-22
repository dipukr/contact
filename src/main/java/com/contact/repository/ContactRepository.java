package com.contact.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.contact.entity.Contact;

@Repository
public class ContactRepository {

	@Autowired
	private SessionFactory sf;
	
	public void save(Contact contact) {
		Session session = sf.openSession();
		session.beginTransaction();
		session.save(contact);
		session.getTransaction().commit();
		session.close();
	}
	
	public List<Contact> findAll() {
		Session session = sf.openSession();
		session.beginTransaction();
		@SuppressWarnings("unchecked")
		List<Contact> contacts = session.createQuery("from Contact").list();
		session.getTransaction().commit();
		session.close();
		return contacts;
	}
	
	public Contact findById(int id) {
		Session session = sf.openSession();
		session.beginTransaction();
		Contact contact = session.get(Contact.class, id);
		session.getTransaction().commit();
		session.close();
		return contact;
	}
	
	public void update(Contact contact) {
		Session session = sf.openSession();
		session.beginTransaction();
		session.saveOrUpdate(contact);
		session.getTransaction().commit();
		session.close();
	}
	
	public void deleteById(int id) {
		Session session = sf.openSession();
		session.beginTransaction();
		Contact contact = session.get(Contact.class, id);
		session.delete(contact);
		session.getTransaction().commit();
		session.close();
	}
}
