/*-------------------------------------------------------------------------
// AUTHOR: Carrie Dunn
// FILENAME: Person.java
// SPECIFICATION: Creating a person class and class practice 
// FOR: CSE 110- Lab #6
// TIME SPENT: 30 minutes
//-----------------------------------------------------------*/
public class Person{
	// declare some variables of different types:
	// an string called firstname
	String firstName = "";
	// a string called lastname
	String lastName = "";
	// an int called birthYear
	int birthYear = 0;

	// Defining the constructor

	public Person (String fname, String lname, int year)
	{
	// write the segment of code
	//that assigns input data to the data members
		firstName = fname; 
		lastName = lname;
		birthYear = year;
	}


	// Supply the methods

	public String getFirstName()
	{
	// write a line of code
	//that returns the first name
		return firstName;
	}


	public String getLastName()
	{
	//write a line of code that returns last name
		return lastName;
	}

	public int getAge(int currentYear)
	{
	// write a segment of code
	//that returns the age
		return currentYear - birthYear;
	}

}