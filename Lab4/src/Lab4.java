/*-------------------------------------------------------------------------
//AUTHOR: Carrie Dunn
//FILENAME: Lab4
//SPECIFICATION: Practicing loops
//FOR: CSE 110- Lab #4
//TIME SPENT: 10 minutes
//-----------------------------------------------------------*/
import java.util.Scanner;
public class Lab4 {
	public static void main (String [] args) {
		int choice; 
		int m; 
		int sum = 0;
		int n; 
		int num; 
		Scanner scan = new Scanner(System.in);
		do{
			System.out.println("Please choose your choice from following menu");
			System.out.println("1) Calculate the sum of integers 1 to m.");
			System.out.println("2) Calculate the factorial of given number.");
			System.out.println("3) Find the first digit of a given number.");
			System.out.println("4) Quit.");
			choice = scan.nextInt();
		
			switch(choice)
	  		{
	  			case 1:
	  				System.out.println("Please enter a number");
	  				m = scan.nextInt();
	  				int i = 1; 
	  				while ( i<=m ) {
	  					sum = sum + i; 
	  					i++;
	  				}
	  				System.out.println("The sum of first " + m + " is " + sum);
	  				break;
	  			case 2: 
	  				System.out.println("Please enter a number");
	  				n = scan.nextInt();
	  				int j = 1; 
	  				int fact = 1;
	  				while (j<=n) {
	  					fact = fact *= j;
	  					j++;
	  				}
	  				System.out.println("The facrotial of " + n + " is "+ fact);
	  				break;
	  			case 3:
	  				System.out.println("Please enter a number");
	  				num = scan.nextInt();
	  				int rem = 0;
	  				while (num != 0) {
	  					rem = num % 10;
	  					num = num/10;
	  				}
	  				System.out.println("The 1st integer from the left is "+ rem);
	  				break;
	  			default: 
	  			break;
	  		}
		} 
		while(choice != 4);
	}
}
