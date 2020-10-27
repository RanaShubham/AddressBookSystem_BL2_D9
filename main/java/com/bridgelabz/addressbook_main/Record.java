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

	//Returns true if two records have same first name and last name
	public boolean equals(Record record)
	{
		if (this.firstName.equals(record.firstName) && this.lastName.equals(record.lastName))
			return true;
		else
			return false;
	}
	
	public String toString()
	{
		String recordToPrint = "[ Name- "+this.firstName+" "+this.lastName+" Address-"+this.address+" City-"+this.city+" State-" +this.state+" Email-"+this.email+" Zip-"+this.zip+" PhoneNumber-"+this.phoneNumber+" ]";
		return recordToPrint;
		
	}
}
