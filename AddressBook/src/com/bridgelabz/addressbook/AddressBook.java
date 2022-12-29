package com.bridgelabz.addressbook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class AddressBook {

	ArrayList<Contacts> contactList = new ArrayList<Contacts>();

	HashMap<String, ArrayList<Contacts>> addressBook = new HashMap<String, ArrayList<Contacts>>();

	// AddressBook book = new AddressBook();

	public AddressBook() {
		// TODO Auto-generated constructor stub
	}

	public void addContact() {
		Contacts contact = new Contacts();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first name");
		contact.setFirstName(scanner.next());
		System.out.println("Enter the last name");
		contact.setLastName(scanner.next());
		System.out.println("Enter the city name");
		contact.setCity(scanner.next());
		System.out.println("Enter the state name");
		scanner.next();
		System.out.println("Enter the zip ");
		contact.setZip(scanner.nextInt());
		System.out.println("Enter the address ");
		contact.setAddress(scanner.next());

		contactList.add(contact);

		System.out.println("Enter the book name you want to add contact");
		String bookName = scanner.next();

		if (addressBook.containsKey(bookName)) {
			ArrayList<Contacts> contactList = addressBook.get(bookName);
			addressBook.put(bookName, contactList);
			System.out.println("new contact added to the bookName");

		} else {
			ArrayList<Contacts> contactList = addressBook.get(bookName);
			addressBook.put(bookName, contactList);
			System.out.println(bookName + "created");
			System.out.println("new Contact added to the bookName:" + bookName);

		}

	}

	void editContact() {

		Scanner scanner = new Scanner(System.in);

		if (contactList.size() > 0) {

			String newFirstName;
			System.out.println("Enter First name of contact to edit it ");
			newFirstName = scanner.next();
			for (int i = 0; i < contactList.size(); i++) {
				if (contactList.get(i).getFirstName().equals(newFirstName)) {
					System.out.println(
							"Enter the field to edit:\n1.First Name\n2.Last Name\n3.Address\n4.city\n5.State\n6.Zip\n7.Address");
					int input = scanner.nextInt();
					switch (input) {
					case 1:
						System.out.println("Enter new first name");
						contactList.get(i).setFirstName(scanner.next());
						break;
					case 2:
						System.out.println("Enter new last name");
						contactList.get(i).setLastName(scanner.next());
						break;
					case 3:
						System.out.println("Enter new Address");
						contactList.get(i).setAddress(scanner.next());
						break;
					case 4:
						System.out.println("Enter new city");
						contactList.get(i).setCity(scanner.next());
						break;
					case 5:
						System.out.println("Enter new state");
						contactList.get(i).setState(scanner.next());
						break;
					case 6:
						System.out.println("Enter new zip");
						contactList.get(i).setZip(scanner.nextInt());
						break;
					case 7:
						System.out.println("Enter new Address");
						contactList.get(i).setAddress(scanner.next());
						break;
					default:
						System.out.println("Invalid Entry");
					}
					System.out.println("Contact Edited Successfully");
				} else
					System.out.println("Contact doesn't exist");
			}
		} else
			System.out.println("There are no contacts as of now.....");
	}

	public void deleteContact() {

		Scanner scanner = new Scanner(System.in);

		if (contactList.size() > 0) {
			System.out.println("Enter the firstName of the contact which you want to delete ");
			String delName = scanner.next();
			for (int i = 0; i < contactList.size(); i++) {
				if (contactList.get(i).getFirstName().equals(delName)) {
					Contacts contact = contactList.get(i);
					contactList.remove(contact);
					System.out.println("Contact deleted Successfully...");
					break;
				} else
					System.out.println("Contact not found.... ");
			}
		} else
			System.out.println("There are no contacts as of now ......");

	}

	public void displayList() {
			{	if( contactList.size()>0) {
				for (Contacts iterator : contactList)
				{
					System.out.println(iterator);
				}
			}else System.out.println("There are no contacts here as of now .....");
			}
		

}
}
