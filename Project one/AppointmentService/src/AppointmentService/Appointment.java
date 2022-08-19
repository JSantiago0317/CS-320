//Author Name: Jonathan Santiago

//Date: 8/3/22

//Course: CS-320

//Description: Appointment class. Appointment object contains private ID, description and date.

package AppointmentService;

//Local date was easier to use than Date
import java.time.LocalDate;

//Appointment class
public class Appointment {
	//Private variables
	private String appointmentID;
	private String appointmentDescription;
	private LocalDate appointmentDate;
	
	//Holds current date
	LocalDate currentDate = LocalDate.now();
	
	//Super constructor
	public Appointment(String appointmentID, String appointmentDescription, LocalDate appointmentDate) 
	{
		super();
		if ((appointmentID == null || appointmentID.length() > 10) || (appointmentDescription == null || appointmentDescription.length() > 50) || (appointmentDate == null || appointmentDate.isBefore(currentDate) == true))
		{
			throw new IllegalArgumentException("Invalid input::Appointment not created");
		}
		else
		{
			this.appointmentID = appointmentID;
			this.appointmentDescription = appointmentDescription;
			this.appointmentDate = appointmentDate;
		}
	}
	
	//Appointment ID setter with validation (Temporary, this will be random in week 6)
	public void setAppointmentID(String appointmentID)
	{
		if (appointmentID == null || appointmentID.length() > 10)
		{
			throw new IllegalArgumentException("Invalid input::Appointment not created");
		}
		else
		{
			this.appointmentID = appointmentID;
		}
	}
	
	//Description setter with input validation
	public void setAppointmentDescription(String appointmentDescription)
	{
		if (appointmentDescription == null || appointmentDescription.length() > 50) 
		{
			throw new IllegalArgumentException("Invalid input::Appointment not created");
		}
		else
		{
			this.appointmentDescription = appointmentDescription;
		}
	}
	
	//Appointment date setter with input validation
	public void setAppointmentDate(LocalDate appointmentDate)
	{
		if (appointmentDate == null || appointmentDate.isBefore(currentDate))
		{
			throw new IllegalArgumentException("Invalid input::Appointment not created");
		}
		else
		{
			this.appointmentDate = appointmentDate;
		}
	}
	
	//Appointment ID getter
	public String getAppointmentID()
	{
		return this.appointmentID;
	}
	
	//Appointment description getter
	public String getAppointmentDescription()
	{
		return this.appointmentDescription;
	}
	
	//Appointment date getter
	public LocalDate getAppointmentDate()
	{
		return this.appointmentDate;
	}
	
	//Prints appointment info
	@Override
	public String toString() 
	{
	return"Appointment ID: " + this.appointmentID + "\n"
		+ "Appointment Description: " + this.appointmentDescription+ "\n"
		+ "Appointment Date: " + this.appointmentDate;
	}
}
