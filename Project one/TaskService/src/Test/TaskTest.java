//Author Name: Jonathan Santiago

//Date: 8/3/22

//Course: CS-320

//Description: JUnit tests for task class.

package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import TaskService.Task;

class TaskTest {
	
	//Test for constructor
	@Test
	void testTask()
	{
		Task testTask = new Task("1234567890", "Test name", "Test description");
		assertTrue(testTask.getTaskName().equals("Test name"));
		assertTrue(testTask.getTaskDescription().equals("Test description"));
		assertTrue(testTask.getTaskID().equals("1234567890"));
	}
	
	//Test contructor for null task ID
	@Test
	void testNullTaskID()
	{
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Task(null, "Test name", "Test description");
		});
	}
	
	//Test constructor for ID too long
	@Test
	void testTaskIDTooLong()
	{
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Task("12345678900", "Test name", "Test description");
		});
	}
	
	//Test constructor for null name
	@Test
	void testNullName()
	{
		//Null name test
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Task("1234567890", null, "Test Description");
		});
	}
	
	//Test constructor for name too long
	@Test
	void testNameTooLong()
	{
		//Name too long test
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Task("1234567890", "This name is too longggggg", "Test Description");
		});		
	}
	
	//Test constructor for null description
	@Test
	void testDescriptionNull()
	{
		//Null description test
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Task("1234567890", "Test name", null);
		});
	}
	
	//Test constructor for description too long
	@Test
	void testDescriptionTooLong()
	{
		//Description too long test
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Task("1234567890", "Test name", "This description is way too longggggggggggggggggggggg");
		});
	}
	
	//Test for ID setter
	@Test
	void testSetTaskID()
	{
		Task testTask = new Task("1234567890", "Test name", "Test description");
		testTask.setTaskID("0987654321");
		
		assertTrue(testTask.getTaskID().equals("0987654321"));
	}
	
	//Test for null ID setter
	@Test
	void testSetTaskIDNull()
	{
		Task testTask = new Task("1234567890", "Test name", "Test description");
		
		//Set taskID to null test
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			testTask.setTaskID(null);
		});
	}
	
	//Test for setter ID too long
	@Test
	void testSetTaskIDTooLong()
	{
Task testTask = new Task("1234567890", "Test name", "Test description");
		
		//Set name to null test
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			testTask.setTaskID("12345678900");
		});
	}
	
	//Test for name setter
	@Test
	void testSetTaskName()
	{
		Task testTask = new Task("1234567890", "Test name", "Test description");
		testTask.setTaskName("Different name");
		
		assertTrue(testTask.getTaskName().equals("Different name"));
	}
	
	//Test for null name setter
	@Test
	void testSetTaskNameNull()
	{
		Task testTask = new Task("1234567890", "Test name", "Test description");
		
		//Set name to null test
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			testTask.setTaskName(null);
		});
	}
	
	//Test for name setter too long
	@Test
	void testSetTaskNameTooLong()
	{
		Task testTask = new Task("1234567890", "Test name", "Test description");
		
		//Set name too long test
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			testTask.setTaskName("This name is too longgggggggggggggg");
		});
	}
	
	//Test for description setter
	@Test
	void testSetTaskDescription()
	{
		Task testTask = new Task("1234567890", "Test name", "Test description");
		testTask.setTaskDescription("Different description");
		
		assertTrue(testTask.getTaskDescription().equals("Different description"));
	}
	
	//Test for null description setter
	@Test
	void testSetTaskDescriptionNull()
	{
		Task testTask = new Task("1234567890", "Test name", "Test description");
		
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			testTask.setTaskDescription(null);
		});
	}
	
	//Test for description setter too long
	@Test
	void testSetTaskDescriptionTooLong()
	{
		Task testTask = new Task("1234567890", "Test name", "Test description");
		
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			testTask.setTaskDescription("This description is way too longggggggggggggggggggggg");
		});
	}
	
	//Test for printing task info
	@Test
	void testToString()
	{
		Task testTask = new Task("1234567890", "Test name", "Test description");
		
		assertTrue(testTask.toString().equals(
						  "Task ID: 1234567890\n"
						+ "Task Name: Test name\n"
						+ "Task Description: Test description"));
	}
}
