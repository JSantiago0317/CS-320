//Author Name: Jonathan Santiago

//Date: 8/3/22

//Course: CS-320

//Description: JUnit tests for contact service class

package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import contactService.Contact;
import contactService.ContactService;

class ContactServiceTest {
	
	//Test for add functionality
	@Test
	void testAdd() 
	{
		ContactService testService = new ContactService();
		
		Contact test1 = new Contact("2547934","Jonathan", "Santiago", "1234567890", "123 ABC NY, NY");
		Contact test2 = new Contact("2547935","Ashleigh", "Santiago", "1234567890", "123 ABC NY, NY");
		Contact test3 = new Contact("2547934","Asher", "Santiago", "1234567890", "123 ABC NY, NY");
		
		assertEquals(true, testService.addContact(test1));
		assertEquals(true, testService.addContact(test2));
		assertEquals(false, testService.addContact(test3));
	}
	
	//Test for delete functionality
	@Test
	void testDelete()
	{
		ContactService testService = new ContactService();
		
		Contact test1 = new Contact("2547934","Jonathan", "Santiago", "1234567890", "123 ABC NY, NY");
		Contact test2 = new Contact("2547935","Ashleigh", "Santiago", "1234567890", "123 ABC NY, NY");
		
		testService.addContact(test1);
		testService.addContact(test2);
		
		assertEquals(true, testService.deleteContact(test1));
		assertEquals(true, testService.deleteContact(test2));
		
		assertEquals(false, testService.deleteContact(test1));
	}
	
	//Test for update functionality
	@Test
	void testUpdateContact()
	{
		ContactService testService = new ContactService();
		
		Contact test1 = new Contact("2547934","Jonathan", "Santiago", "1234567890", "123 ABC NY, NY");
		Contact test2 = new Contact("2547935","Ashleigh", "Santiago", "1234567890", "123 ABC NY, NY");
		
		testService.addContact(test1);
		
		assertEquals(true, testService.updateContact(test1, "first name", "Asher"));
		assertEquals(true, testService.updateContact(test1, "last name", "Rashid"));
		assertEquals(true, testService.updateContact(test1, "phone number", "0987654321"));
		assertEquals(true, testService.updateContact(test1, "address", "234 ABC NY, NY"));
		
		assertEquals(false, testService.updateContact(test2, "This contact is not the list", "So this should return false"));
		
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			testService.updateContact(test1, "this field doesn't exist", "this test should throw exception");
		});
	}
	
	//Test for printing contact info
	@Test
	void testPrintContacts()
	{
		ContactService testService = new ContactService();
		
		Contact test1 = new Contact("2547934","Jonathan", "Santiago", "1234567890", "123 ABC NY, NY");
		
		testService.addContact(test1);
		
		assertEquals(true, testService.printContacts());
	}

}
