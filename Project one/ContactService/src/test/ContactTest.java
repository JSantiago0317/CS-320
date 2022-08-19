//Author Name: Jonathan Santiago

//Date: 8/3/22

//Course: CS-320

//Description: JUnit tests for contact class.

package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import contactService.Contact;

//Test class for contact
class ContactTest {

	//Test for super constructor
	@Test
	void testContact() {
		Contact test = new Contact("2547934","Jonathan", "Santiago", "1234567890", "123 ABC NY, NY");
		assertTrue(test.getContactID().equals("2547934"));
		assertTrue(test.getFirstName().equals("Jonathan"));
		assertTrue(test.getLastName().equals("Santiago"));
		assertTrue(test.getPhoneNumber().equals("1234567890"));
		assertTrue(test.getAddress().equals("123 ABC NY, NY"));
	}
	
	//Test for contact ID too long failure
	@Test
	void testContactIdTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact("254793422222", "Jonathan", "Santiago", "1234567890", "123 ABC NY, NY");
		});
	}
	
	//Test for contact ID null failure
	@Test
	void testContactIdNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact(null, "Jonathan", "Santiago", "1234567890", "123 ABC NY, NY");
		});
	}
	
	//Test for first name too long failure
	@Test
	void testFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact("2547934", "Jonathannnnn", "Santiago", "1234567890", "123 ABC NY, NY");
		});
	}
	
	//Test for first name null failure
	@Test
	void testFirstNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact("2547934", null, "Santiago", "1234567890", "123 ABC NY, NY");
		});
	}
	
	//Test for last name too long failure
	@Test
	void testLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact("2547934", "Jonathan", "Santiagooooo", "1234567890", "123 ABC NY, NY");
		});
	}
	
	//Test for last name null failure
	@Test
	void testLastNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact("2547934", "Jonathan", null, "1234567890", "123 ABC NY, NY");
		});
	}
	
	//Test for phone number too long failure
	@Test
	void testPhoneNumberTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact("2547934", "Jonathan", "Santiago", "12345678900", "123 ABC NY, NY");
		});
	}
	
	//Test for phone number too short failure
	@Test
	void testPhoneNumberTooShort() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact("2547934", "Jonathan", "Santiago", "123456789", "123 ABC NY, NY");
		});
	}
	
	//Test for phone number null failure
	@Test
	void testPhoneNumberNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact("2547934", "Jonathan", "Santiago", null, "123 ABC NY, NY");
		});
	}
	
	//Test for address too long failure
	@Test
	void testAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact("2547934", "Jonathan", "Santiago", "1234567890", "123 ABC NY, NYyyyyyyyyyyyyyyyyyy");
		});
	}
	
	//Test for address null failure
	@Test
	void testAddressNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact("2547934", "Jonathan", "Santiago", "1234567890", null);
		});
	}
	
	//Test for contact ID setter
	@Test
	void testContacIdSetter()
	{
		Contact test = new Contact("8793241", "Jonathan", "Santiago", "1234567891", "123 ABC NY, NY");
		
		test.setContactID("1234567890");
		assertTrue(test.getContactID().equals("1234567890"));
	}
	
	//Test for null contact ID setter
	@Test
	void testNullContactIdSetter()
	{
		Contact test = new Contact("8793241", "Jonathan", "Santiago", "1234567891", "123 ABC NY, NY");
		
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			test.setContactID(null);
		});
	}
	
	//Test for contact ID setter too long
	@Test
	void testContactIdSetterTooLong()
	{
		Contact test = new Contact("8793241", "Jonathan", "Santiago", "1234567891", "123 ABC NY, NY");
		
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			test.setContactID("87932410000");
		});
	}
	
	//Test for first name setter
	@Test
	void testSetFirstName() {
		Contact test = new Contact("8793241", "Jonathan", "Santiago", "1234567891", "123 ABC NY, NY");
		
		test.setFirstName("Ashleigh");
		assertTrue(test.getFirstName().equals("Ashleigh"));
	}
	
	//Test for null first name setter
	@Test
	void testNullSetFirstName() {
		Contact test = new Contact("8793241", "Jonathan", "Santiago", "1234567891", "123 ABC NY, NY");
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			test.setFirstName(null);
		});
	}
	
	//Test for first name setter too long
	@Test
	void testSetFirstNameTooLong() {
		Contact test = new Contact("8793241", "Jonathan", "Santiago", "1234567891", "123 ABC NY, NY");
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			test.setFirstName("This name is too long");
		});
	}
	
	//Test for last name setter
	@Test
	void testSetLastName() {
		Contact test = new Contact("8793241", "Jonathan", "Santiago", "1234567891", "123 ABC NY, NY");
		
		test.setLastName("Rashid");
		assertTrue(test.getLastName().equals("Rashid"));
	}
	
	//Test for null last name setter
	@Test
	void testNullSetLastName() {
		Contact test = new Contact("8793241", "Jonathan", "Santiago", "1234567891", "123 ABC NY, NY");
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			test.setLastName(null);
		});
	}
	
	//Test for last name setter too long
	@Test
	void testSetLastNameTooLong() {
		Contact test = new Contact("8793241", "Jonathan", "Santiago", "1234567891", "123 ABC NY, NY");
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			test.setLastName("This name is too long");
		});
	}
	
	//Test for phone number setter
	@Test
	void testSetPhoneNumber() {
		Contact test = new Contact("8793241", "Jonathan", "Santiago", "1234567891", "123 ABC NY, NY");
		
		test.setPhoneNumber("1234567890");
		assertTrue(test.getPhoneNumber().equals("1234567890"));
	}
	
	//Test for null phone number setter
	@Test
	void testNullSetPhoneNumber() {
		Contact test = new Contact("8793241", "Jonathan", "Santiago", "1234567891", "123 ABC NY, NY");
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			test.setPhoneNumber(null);
		});
	}
	
	//Test for phone number setter not 10 digits
	@Test
	void testSetPhoneNumberWrongLength() {
		Contact test = new Contact("8793241", "Jonathan", "Santiago", "1234567891", "123 ABC NY, NY");
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			test.setPhoneNumber("123456789");
		});
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			test.setPhoneNumber("12345678901");
		});
	}
	
	//Test for address setter
	@Test
	void testSetAddress() {
		Contact test = new Contact("8793241", "Jonathan", "Santiago", "1234567891", "234 ABC NY, NY");
		
		test.setAddress("123 ABC NY, NY");
		assertTrue(test.getAddress().equals("123 ABC NY, NY"));
	}
	
	//Test for null address setter
	@Test
	void testNullSetAddress() {
		Contact test = new Contact("8793241", "Jonathan", "Santiago", "1234567891", "123 ABC NY, NY");
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			test.setAddress(null);
		});
	}
		
	//Test for address setter too long
	@Test
	void testSetAddressTooLong() {
		Contact test = new Contact("8793241", "Jonathan", "Santiago", "1234567891", "123 ABC NY, NY");
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			test.setAddress("This address is too longggggggggg");
		});
	}
	
	//Test for printing contact info
	@Test
	void testToString()
	{
		Contact test = new Contact("8793241", "Jonathan", "Santiago", "1234567891", "123 ABC NY, NY");
		
		assertTrue(test.toString().equals(
				"Contact ID: 8793241\n"
			  + "First Name: Jonathan\n"
			  + "Last Name: Santiago\n"
			  + "Phone Number: 1234567891\n"
			  + "Address: 123 ABC NY, NY"));
	}
}
