//Author Name: Jonathan Santiago

//Date: 8/3/22

//Course: CS-320

//Description: JUnit tests for appointment class.

package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import AppointmentService.Appointment;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AppointmentTest {
	
	//Date to test against
	LocalDate testAppointmentDate = LocalDate.parse("2025-08-01");

	//Tests constructor
	@Test
	void testAppointment() 
	{
		Appointment testAppointment = new Appointment("1234567890", "Test description", testAppointmentDate);
		
		assertTrue(testAppointment.getAppointmentID().equals("1234567890"));
		assertTrue(testAppointment.getAppointmentDescription().equals("Test description"));
		assertTrue(testAppointment.getAppointmentDate().equals(testAppointmentDate));
	}
	
	//Tests constructor with null ID
	@Test
	void testNullAppointmentID()
	{

		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Appointment(null, "Test description", testAppointmentDate);
		});
	}
	
	//Tests constructor with long ID
	@Test
	void testAppointmentIDTooLong() 
	{
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Appointment("12345678900", "Test description", testAppointmentDate);
		});
	}
	
	//Tests constructor with null description
	@Test
	void testNullAppointmentDescription()
	{
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Appointment("1234567890", null, testAppointmentDate);
		});
	}
	
	//Tests constructor with long description
	@Test
	void testAppointmentDescriptionTooLong()
	{
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Appointment("1234567890", "Test description Test description Test description Test description ", testAppointmentDate);
		});
	}
	
	//Tests constructor with null date
	@Test
	void testNullAppointmentDate()
	{
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Appointment("1234567890", "Test description", null);
		});
	}
	
	//Tests constructor with date in the past
	@Test
	void testAppointmentDateBeforeCurrentDate()
	{
		LocalDate testAppointmentDate2 = LocalDate.parse("2021-07-29");
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Appointment("1234567890", "Test description", testAppointmentDate2);
		});
	}
	
	//Tests ID setter
	@Test
	void tesSetAppointmentID()
	{
		Appointment testAppointment = new Appointment("1234567890", "Test description", testAppointmentDate);
		
		testAppointment.setAppointmentID("0987654321");
		
		assertTrue(testAppointment.getAppointmentID().equals("0987654321"));
	}
	
	//Tests null ID setter
	@Test
	void testNullSetAppointmentID()
	{
		Appointment testAppointment = new Appointment("1234567890", "Test description", testAppointmentDate);
		
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			testAppointment.setAppointmentID(null);
		});
	}
	
	//Tests long ID setter
	@Test
	void testSetAppointmentIDTooLong()
	{
		Appointment testAppointment = new Appointment("1234567890", "Test description", testAppointmentDate);
		
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			testAppointment.setAppointmentID("12345678900");
		});
	}
	
	//Tests description setter
	@Test
	void testSetAppointmentDescription()
	{
		Appointment testAppointment = new Appointment("1234567890", "Test description", testAppointmentDate);
		
		testAppointment.setAppointmentDescription("Different description");
		
		assertTrue(testAppointment.getAppointmentDescription().equals("Different description"));
	}
	
	//Tests null description setter
	@Test
	void testNullSetAppointmentDescription()
	{
		Appointment testAppointment = new Appointment("1234567890", "Test description", testAppointmentDate);
		
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			testAppointment.setAppointmentDescription(null);
		});
	}
	
	//Tests long description setter
	@Test
	void testSetAppointmentDescriptionTooLong()
	{
		Appointment testAppointment = new Appointment("1234567890", "Test description", testAppointmentDate);
		
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			testAppointment.setAppointmentDescription("Test description Test description Test description Test description ");
		});
	}
	
	//Tests date setter
	@Test
	void testSetAppointmentDate()
	{
		LocalDate testAppointmentDate2 = LocalDate.parse("2025-07-29");
		
		Appointment testAppointment = new Appointment("1234567890", "Test description", testAppointmentDate);
		
		testAppointment.setAppointmentDate(testAppointmentDate2);
		
		assertTrue(testAppointment.getAppointmentDate().equals(testAppointmentDate2));
	}
	
	//Tests null date setter
	@Test
	void testNullSetAppointmentDate()
	{
		Appointment testAppointment = new Appointment("1234567890", "Test description", testAppointmentDate);
		
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			testAppointment.setAppointmentDate(null);
		});
	}
	
	//Tests date setter with date in the past
	@Test
	void testSetAppointmentDateBeforeCurrentDate()
	{
		Appointment testAppointment = new Appointment("1234567890", "Test description", testAppointmentDate);
		
		LocalDate testAppointmentDate2 = LocalDate.parse("2021-07-29");
		
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			testAppointment.setAppointmentDate(testAppointmentDate2);
		});
	}
	
	//Tests printing appointment info
	@Test
	void testToString()
	{
		Appointment testAppointment = new Appointment("1234567890", "Test description", testAppointmentDate);
		
		assertTrue(testAppointment.toString().equals(
						  "Appointment ID: " + testAppointment.getAppointmentID() + "\n"
						+ "Appointment Description: " + testAppointment.getAppointmentDescription()+ "\n"
						+ "Appointment Date: " + testAppointment.getAppointmentDate()));
	}

}
