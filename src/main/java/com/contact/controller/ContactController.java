package com.contact.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.contact.entity.Contact;
import com.contact.service.ContactService;

@Controller
public class ContactController {
	
	@Autowired
	private ContactService contactService;
	
	@GetMapping("/new")
	public String viewMainPage() {
		return "index.jsp";
	}
	
	@PostMapping("/saveContact")
	public String saveContact(@ModelAttribute("contact") Contact contact, ModelMap map) {
		contactService.saveContact(contact);
		map.addAttribute("msg", "Contact is saved successfully");
		return "index.jsp";
	}
	
	@GetMapping("/findAll")
	public String findAll(ModelMap map) {
		List<Contact> contacts = contactService.findAll();
		map.addAttribute("contacts", contacts);
		return "render.jsp";
	}
	
	@GetMapping("/delete")
	public String deleteStudent(@RequestParam("id") int id, ModelMap map) {
		contactService.deleteContact(id);
		List<Contact> contacts = contactService.findAll();
		map.addAttribute("contacts", contacts);
		return "render.jsp";
	}
	
	@GetMapping("/update")
	public String updateStudent(@RequestParam("id") int id, ModelMap map) {
		Contact contact = contactService.getContact(id);
		map.addAttribute("contact", contact);
		return "update.jsp";
	}
	
	@PostMapping("/updateContact")
	public String updateContact(@ModelAttribute("contact") Contact contact, ModelMap map) {
		contactService.updateContact(contact);
		List<Contact> contacts = contactService.findAll();
		map.addAttribute("contacts", contacts);
		return "render.jsp";
	}
}
