/*-------------------------------------------------------------------------
// AUTHOR: Carrie Dunn
// FILENAME: Assignment2
// SPECIFICATION: 
// Lab Letter N. TA: Vyom
// FOR: CSE 110- MWF 2:00-2:50
// TIME SPENT: 30 minutes
//----------------------------------------------------------------------*/ 
/* Part one exercise:
 * String myString = new String ("Coding is fun!");
 * Question 1: System.out(myString.length());
 * Question 2: System.out(myString.index('d'));
 * Question 3: System.out(myString.substring(10,12);
 * Question 4: 
 *      a) True
 *      b) False
 *      c) True
 *      d) True
 * Question 5: Hy
 */
//import the java scanner 
import java.util.Scanner;
//public class for assignment 2
public class Assignment2 {
    //Main class for assignment
    public static void main (String[] args) {
    	//declaring the variables 
		String firstName = "";
		String secondName = "";
		String thirdName = "";
		
		//importing the scanner object
		Scanner scan = new Scanner(System.in);
		
		//Asking for the first input
		System.out.println("Please input your first name. ");
		firstName = scan.nextLine(); 
		//checking if the first letter is a letter
		if (Character.isLetter(firstName.charAt(0))==true) {
			firstName = firstName.toLowerCase();
			//Upper case the first letter and keeping the other letters lower case
			firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);
			//printing out the first name
			System.out.println(firstName + " is the first name.");
			//if its a valid name return true
		}
		else {
			//error message if the first letter is not a letter
			System.out.println("Error: You must enter a first name.");
			// sets to empty string if a number is imputed
			firstName = "";
		}
		
		//Asking for the second input
		System.out.println("Please input your second name. ");
		secondName = scan.nextLine();
		//checking if the first letter is a letter
		if (Character.isLetter(secondName.charAt(0))==true) {
			secondName = secondName.toLowerCase();
			//Upper case the first letter and keeping the other letters lower case
			secondName = secondName.substring(0, 1).toUpperCase() + secondName.substring(1);
			//printing out the second name
			System.out.println(secondName + " is the second name.");
			
		}
		else {
			//error message if the first letter is not a letter
			System.out.println("Error: You must enter a second name.");
	
			// sets to empty string if a number is imputed
			secondName = "";
		}
		
		//Asking for the third input
		System.out.println("Please input your third name. ");
		thirdName = scan.nextLine();
		//checking if the first letter is a letter
		if (Character.isLetter(thirdName.charAt(0))==true) {
			thirdName = thirdName.toLowerCase();
			//Upper case the first letter and keeping the other letters lower case
			thirdName = thirdName.substring(0, 1).toUpperCase() + thirdName.substring(1);
			//printing out the third name
			System.out.println(thirdName + " is the third name.");
		
		}
		else {
			//error message if the first letter is not a letter
			System.out.println("Error: You must enter a third name.");
	
			// sets to empty string if a number is imputed
			thirdName = "";
		}

		//printing the names out in alphabetical order
			System.out.println("The name in alphabetical order are: ");
			String hold = "";
				//comparing the first and second name
				if (firstName.compareTo(secondName) > 0 ) {
					hold = firstName;
					firstName = secondName;
					secondName = hold;
				}
				//comparing the third and first name
				if (firstName.compareTo(thirdName) > 0 ) {
					hold = firstName;
					firstName = thirdName;
					thirdName = hold; 
				}
				//comparing the second and third name
				if (secondName.compareTo(thirdName) > 0 ) {
					hold = secondName;
					secondName = thirdName;
					thirdName = hold;
			
				}
				//checking to see if the first string is not empty 
				if (firstName != "")System.out.println(firstName); 
				if (secondName != "")System.out.println(secondName); 
				if (thirdName != "")System.out.println(thirdName); 
    }
}