package chapter14.programmingProjects;

public class Contact implements Cloneable {
	
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String emailAddress;
	
	public Contact() {
		
		this.firstName = null;
		this.lastName = null;
		this.phoneNumber = null;
		this.emailAddress = null;
	}
	
	public Contact(Contact copyContact){
		
		this.firstName = copyContact.firstName;
		this.lastName = copyContact.lastName;
		this.phoneNumber = copyContact.phoneNumber;
		this.emailAddress = copyContact.emailAddress;
	}
	
	public Contact(String firstName, String lastName, 
			String phoneNumber, String email){
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.emailAddress = email;
		
	}
	
	
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	@Override
	public boolean equals(Object obj) {
		
		if (obj == null){
			return false;
		}
		else if (this.getClass() != obj.getClass()){
			return false;
		}
		else{
			Contact otherContact = (Contact) obj;
			return (this.firstName.equalsIgnoreCase(otherContact.firstName)
					&& this.lastName.equalsIgnoreCase(otherContact.lastName)
					&& this.phoneNumber == otherContact.phoneNumber
					&& this.emailAddress.equalsIgnoreCase(otherContact.emailAddress));
		}
	}
	
	@Override
	public String toString() {
		return ("First name: " + this.firstName + "\n" 
				+ "Last name: " + this.lastName + "\n"
				+ "Phone Number: " + this.phoneNumber + "\n"
				+ "Email Address: " + this.emailAddress + "\n");
	}
	

	@Override
	public Object clone() throws CloneNotSupportedException {
		
		return new Contact(this);
	}
	

}
