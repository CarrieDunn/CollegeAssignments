package lab3;
/*-------------------------------------------------------------------------

//AUTHOR: Carrie Dunn
//FILENAME: Lab3
//SPECIFICATION: A grade calculator to determine if you pass the class
//FOR: CSE 110- Lab #3
//TIME SPENT: 10 minutes
//-----------------------------------------------------------*/

//All "import" lines must be before class
import java.util.Scanner; 

public class Lab3 {
	public static void main (String [] args) {
		// declaring variables:
		double finalexamGrade = 50.0;
		double midtermGrade = 50.0;
		double homeworkGrade = 0.0;
		double finalGrade = 0.0;
		// a character called letterGrade
		char letterGrade = ' ';
		// a variable scan of type Scanner
		Scanner scan = new Scanner(System.in);
		//asking for the homework grade
		System.out.println("Please input your homework grade: ");
		homeworkGrade = scan.nextDouble();
		//asking for the midterm grade
		System.out.println("Please input your midterm grade: ");
		midtermGrade = scan.nextDouble();
		//asking for the final grade 
		System.out.println("Please input your final exam grade: ");
		finalexamGrade = scan.nextDouble();
		//if statement validating the right grade entered 
		if (homeworkGrade >= 0 && homeworkGrade <= 100) {
			// calculating the final grade 
			homeworkGrade = (homeworkGrade * .25);
		} else {
			//explaining to the user why the input was wrong
			System.out.println("Homework grade can not be a negative number or greater then 100.");
		}
		
		if (midtermGrade >= 0 && midtermGrade <= 100) {
			midtermGrade = (midtermGrade * .25);
		} else {
			//explaining to the user why the input was wrong
			System.out.println("Midterm grade can not be a negative number or greater then 100.");
		}
	
		if (finalexamGrade >= 0 && finalexamGrade <= 100) {
			finalexamGrade = (finalexamGrade * .50);
		} else {
			//explaining to the user why the input was wrong
			System.out.println("Final exam grade can not be a negative number or greater then 100.");
		}
		finalGrade = finalexamGrade + midtermGrade + homeworkGrade; 
		//checking to see if they passed the class
		if (finalGrade >= 50) {
			letterGrade = 'P';
		} else {
			letterGrade ='F';
		}
		
		if (letterGrade == 'P') {
			System.out.println("Congragulations you have passed the class!");
		} else if (letterGrade == 'F') {
			System.out.println("You have not passed the class.");
		}
	}
}
