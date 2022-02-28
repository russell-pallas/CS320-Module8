package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Random;

import org.junit.jupiter.api.Test;

import conctact.Contact;
import conctact.ContactService;

class ContactServiceTest {
	private String id;
	private String first;
	private String last;
	private String phone;
	private String address;
	
	ArrayList <Contact> contacts = new ArrayList<> ();
    ArrayList<String> ids = new ArrayList<>();
	
	
	@Test
	void AddContactTest() {
		ContactService newContactService = new ContactService();
		newContactService.addContact("Russ", "Pallas", "6032891687", "1637 Union");
	}
	
	@Test
	void removeTest() {
		ContactService newCS = new ContactService();
		newCS.addContact("Russ", "Pallas", "6032891687", "1637 Union");
		newCS.removeContact(newCS.getCSids());
	}
	
	@Test
	void updateTest() {
		ContactService newCS = new ContactService();
		newCS.addContact("Russ", "pallas", "6032891687", "1637 Union");
		newCS.update(newCS.getCSids(), "Bob", "Pallas", "1234567890", "3369 Gregory");
	}
}
