/*-------------------------------------------------------------------------
// AUTHOR: Carrie Dunn
// FILENAME: Lab2.java
// SPECIFICATION: 
// FOR: CSE 110- Lab #2
// TIME SPENT: 50 Minutes
//-----------------------------------------------------------*/
// All imports has to be outside class
import java.util.Scanner;
// class name should match the file name
public class Lab2 {
	public static void main (String[] args) {
		// declare variables of different types:
		String firstName = "";
		String lastName = "";
		String fullName = "";
		String fullCase = "";
		int nameLength = 0;
		Scanner scan = new Scanner(System.in);
		// Use Scanner to ask the user for first name
		System.out.println("Please enter first name: ");
		firstName = scan.nextLine();
		// Use Scanner to ask the user for last name
		System.out.println("Please enter last name: ");
		lastName = scan.nextLine();
		//adding firstName and lastName 
		fullName = firstName + " " + lastName; 
		// converting fullName to upper case
		fullCase = fullName.toUpperCase();
		// finding the length of the string 
		nameLength = fullName.length(); 
		//Displaying the results for full name
		System.out.println("Full Name (in capitals): " + fullCase);
		//Displaying the results for name length
		System.out.println("Length of full name: " + nameLength);
		// Define two String variables, title1 and title2 using String constructor to initialize them
		String title1 = new String("cse110");
		String title2 = "cse110";
		// Compare the two strings and print which one of the two ways works
		if (title1 == title2){
		// Print "String comparison using "==" sign works"
			System.out.println("String comparison use == sign works");
		} else {
		// Print "String comparison using "==" sign does NOT work"
			System.out.println("String comparison using == does NOT work");
		}
		if (title1.equals(title2)){
		// print "String comparison using "equals" method works"
			System.out.println("String comparison using equal method works");
		} else {
		// print "String comparison using "equals" method does NOT work"
			System.out.println("String comparison using equals method does NOT Work");
		}
	}
}
