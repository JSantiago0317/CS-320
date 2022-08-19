//Author Name: Jonathan Santiago

//Date: 8/3/22

//Course: CS-320

//Description: Task service class. Used to locally maintain a list of tasks objects. Can perform CRUD operations.

package TaskService;

import java.util.ArrayList;

//Task service class
public class TaskService {
	//List to hold user's tasks
	private ArrayList<Task> taskList = new ArrayList<>();
	
	//This constructor creates users task list
	public TaskService()
	{
		taskList = new ArrayList<>();
	}
	
	//Adding task functionality
	public boolean addTask(Task newTask)
	{
		boolean taskAlready = false;
		
		//Iterates through list
		for (Task tasks:taskList)
		{
			//Check if task already exists
			if (tasks.getTaskID().equals(newTask.getTaskID()))
			{
				taskAlready = true;
			}
		}
		
		//Adds task if not found
		if (!taskAlready)
		{
			taskList.add(newTask);
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//Delete tasks function
	public boolean deleteTask(Task taskToDelete)
	{
		boolean deletedAlready = true;
		
		//Iterates through task list
		for (Task task:taskList)
		{
			//Checks to see if ID is already deleted
			if (task.getTaskID().equals(taskToDelete.getTaskID()))
			{
				deletedAlready = false;
			}
		}
		
		//Deletes if found
		if (!deletedAlready)
		{
			taskList.remove(taskToDelete);
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//Update tasks function
	public boolean updateTask(Task task, String updateField, String updateValue) 
	{
		//Iterates through task list
		for (Task taskIterator:taskList)
		{
			//Finds task by ID
			if (taskIterator.getTaskID().equals(task.getTaskID()))
			{
				//Updates name if name is passed
				if (updateField.toLowerCase() == "name")
				{
					task.setTaskName(updateValue);
					return true;
				}
				//Updates description if description is passed
				if (updateField.toLowerCase() == "description")
				{
					task.setTaskDescription(updateValue);
					return true;
				}
			}
		}
		return false;	
	}
	
	//Prints all task info
	public boolean printTasks()
	{
		//Iterates through list
		for (Task task:taskList)
		{
			//Prints info of found tasks
			System.out.println(task.toString() + "\n");
		}
		return true;
	}
}
