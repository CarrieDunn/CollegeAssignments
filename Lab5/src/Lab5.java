/*-------------------------------------------------------------------------
// AUTHOR: Carrie Dunn
// FILENAME: Lab5.java
// SPECIFICATION: Nested loops practice 
// FOR: CSE 110- Lab #5
// TIME SPENT: 10 minutes
//-----------------------------------------------------------*/

//import statements 
import java.util.Scanner; 
//declaring the lab5 variable 
public class Lab5 {
	//declaring the main method 
	public static void main (String [] args) {
		//define the scanner class
		Scanner scan = new Scanner(System.in);
		//declare the variables for the function 
		int choice;
		do { 
			//Print the following options:
			System.out.println("Please choose your choice from following menu");
			System.out.println("1) Print through all integer numbers between two given integers.");
			System.out.println("2) Display a pattern - right triangle of stars.");
			System.out.println("3) Quit.");
			choice = scan.nextInt();

			//use scanner to get the input 
			switch(choice)
	  		{
	  			case 1:
	  				int start = 0;
	  				int end = 0; 
				   	//Ask for and input the target (start and end) number.
	  				System.out.println("Please enter the start number");
	  				start = scan.nextInt();
	  				System.out.println("Please enter the end number");
	  				end = scan.nextInt();
				    //Loop from start to the end number, printing intermediate
	  				int i = 0;
	  				for (i = start; i<= end; i++) {
	  					System.out.print(i);
	  				}
	  				break;
	  			case 2:
					//Ask the user to input height of the pattern.
	  				int height;
	  				System.out.println("What is the height of the pattern?");
	  				height = scan.nextInt();
	  				//loop displaying the star
	  				int j;
			        for (i=1; i<= height; i++)
			        {
						
						// Let the inner loop run from j=1 up to and including i, the counter for the outer loop
			        		for (j = 1; j<=i; j++)
			            {
							// The inner loop prints the single star
			                System.out.print("*");
			            }
						// You may need another print statement after exiting the inner loop to get a newline;
			        		System.out.print("\n");
			        }
			        break;

	  			default:
					// A default case that doesn't do anything, but we define it just in case.
	  		}
		}while(choice!=3);
		
	}
}
