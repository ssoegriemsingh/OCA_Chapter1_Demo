// Imports:
import java.util.*;

// Start of class:
public class Demo
{
	// Global vars:
	String greeting = "Hello World";
	String todo;
	
	// Main:
	public static void main(String[] args)
	{
		Demo d = new Demo();
	}
	
	// Constructor:
	public Demo()
	{
		// Display text:
		Text();		
		// Display random number:
		RandomNumber();
	}
	
	// Functions:
	public void Text()
	{
		// Set todo:
		todo = "We are going to disply a random number.";
		
		// Display text:
		System.out.println(greeting);
		System.out.println(todo);
	}
	
	public void RandomNumber()
	{
		// Initialize Random?
		Random r = new Random();
		
		// Display random number:
		System.out.println(r.nextInt(10));
	}
}