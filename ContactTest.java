package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import conctact.Contact;

class ContactTest { 

	@Test
	void testContactClass() {
		Contact contact = new Contact("123", "Russ", "Pallas", "6032891687", "1637 Union");
		assertTrue(contact.getId().equals("123"));
		assertTrue(contact.getFirstName().equals("Russ"));
		assertTrue(contact.getLastName().equals("Pallas"));
		assertTrue(contact.getPhone().equals("6032891687"));
		assertTrue(contact.getAddress().equals("1637 Union"));
	}
	
	@Test
	void testContactIdTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345678900", "Russ", "Pallas", "6032891687", "1637 Union");
		});
	}
	
	@Test
	void testContactFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", "RussellPallas", "Pallas", "6032891687", "1637 Union");
		});
	}
	
	@Test
	void testContactLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345678900", "Russ", "RussellllllPallas", "6032891687", "1637 Union");
		});
	}
	
	@Test
	void testContactPhoneTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", "Russ", "Pallas", "603289168700", "1637 Union");
		});
	}
	
	@Test
	void testContactAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", "Russ", "Pallas", "6032891687", "1637 Union Street Manchester, New Hampshire");
		});
	}
	
	
	@Test
	void testContactIdIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "Russ", "Pallas", "6032891687", "1637 Union");
		});
	}
	
	@Test
	void testContactFirstNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", null, "Pallas", "6032891687", "1637 Union");
		});
	}
	
	@Test
	void testContactLastNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", "Russ", null, "6032891687", "1637 Union");
		});
	}
	
	@Test
	void testContactPhoneIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", "Russ", "Pallas", null, "1637 Union");
		});
	}
	
	@Test
	void testContactAddressIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", "Russ", "Pallas", "6032891687", null);
		});
	}	
}
