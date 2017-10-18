/*-------------------------------------------------------------------------
// AUTHOR: Carrie Dunn
// FILENAME: Lab7.java
// SPECIFICATION: object practice
// FOR: CSE 110- Lab #7
// TIME SPENT: 1 hour
//-----------------------------------------------------------*/

import java.util.Scanner;
public class Lab7
{
	public static void main(String[] args)
	{
		//declare variables where you will store
		//inputs from user
		String lname;
		int num;
		Builder myBuilder;

		// declare a Scanner object
		Scanner scan = new Scanner(System.in);

		//prompt the user for input
		// string name
		System.out.println("Please give a name");
		lname = scan.nextLine();
		

		// store the input in the declared variables
	

		// Create a brand-new builder with a given name using our Builder.java class
		// called myBuilder using the variable
		// name provided by the user
		myBuilder = new Builder(lname);



		// call the getName() method to get the name of the builder.
		System.out.println("The name of your builder is: " + myBuilder.getlName() );
		
		// Ask for integer n from user using Scanner class
		System.out.println("Enter a positive integer:");
		num = scan.nextInt();

		// Using your builder's makeRow method print a string below,
		// Example: =====*****===== with n = 5;
		System.out.print(myBuilder.makeRow(num,"="));
		System.out.print(myBuilder.makeRow(num,"*"));
		System.out.print(myBuilder.makeRow(num,"="));
		System.out.print("\n");

		// Ask for odd integer t from user using Scanner class
		System.out.println("Enter a positive odd integer, \n representing number of stars in the base of a pyramid :");
		num = scan.nextInt();

		// Using the Builder method makePyramid and integer t, print pyramid with "*" as a string
		// s.
		myBuilder.makePyramid(num, "*");
	
	}
}