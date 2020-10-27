package com.bridgelabz.addressbook_main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBookSystem {
	
	static Scanner input = new Scanner (System.in);
	
	static Map<String, HashMap<String, Record>> addressBookStore = new HashMap<String, HashMap<String, Record>>();
	
	//Main method
	public static void main(String[] args) 
	{
		System.out.println("Welcome to address book system program");
		
		while (true)
		{
			System.out.println("Select an option\n"+
					  "Enter 1 to edit a record\n"+
					  "Enter 2 to delete a record\n"+
					  "Enter 3 to add new record\n"+
					  "Enter 4 to exit");
			int response = input.nextInt();
			
			switch (response)
			{
				case 1: System.out.println("Enter the name fo the address book you want to edit\n"
						+ "and then Enter the first name of the person whose record you want to edit");
						String bookToEdit = input.next();
						String recordNameToEdit = input.next();
						Utilities.editRecord(recordNameToEdit,bookToEdit);
						break;
				case 2: System.out.println("Enter name of the address book you want to delete record in\n"
						+ "and then Enter first name of the person whose record you want to delete");
						String bookToDeleteIn = input.next();
						String recordNameToDelete = input.next();
						Utilities.deleteRecord(recordNameToDelete,bookToDeleteIn);
				 		break;
				case 3: System.out.println("Enter name of the address book in which you want to add record");
				 		String addressBookName = input.next();
				 		Utilities.addAddressBook(addressBookName);
				 		break;
				case 4: System.exit(0);
			}
		}
	}

	
	
}
