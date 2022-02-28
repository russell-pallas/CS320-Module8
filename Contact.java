package conctact;

public class Contact {

	private String id;
	private String firstName;
	private String lastName;
	private String phone; 
	private String address;
	
	public Contact() {
	}
	
	public Contact(String id, String firstName, String lastName, String phone, String address) {
		setId(id);
		setFirstName(firstName);
		setLastName(lastName);
		setPhone(phone);
		setAddress(address);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		if (id == null || id.length() > 10) {
			throw new IllegalArgumentException("Invalid contact id");
		}
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		if (firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid first name");
		}
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid last name");
		}
		this.lastName = lastName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		if (phone == null || phone.length() != 10) {
			throw new IllegalArgumentException("Invalid phone number"); 
		}
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		if (address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid address");
		}
		this.address = address;
	}
	
	
}
 