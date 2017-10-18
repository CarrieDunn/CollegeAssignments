/*-------------------------------------------------------------------------
// AUTHOR: Carrie Dunn
// FILENAME: Assignment5.java
// SPECIFICATION: bank account objects
// Lab Letter N. TA: Vyom
// FOR: CSE 110- MWF 2:00-2:50
// TIME SPENT: 3 hours
//----------------------------------------------------------------------*/ 
public class BankAccount {

	String enteredID = "???";
	String initID = "???";
	double enteredAmount1, enteredAmount2, enteredAmount = 0.0;
	double initChecking = 0;
	double initSaving = 0;

	
	BankAccount (String enteredID, double enteredAmount1, double enteredAmount2){
		initID = enteredID; 
		initChecking = enteredAmount1; 
		initSaving = enteredAmount2;
	}
	
	
	private String getId() {
		// access the accounts unique identifier 
		return initID; 
	}
	
	public double getChecking() {
		//access this accounts current checking balance
		return initChecking;
	}
	
	public double getSaving() {
		//access this accounts current savings balance
		return initSaving;
	}
	
	public double getBalance() {
		// returns the total balance
		return initChecking + initSaving; 
	}
	
	public void setID (String name){
		//sets the id 
		initID = name;
	}
	
	public void deposit (double depositAmount) {
		//credits this accounts deposit amount
		enteredAmount = depositAmount;
		if (depositAmount > 0 ) {
			 initChecking = depositAmount + initChecking;
		} else {
			initChecking = enteredAmount1; 
		} 
	}
	
	public boolean withdraw ( double withdrawAmount) {
		/*Deposit this account's checking balance by withdrawAmount if 
		 * it is positive and not greater than this account's current balance. 
		 * It returns true if 0 <withdrawAmount <=the balance
		 */
		enteredAmount = withdrawAmount; 
		if (withdrawAmount <= initChecking && withdrawAmount > 0) {
			initChecking = initChecking - withdrawAmount; 
			return true; 
		} else {
			return false; 
		}
	}
	
	public void addInterest () {
		/* Adds 2.5 percent interest to the account if the account balance is
		less than or equal to $1000.00, 3.5 percent if the account balance
		is between 1000 and 5000 inclusive, and 4.5 percent if the
		minimum balance is 5000. */
		if (initChecking <= 1000) {
			initChecking = (initChecking * .025) + initChecking;
		} else if (initChecking < 5000) {
			initChecking = (initChecking * .035) + initChecking;
		} else if (initChecking >= 5000) {
			initChecking = (initChecking * .045) + initChecking;
		}
	}
	
	public boolean equals ( String is ) {
		//checks for proper id and returns true of this bankAccount has the same id as the user input
		enteredID = is;
		if (enteredID.equals(initID)) {
			return true; 
		} else {
			return false; 
		}
	}
	
	
	
	public String toString () {
		/* Returns a String with information on each BankAccount using
		the following format: (make sure to print the balances with
		currency Format)
		ID: 23456
		Checking Balance: $40,000.00
		Saving Balance: $41,800.00 */
		System.out.println("ID: " + initID);
		System.out.println("Checking Balance: " + initChecking);
		System.out.println("Saving Balance: " + initSaving);
		return "";
		
	}
	
}
