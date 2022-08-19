//Author Name: Jonathan Santiago

//Date: 8/3/22

//Course: CS-320

//Description: JUnit tests for appointment service class

package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import AppointmentService.Appointment;
import AppointmentService.AppointmentService;

class AppointmentServiceTest {
	//Date to use in testing
	LocalDate testAppointmentDate = LocalDate.parse("2025-08-01");

	//Tests adding appointments
	@Test
	void testAddAppointment()
	{
		AppointmentService testService = new AppointmentService();
		
		Appointment testAppointment1 = new Appointment("1234567890", "Test description", testAppointmentDate);
		Appointment testAppointment2 = new Appointment("0987654321", "Test description2", testAppointmentDate);
		Appointment testAppointment3 = new Appointment("1234567890", "Test description3", testAppointmentDate);
		
		assertEquals(true, testService.addAppointment(testAppointment1));
		assertEquals(true, testService.addAppointment(testAppointment2));
		assertEquals(false, testService.addAppointment(testAppointment3));
	}
	
	//Tests deleting appointments
	@Test
	void testDeleteAppointment()
	{
		AppointmentService testService = new AppointmentService();
		
		Appointment testAppointment1 = new Appointment("1234567890", "Test description", testAppointmentDate);
		Appointment testAppointment2 = new Appointment("0987654321", "Test description2", testAppointmentDate);
		
		testService.addAppointment(testAppointment1);
		testService.addAppointment(testAppointment2);
		
		assertEquals(true, testService.deleteAppointment(testAppointment1));
		assertEquals(true, testService.deleteAppointment(testAppointment2));
		
		assertEquals(false, testService.deleteAppointment(testAppointment1));
		assertEquals(false, testService.deleteAppointment(testAppointment2));
	}
	
	//Tests printing appointments
	@Test
	void testPrintAppointments()
	{
		AppointmentService testService = new AppointmentService();
		
		Appointment testAppointment1 = new Appointment("1234567890", "Test description", testAppointmentDate);
		
		testService.addAppointment(testAppointment1);
		
		assertEquals(true, testService.printAppointments());
		
	}

}
