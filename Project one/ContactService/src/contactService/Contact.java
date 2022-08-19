//Author Name: Jonathan Santiago

//Date: 8/3/22

//Course: CS-320

//Description: Contact class. Contact object contains private first name, last name, ID, phone number and address.

package contactService;

//Contact class
public class Contact {
	//Private variable declarations
	private String contactID;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String address;
	
	//Super constructor with input validation
	public Contact(String contactID, String firstName, String lastName, String phoneNumber, String address) {
		super();
		if ((contactID == null || contactID.length() > 10) || (firstName == null || firstName.length() > 10) 
				|| (lastName == null || lastName.length() > 10) || (phoneNumber == null || phoneNumber.length() != 10) 
				|| (address == null || address.length() > 30))
		{
			throw new IllegalArgumentException("Invalid input::Contact not created");
		}
		else
		{
			this.contactID = contactID;
			this.firstName = firstName;
			this.lastName = lastName;
			this.phoneNumber = phoneNumber;
			this.address = address;
		}
	}
	
	//Setter for contact ID with input validation
	public void setContactID(String contactID)
	{
		if (contactID == null || contactID.length() > 10) {
			throw new IllegalArgumentException("Invalid input");
		} else {
			this.contactID = contactID;
		}
	}
	
	//Setter for first name with input validation
	public void setFirstName(String firstName) 
	{
		if (firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid input");
		} else {
			this.firstName = firstName;
		}
	}
	
	//Setter for last name with input validation
	public void setLastName(String lastName)
	{
		if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid input");
		} else {
			this.lastName = lastName;
		}
	}
	
	//Setter for phone number with input validation
	public void setPhoneNumber(String phoneNumber)
	{
		if (phoneNumber == null || phoneNumber.length() != 10) {
			throw new IllegalArgumentException("Invalid input");
		} else {
			this.phoneNumber = phoneNumber;
		}
	}
	
	//Setter for address with input validation
	public void setAddress(String address) 
	{
		if (address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid input");
		} 
		else {
			this.address = address;
		}
	}
	
	//Getter for contact ID
	public String getContactID() 
	{
		return contactID;
	}
	
	//Getter for first name
	public String getFirstName() 
	{
		return firstName;
	}
	
	//Getter for last name
	public String getLastName()
	{
		return lastName;
	}
	
	//Getter for phone number
	public String getPhoneNumber() 
	{
		return phoneNumber;
	}
	
	//Getter for address
	public String getAddress()
	{
		return address;
	}
	
	//Prints contact info
	@Override
	public String toString() 
	{
	return "Contact ID: " + this.contactID + "\n"
		 + "First Name: " + this.firstName + "\n"
		 + "Last Name: " + this.lastName + "\n"
		 + "Phone Number: " + this.phoneNumber + "\n"
		 + "Address: " + this.address;
	}
}