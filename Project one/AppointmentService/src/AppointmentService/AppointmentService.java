//Author Name: Jonathan Santiago

//Date: 8/3/22

//Course: CS-320

//Description: Appointment service class. Used to locally maintain a list of appointment objects. Can perform CRUD operations.

package AppointmentService;

import java.util.ArrayList;

public class AppointmentService {
	
	//Array list to hold appointments
	private ArrayList<Appointment> appointmentList = new ArrayList<>();
	
	
	public AppointmentService()
	{
		appointmentList = new ArrayList<>();
	}
	
	//Add appointment functionality
	public boolean addAppointment(Appointment newAppointment)
	{
		boolean appointmentAlready = false;
		
		//Checks list for appointment
		for (Appointment appointments:appointmentList)
		{
			if (appointments.getAppointmentID().equals(newAppointment.getAppointmentID()))
			{
				appointmentAlready = true;
			}
		}
		
		//Adds if not found
		if (!appointmentAlready)
		{
			appointmentList.add(newAppointment);
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//Delete appointment functionality
	public boolean deleteAppointment(Appointment appointmentToDelete)
	{
		boolean deleteAlready = true;
		
		//Checks list for appointment
		for (Appointment appointments:appointmentList)
		{
			if (appointments.getAppointmentID().equals(appointmentToDelete.getAppointmentID()))
			{
				deleteAlready = false;
			}
		}
		
		//Deletes if found
		if (!deleteAlready)
		{
			appointmentList.remove(appointmentToDelete);
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//Prints all appointments
	public boolean printAppointments()
	{
		for (Appointment appointments:appointmentList)
		{
			System.out.println(appointments.toString());
		}
		return true;
	}
}
