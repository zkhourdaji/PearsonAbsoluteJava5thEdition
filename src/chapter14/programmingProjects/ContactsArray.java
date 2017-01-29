package chapter14.programmingProjects;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactsArray {

	private ArrayList<Contact> contacts;

	public ContactsArray() {
		this.contacts = new ArrayList<Contact>();
	}

	public ContactsArray(ArrayList<Contact> contacts){
		this.contacts = contacts;
	}

	// must return a deep copy
	public ContactsArray(ContactsArray copyContactsArray){

		this();

		for (Contact contact : copyContactsArray.contacts) {
			// deep copy
			this.contacts.add(new Contact(contact));
		}

	}

	public boolean addContact(Contact contact){

		if (this.contacts.add(contact)){
			return true;
		}
		return false;
	}

	public boolean deleteContact(Contact contact){

		if (this.searchForContact(contact) != null){
			if (this.contacts.remove(contact)){
				return true;
			}
			return false;
		}
		System.out.println("Contact doesnt exist: " + contact);
		return false;

	}

	public Contact searchForContact(Contact contact){

		if (this.contacts.contains(contact)){
			return contact;
		}
		return null;
	}
	
	public Contact searchByKeyword(String keyword){
		
		String keywordLowerCase = keyword.toLowerCase();
		
		for (Contact contact : this.contacts) {
			
			/*
			 * Checks to see if any contact contains the keyword
			 * regardless if its in the first name, last name, number or email
			 */
			if (contact.getFirstName().toLowerCase().contains(keywordLowerCase)
					|| contact.getLastName().toLowerCase().contains(keywordLowerCase)
					|| contact.getPhoneNumber().toLowerCase().contains(keywordLowerCase)
					|| contact.getEmailAddress().toLowerCase().contains(keywordLowerCase)){
				return contact;
			}
		}
		//System.out.println("Keyword not found: " + keyword);
		return null;
	}

	public void displayAllContacts(){
		System.out.println(this.toString());
	}


	public ArrayList<Contact> getContacts() {
		return new ContactsArray(this).contacts;
	}

	public void presentMenu(){

		Scanner keyboard = new Scanner(System.in);
		String keyword = null;
		
	
		while (true){
			
			System.out.println();
			System.out.println("What would you like to do?");
			System.out.println("--------------------------");

			System.out.println("1) Add a contact.");
			System.out.println("2) Display all contacts.");
			System.out.println("3) Search for a contact");
			System.out.println("4) Delete a contact.");

			int choice = keyboard.nextInt();

			switch (choice) {

			case 1:
				System.out.println("Type in the first name followed by the last name"
						+ " phone number and email address. Only use white space between them");
				// no data validation is being done, will through a runtime exception if data is bad
				this.addContact(new Contact(keyboard.next(), keyboard.next(), 
						keyboard.next(), keyboard.next()));
				System.out.println("Contact added!");
				break;	

			case 2:
				this.displayAllContacts();
				break;

			case 3:
				System.out.println("Type in a keyword to search for...");
				keyword = keyboard.next();
				
				if (this.searchByKeyword(keyword) != null){
					System.out.println("Contct found: ");
					System.out.println();
					System.out.println(this.searchByKeyword(keyword));
				}
				else{
					System.out.println("Keyword not found: " + keyword);
					System.out.println();
				}
				
				break;
				
			case 4:
				System.out.println("Type in a keyword to delete a contact...");
				keyword = keyboard.next();
				
				if (this.searchByKeyword(keyword) != null){
					Contact deleted = searchByKeyword(keyword);
					if (this.deleteContact(deleted)){
						System.out.println("Contact deleted!");
						System.out.println();
						System.out.println(deleted.toString());
					}
				}
				else{
					System.out.println("Keyword not found: " + keyword);
				}
				
						
				break;

			default:
				System.out.println("Invalid choice.");
				break;
			}
		}
	}

	@Override
	public String toString() {

		String returnedString = "";

		for (Contact contact : this.contacts) {
			returnedString += contact.toString();
		}

		return returnedString;
	}



}
