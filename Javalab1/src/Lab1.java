/*-------------------------------------------------------------------------
// AUTHOR: Carrie Dunn
// FILENAME: Lab1
// SPECIFICATION: Lab one assignment. Records and averages three test scores. 
// FOR: CSE 110- Lab #1
// TIME SPENT: 50 minutes
//-----------------------------------------------------------*/

import java.util.Scanner;
//class name 
public class Lab1 {
	//main method
	public static void main(String[] args) {
		// create a Scanner object to get input from the keyboard
				//-->
				Scanner in = new Scanner(System.in);

				// declare variables 
				//-->
				int test1, test2, test3 ;
				int NUM_TESTS = 3; 
				double avg;
				
				// Get the Input
				//-->
	
				System.out.print("Enter Your first test score");
				test1 = in.nextInt();
				
				
				System.out.print("Enter Your second test score");
				test2 = in.nextInt();
				
			
				System.out.print("Enter Your third test score");
				test3 = in.nextInt();
				// Calculate the average
				//-->
				avg = (test1 + test2 + test3) / (double) NUM_TESTS;

				// Display Results
				//-->
				System.out.println("You average score is " + avg);

			}//end main method
		}//end Lab1 class
