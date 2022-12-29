package com.bridgelabz.addressbook;

public class Contacts {
	
	String firstName;
	String lastName;
	String city;
	String state;
	int zip;
	String address;
	
//	public Contacts(String firstName, String lastName, String city, String state, int zip, String address) {
//		super();
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.city = city;
//		this.state = state;
//		this.zip = zip;
//		this.address = address;
//	}

	
	public Contacts() {
		// TODO Auto-generated constructor stub
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Contacts [firstName=" + firstName + ", lastName=" + lastName + ", city=" + city + ", state=" + state
				+ ", zip=" + zip + ", address=" + address + "]";
	}
	
	
	
	

}
