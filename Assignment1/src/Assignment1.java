//***********************************************************
// Name: Carrie Dunn
// Title: Expressions.java
// Author: Modified from an example in Big Java book
// Description: BMI calculator and expressions in java 
// Time spent: 30 minutes
// Date: 8/5/2017
//**************************************************************
/*
 a) 2.0 it prints the square root of b
 b) 81.0 it prints out the power of b
 c) 3  it prints out (b/c) + a rounded to the nearest whole number
 d) 4 it prints out 1 plus a
 e) 4 it prints out a plus 1
 f) 6 it prints out a + 1. since its after the two ++ operations it adds 2 before hand and then adds one. 
 g) 3 prints out d divided by c rounded to the nearest whole number 
 h) 3 prints out d divided by c rounded to the nearest whole number 
 i) 22 prints out ( a / d) then adds d and b
 j) 1 it print out the out put and rounds up to one
*/

//import scanner to the program 
import java.util.Scanner;
//import java text into program for formating
import java.text.*;
// class for assignment one
public class Assignment1 {
	// main class for the program
	public static void main(String[] args) {
		// declaring the scanner object 
		Scanner in = new Scanner(System.in);
		// declaring variables 	
		int height; 
		double weight; 
		double bmi;
		int inches; 
		int feet;
		final double BMIVAULE = 703;
		
		//getting the inputs from the user
		System.out.print("Please input your weight in pounds. ");
		weight = in.nextInt();
		System.out.println("Please enter your height. ");
		System.out.println("Feet: ");
		feet = in.nextInt();
		System.out.println("Inches: ");
		inches = in.nextInt();
		height = inches + (feet * 12);
		
		// calculating the bmi value 
		bmi = weight * BMIVAULE / Math.pow(height, 2);
		
	    //formating the bmi to only two decimal places
		DecimalFormat fmt = new DecimalFormat ("0.##");
		//displaying the results
		System.out.print("Your Body Mass Index is " + fmt.format(bmi));
		
	}
}