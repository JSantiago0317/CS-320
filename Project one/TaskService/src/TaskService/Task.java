//Author Name: Jonathan Santiago

//Date: 8/3/22

//Course: CS-320

//Description: Task class. Task object contains private name ID and description.

package TaskService;

//Task class
public class Task 
{
	private String taskID;
	private String taskName;
	private String taskDescription;
	
	//Super constructor
	public Task(String taskID, String taskName, String taskDescription) 
	{
		super();
		if ((taskID == null || taskID.length() > 10) || (taskName == null || taskName.length() > 20) || (taskDescription == null || taskDescription.length() > 50))
		{
			throw new IllegalArgumentException("Invalid input::Task not created");
		}
		else
		{
			this.taskID = taskID;
			this.taskName = taskName;
			this.taskDescription = taskDescription;
		}
	}
	
	//Setter for task ID
	public void setTaskID(String taskID)
	{
		//Input validation
		if (taskID == null || taskID.length() > 10)
		{
			throw new IllegalArgumentException("Invalid input::Task not created");
		}
		else
		{
			this.taskID = taskID;
		}
	}
	
	//Setter for task name
	public void setTaskName(String taskName)
	{
		//Input validation
		if (taskName == null || taskName.length() > 20)
		{
			throw new IllegalArgumentException("Invalid input::Task not created");
		}
		else
		{
			this.taskName = taskName;
		}
	}
	
	//Setter for task description
	public void setTaskDescription(String taskDescription)
	{
		//Input validation
		if (taskDescription == null || taskDescription.length() > 50)
		{
			throw new IllegalArgumentException("Invalid input::Task not created");
		}
		else
		{
			this.taskDescription = taskDescription;
		}
	}
	
	//Getter for task ID
	public String getTaskID()
	{
		return this.taskID;
	}
	
	//Getter for task name
	public String getTaskName()
	{
		return this.taskName;
	}
	
	//Getter for task description
	public String getTaskDescription()
	{
		return this.taskDescription;
	}
	
	//Prints task info
	@Override
	public String toString() 
	{
	return"Task ID: " + this.taskID + "\n"
		+ "Task Name: " + this.taskName + "\n"
		+ "Task Description: " + this.taskDescription;
	}
}
