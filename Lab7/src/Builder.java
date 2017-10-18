/*-------------------------------------------------------------------------
// AUTHOR: Carrie Dunn
// FILENAME: Lab7.java
// SPECIFICATION: object practice
// FOR: CSE 110- Lab #7
// TIME SPENT: 1 hour
//-----------------------------------------------------------*/
public class Builder{


	// declare some variables of different types:
	// an String called name
	private String name;



	//Defining the constructors
	
	public Builder (String name)
	{
	// write the segment of code that assigns input data to the data members
		 this.name = name;
		
	}


	//Supply the methods

	public String getlName()
	{
	// write a line of code
	//that returns the name
		return name;
	}

	public String makeRow(int n, String s) {
	// Given an int n and string s, return a string that represents n copies of s in one row.
	// Example: n = 5, s = '*', return a string '*****'
		String temp = s;
		s = "";
		for(int i = 0; i < n; i++) {
			s += temp;
		}
		return s;
		
	}


	public void makePyramid(int n, String s) {
	//Make use of makeRow method and System.out.println
	// to print the pyramid.
	// note this method does not return anything.
		String output = "";
		int i = 1; 
		for ( i = 1; i<= n; i+=2) {
			output = makeRow(i,s);
			for (int j = 0; j < (n-i)/2; j++) {
				System.out.print("_");
			}
			System.out.print(output);
			for (int j = 0; j < (n-i)/2; j++) {
				System.out.print("_");
			}
			System.out.println(" ");
		}
		
	}

}