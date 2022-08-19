//Author Name: Jonathan Santiago

//Date: 8/3/22

//Course: CS-320

//Description: JUnit tests for task service class

package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import TaskService.Task;
import TaskService.TaskService;

class TaskServiceTest 
{
	//Tests add function
	@Test
	void testAddTask()
	{
		TaskService testService = new TaskService();
		Task testTask = new Task("1234567890", "Test name", "Test description");
		Task testTask2 = new Task("0987654321", "Test name 2", "Test description 2");
		Task testTask3 = new Task("1234567890", "Test name 3", "Test description 3");
		
		//Pass test add function
		assertEquals(true, testService.addTask(testTask));
		assertEquals(true, testService.addTask(testTask2));
		
		//Fail test. Tried adding task with same ID as previous task
		assertEquals(false, testService.addTask(testTask3));
	}
	
	//Tests delete function
	@Test
	void testDeleteTask()
	{
		TaskService testService = new TaskService();
		Task testTask = new Task("1234567890", "Test name", "Test description");
		Task testTask2 = new Task("0987654321", "Test name 2", "Test description 2");
		
		testService.addTask(testTask);
		testService.addTask(testTask2);
		
		assertEquals(true, testService.deleteTask(testTask));
		assertEquals(true, testService.deleteTask(testTask2));
		
		assertEquals(false, testService.deleteTask(testTask));
		assertEquals(false, testService.deleteTask(testTask2));
		
	}
	
	//Tests update function
	@Test
	void testUpdateTask()
	{
		TaskService testService = new TaskService();
		Task testTask = new Task("1234567890", "Test name", "Test description");
		Task testTask2 = new Task("0987654321", "Test name 2", "Test description 2");
		
		testService.addTask(testTask);
		testService.addTask(testTask2);
		
		assertEquals(true, testService.updateTask(testTask, "name", "Different name"));
		assertEquals(true, testService.updateTask(testTask, "description", "Different name"));
		assertEquals(false, testService.updateTask(testTask, "nonexistent field", "should fail"));
	}
	
	//Test for printing task info
	@Test
	void testPrintTasks()
	{
		TaskService testService = new TaskService();
		Task testTask = new Task("1234567890", "Test name", "Test description");
		testService.addTask(testTask);
		
		assertEquals(true, testService.printTasks());
	}

}
