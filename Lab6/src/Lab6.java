/*-------------------------------------------------------------------------
// AUTHOR: Carrie Dunn
// FILENAME: Lab6.java
// SPECIFICATION: Creating a person class and class practice 
// FOR: CSE 110- Lab #6
// TIME SPENT: 30 minutes
//-----------------------------------------------------------*/
import java.util.Scanner;
public class Lab6 {
	public static void main (String [] args) {
		//declare variables where you will store
		//inputs from user
		String fname ="";
		String lname ="";
		int year = 0;
		Person person;
		// declare a Scanner object
		Scanner scan = new Scanner(System.in);
		//prompt the user for inputs
		//firstname, lastname, birthyear
		System.out.println("Please enter your first name");
		fname = scan.nextLine ();
		System.out.println("Pleas enter your last name");
		lname = scan.nextLine();
		System.out.println("Please enter your birthyear");
		year = scan.nextInt();
		// store the input in the declared variables
	
		//use the constructor
		//to create a brand-new object Person
		person = new Person (fname,lname,year);


		//Call the getFirstName() and getLastName() methods 
		System.out.print(person.getFirstName() + " " + person.getLastName());
		//in order to print the name of the object Person you just created.
		//Call the getAge(currentYear) method in order to print the age.
		System.out.print(" is " + person.getAge(2016) + " years old in 2016 and will be " + person.getAge(2026) + " years old in ten years." );

	}
}
