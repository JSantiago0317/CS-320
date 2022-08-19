//Author Name: Jonathan Santiago

//Date: 8/3/22

//Course: CS-320

//Description: Contact service class. Used to locally maintain a list of contact objects. Can perform CRUD operations.

package contactService;

import java.util.ArrayList;

//Rough draft of contact service class (functionality is not final and is subject to change)
public class ContactService 
{
	//List to hold contacts
	private ArrayList<Contact> contactList;
	
	public ContactService()
	{
		//Makes phone book for user
		contactList = new ArrayList<>();
	}
	
	//Add contact function
	public boolean addContact(Contact newContact)
	{
		boolean contactAlready= false;
		
		//Iterates through list
		for (Contact contactIterator:contactList)
		{
			//Check if contact already exists
			if (contactIterator.getContactID().equals(newContact.getContactID()))
			{
				contactAlready = true;
			}
		}
		
		//Adds contact if not found
		if (!contactAlready)
		{
			contactList.add(newContact);
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//Delete contact function that takes ID as argument
	public boolean deleteContact(Contact contact)
	{
		boolean deletedAlready = true;
		
		//Iterates through task list
		for (Contact contactIterator:contactList)
		{
			//Checks to see if ID is already deleted
			if (contactIterator.getContactID().equals(contact.getContactID()))
			{
				deletedAlready = false;
			}
		}
		
		//Deletes if found
		if (!deletedAlready)
		{
			contactList.remove(contact);
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//Updates contact that takes new values as argument
	public boolean updateContact(Contact contact, String updateField, String updateValue)
	{
		//Iterates through contacts
		for (Contact contactIterator:contactList)
		{
			//checks for contact ID in list
			if (contactIterator.getContactID().equals(contact.getContactID()))
			{
				//Switch statement for field to update
				switch(updateField.toLowerCase())
				{
					case "first name":
						contact.setFirstName(updateValue);
						return true;
						
					case "last name":
						contact.setLastName(updateValue);
						return true;
					case "phone number":
						contact.setPhoneNumber(updateValue);
						return true;
					case "address":
						contact.setAddress(updateValue);
						return true;
					default:
						//Throws exception for invalid field
						throw new IllegalArgumentException("Invalid input");
				}
			}
		}
		return false;
	}
	
	//Prints contacts in list
	public boolean printContacts()
	{
		//Iterates through list
		for (Contact contact:contactList)
		{
			//Prints info of found tasks
			System.out.println(contact.toString() + "\n");
		}
		return true;
	}
}