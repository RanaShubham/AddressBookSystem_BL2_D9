package com.bridgelabz.addressbook_main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Utilities {

	static Scanner input = new Scanner (System.in);
		
//Initializing a new book if not present already
	static void addAddressBook(String book) 
	{
		if (!AddressBookSystem.addressBookStore.containsKey(book))
			AddressBookSystem.addressBookStore.put(book, new HashMap<String, Record>());
		
		collectDetails(book);
	}

	//Asking user for details of the record to be added
	static void collectDetails(String book)
	{
		while(true)
		{
		System.out.println("Enter details of one user in following order"
				+ "\n1. First Name"
				+ "\n2. Last Name"
				+ "\n3. Address"
				+ "\n4. City"
				+ "\n5. State"
				+ "\n6. email"
				+ "\n7. Pincode"
				+ "\n8. Phone number");
						
			String firstName = input.next();
			String lastName = input.next();
			String address = input.next();
			String city = input.next();
			String state = input.next();
			String email = input.next();
			int pin = input.nextInt();
			long phoneNumber = input.nextLong();
	
			addRecord(AddressBookSystem.addressBookStore.get(book), book, firstName, lastName, address, city, state, email, pin, phoneNumber);
			
			System.out.println("Enter y to add one more person record. Otherwise enter n.");
			String response = input.next();
			
			if (response.equals("n"))
				break;
		}
	}
	
	
	//Adding person details into address book.
	static void addRecord(Map<String,Record> book, String bookName, String firstName, String lastName, String address, String city, String state, String email, int pin, long phoneNumber)
	{
		Record newRecord = new Record(firstName, lastName, address, city, state, email, pin, phoneNumber);
		try 
		{
			if (book.get(firstName+lastName).equals(newRecord))
			{
					System.out.println("Record already exists in address book "+bookName);
			}
			else
			{
				book.put(firstName+lastName, newRecord);
				System.out.println("Record added to address book "+bookName);
			}
		} catch (NullPointerException e) 
		{
			book.put(firstName+lastName, newRecord);
			System.out.println("New address book "+bookName+" created and record added");
		}
	}
	
	//Deleting a record using first name
	static void deleteRecord(String nameToDelete, String bookToDeleteIn) 
	{
		AddressBookSystem.addressBookStore.get(bookToDeleteIn).remove(nameToDelete);
	}
	
	//Editing a record using first name
	static void editRecord(String nameToEdit, String bookToEdit)
	{
		Record record = (Record) AddressBookSystem.addressBookStore.get(bookToEdit).get(nameToEdit);
		
		System.out.println("Pick a feild to edit"+
				"Enter 1 to edit firstName\n" + 
				"Enter 2 to edit lastName\n" + 
				"Enter 3 to edit address\n" + 
				"Enter 4 to edit city\n" + 
				"Enter 5 to edit state\n" + 
				"Enter 6 to edit email\n" +
				"Enter 7 to edit pin\n" +
				"Enter 8 to edit phoneNumber");
		
		int response = input.nextInt();
		
		switch(response)
		{
			case 1: Utilities.editFirstname(record);
					break;
			case 2: Utilities.editLastname(record);
					break;
			case 3: Utilities.editAddress(record);
					break;
			case 4: Utilities.editCity(record);
					break;
			case 5: Utilities.editState(record);
					break;
			case 6: Utilities.editEmail(record);
					break;
			case 7: Utilities.editPin(record);
					break;
			case 8: Utilities.editPhoneNumber(record);
					break;
		}
	}
	
	//To change pin of existing record
	public static void editPin(Record recordToEdit) 
	{
		System.out.println("Enter new zip number");
		int response = input.nextInt();
		
		recordToEdit.zip = response;		
	}

	//To change last name of existing record
	public static void editLastname(Record recordToEdit) 
	{
		System.out.println("Enter new last name");
		String response = input.next();
		
		recordToEdit.lastName = response;
	}

	//To change phone number of existing record
	public static void editPhoneNumber(Record recordToEdit) 
	{
		System.out.println("Enter new phone number");
		long response = input.nextLong();
		
		recordToEdit.phoneNumber = response;
	}

	//To change email of existing record
	public static void editEmail(Record recordToEdit) 
	{
		System.out.println("Enter new email");
		String response = input.next();
		
		recordToEdit.email = response;
	}

	//To change state name of existing record
	public static void editState(Record recordToEdit) 
	{
		System.out.println("Enter new state");
		String response = input.next();
		
		recordToEdit.state = response;		
	}

	//To change city name of existing record
	public static void editCity(Record recordToEdit) 
	{

		System.out.println("Enter new city");
		String response = input.next();
		
		recordToEdit.city = response;
	}

	//To change address of existing record
	public static void editAddress(Record recordToEdit) 
	{
		System.out.println("Enter new address");
		String response = input.next();
		
		recordToEdit.address = response;		
	}

	//To change first name of existing record
	public static void editFirstname(Record recordToEdit) 
	{
		System.out.println("Enter new firstName");
		String response = input.next();
		
		recordToEdit.firstName = response;
	}
	
}

