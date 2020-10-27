package com.bridgelabz.addressbook_main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBookSystem {
	
	static Scanner input = new Scanner (System.in);
	
	static Map<String, ArrayList< Record>> addressBookStore = new HashMap<String, ArrayList< Record>>();
	
	//Main method
	public static void main(String[] args) 
	{
		System.out.println("Welcome to address book system program");
		
		while (true)
		{
			System.out.println("Select an option\n"+
							  "Enter 1 to add a record\n"+
							  "Enter 2 to delete a record\n"+
							  "Enter 3 to edit a record\n"+
							  "Enter 4 to search for a record by city or state\n"+
							  "Enter 5 to exit");
			
			int response = input.nextInt();
			
			switch (response)
			{
				case 1:	System.out.println("Enter name of the address book in which you want to add record.");
				 		String addressBookName = input.next();
				 		Utilities.addAddressBook(addressBookName);
				 		break;
						
				case 2: System.out.println("Enter name of the address book you want to delete record in.");
						String bookToDeleteIn = input.next();
						System.out.println("Enter first name of the person whose record you want to delete.");
						String recordNameToDelete = input.next();
						Utilities.deleteRecord(recordNameToDelete,bookToDeleteIn);
				 		break;
				 		
				case 3: System.out.println("Enter the name fo the address book you want to edit.");
						String bookToEdit = input.next();
						System.out.println("Enter the first name of the person whose record you want to edit.");
						String recordNameToEdit = input.next();
						Utilities.editRecord(recordNameToEdit,bookToEdit);
						break;
				 		
				case 4: System.out.println("Enter name of city or state to search in");
						String toSearch = input.next();
						Utilities.searchByCityOrState(toSearch);
						break;
						
				default : System.exit(0);
			}
		}
	}	
}
