package com.bridgelabz.addressbook_main;

public class Record {

	String firstName;
	String lastName;
	String address;
	String city;
	String state;
	String email;
	int zip;
	long phoneNumber;
	
	//Constructor
	public Record (String firstname, String lastName, String address, String city, String state, String email, int zip, long phoneNumber) 
	{
		this.firstName = firstname;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.email = email;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
	}


	public boolean equals(Record record)
	{
		if (this.firstName.equals(record.firstName) && this.lastName.equals(record.lastName))
			return true;
		else
			return false;
	}
}
