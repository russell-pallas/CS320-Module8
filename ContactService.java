package conctact;

import java.util.ArrayList;
import java.util.Random;

public class ContactService {
	
	private String id;
	private String firstName;
	private String lastName;
	private String phone; 
	private String address;
	
	
	
	ArrayList<Contact> contacts = new ArrayList<> ();
    ArrayList<String> ids = new ArrayList<>();
	
	public void addContact(String first, String last, String phone, String address) {  //adds contact using Contact constructor
		Random rand = new Random();
		int intId = rand.nextInt(999999999);
        String id = String.valueOf(intId);
        Contact newContact = new Contact(id, "Russ", "Pallas", "6032891687", "1637 Union");
        contacts.add(newContact);
        ids.add(id);
	}
	
	public String getCSids() {
		return ids.get(0);
	}
	
	public void removeContact(String id) { //removes contact based off id
		for (int i = 0; i < contacts.size(); i++) {
			if (contacts.get(i).equals(id)) {
				contacts.remove(i);
			}
		}
	}
	
	public void update(String id, String first, String last, String phone, String address) {
		for (int i = 0; i < contacts.size(); i++) {
			if (contacts.get(i).getId().equals(id)) {
				contacts.get(i).setFirstName(first);
				contacts.get(i).setLastName(last);
				contacts.get(i).setPhone(phone);
				contacts.get(i).setAddress(address);
			}
		}
	}
}
  







