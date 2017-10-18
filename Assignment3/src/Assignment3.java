/*-------------------------------------------------------------------------
// AUTHOR: Carrie Dunn
// FILENAME: Assignment3.java
// SPECIFICATION: A banking program
// Lab Letter N. TA: Vyom
// FOR: CSE 110- MWF 2:00-2:50
// TIME SPENT: 1 hour
//----------------------------------------------------------------------*/ 
//import statement
import java.util.Scanner; 
//assignment class
public class Assignment3 {
	//main class
	public static void main (String [] args) {
		//declaring variables
		String fullName = ""; 
		int savings; 
		int checking; 
		int mainMenu;
		String accountType ="";
		int total;
		//scanner declartion
		Scanner scan = new Scanner(System.in);
		//User input
		System.out.println("Welcome to The Bank!");
		System.out.println("What is your name?");
		fullName = scan.nextLine();
		System.out.println("How much would you like to deposit into your Savings?");
		savings = scan.nextInt();
		//number validation
		if (savings >= 0) {
			//System.out.println("You deposited " + savings + " into your savings account.");
		} else {
			System.out.println("You must enter a positive ammount.");
			savings = 0;
		}
		System.out.println("How much would you like to deposit into your Checking?");
		checking = scan.nextInt();
		//number validation
		if (checking >= 0) {
			//System.out.println("You deposited " + checking + " into your checking account.");
		} else {
			System.out.println("You must enter a positive ammount.");
			checking = 0;
		}
		total = savings + checking; 
		//checking account type
		if (total < 1000) {
				accountType =" Basic Account ";
			} else if (total <= 5000) {
				accountType =" Premium Account ";
			} else if (total >= 5001) {
				accountType =" Platinum Account ";
			}
		// printing the initial balance 
		System.out.println(fullName + "'s" + accountType +"Balance is " + total + " (S: " + savings + ", C: " + checking + ")");
		//main menu
		System.out.println("Banking Options: ");
		System.out.println("1) Deposit Money");
		System.out.println("2) Withdraw Money");
		System.out.println("3) Transfer Money");
		System.out.println("4) Quit");
		mainMenu = scan.nextInt();
		//switch for the main menu
		switch(mainMenu)
  		{
  			case 1:
  				//deposit menu
  				int depositMenu = 0;
  				System.out.println("Deposit Money Options: ");
  				System.out.println("1) Deposit into checking");
  				System.out.println("2) Deposit into savings");
  				System.out.println("3) Cancel");
  				depositMenu = scan. nextInt();
  				//switch for deposit menu
  				switch (depositMenu) {
  					case 1: 
  						//making a deposit
  						int deposit1;
  						System.out.println("How much do you want to deposit?");
  						deposit1 = scan.nextInt();
  						System.out.println("You have deposited " + deposit1 +" into your checking account");
  						checking = checking + deposit1;
  						total = savings + checking;
  						//adding the interest to the deposit
  						double intrest1 = 0;
  						double intrest2 = 0;
  						if (total < 1000) {
  							intrest1 = (checking *.025) + checking; 
  							intrest2 = (savings *.025) + savings;
  						} else if (total <= 5000) {
  							intrest1 = (checking *.035) + checking;
  							intrest2 = (savings *.035) + savings;
  						} else if (total >= 5001) {
  							intrest1 = (checking *.045) + checking;
  							intrest2 = (savings *.045) + savings;
  						}
  						//out putting the interest and final account balance after the deposit
  						System.out.println("After this transaction your balance is " + total + " (S: " + savings + ", C: " + checking + ")");
  						System.out.println("We have added interest to your account! (S: " + intrest2 + " C: " +  intrest1 + " )");
  						break;
  						
  					case 2:
  						//deposit into savings
  						int deposit2;
  						System.out.println("How much do you want to deposit?");
  						deposit2 = scan.nextInt();
  						System.out.println("You have deposited " + deposit2 + "into your savings account");
  						savings = savings + deposit2;
  						total = savings + checking;
  						//adding the interest to the saving deposit
  						double intrest3 = 0;
  						double intrest4 = 0;
  						if (total < 1000) {
  							intrest4 = (checking *.025) + checking; 
  							intrest3 = (savings *.025) + savings;
  						} else if (total <= 5000) {
  							intrest4 = (checking *.035) + checking;
  							intrest3 = (savings *.035) + savings;
  						} else if (total >= 5001) {
  							intrest4 = (checking *.045) + checking;
  							intrest3 = (savings *.045) + savings;
  						}
  						//output of the deposit
  						System.out.println("After this transaction your balance is " + total + " (S: " + savings + ", C: " + checking + ")");
  						System.out.println("We have added interest to your account! (S: " + intrest3 + " C: " +  intrest4 + " )");
  						break;
  						
  					case 3: 
  						//canceling the program
  						System.out.println("You have Canceled the program");
  						System.out.println("Your account balance is " + total + " (S: " + savings + ", C: " + checking + ")");
  						//interest for the initial value
  						double intrest5 = 0;
	  						double intrest6 = 0;
	  						if (total < 1000) {
	  							intrest6 = (checking *.025) + checking; 
	  							intrest5 = (savings *.025) + savings;
	  						} else if (total <= 5000) {
	  							intrest6 = (checking *.035) + checking;
	  							intrest5 = (savings *.035) + savings;
	  						} else if (total >= 5001) {
	  							intrest6 = (checking *.045) + checking;
	  							intrest5 = (savings *.045) + savings;
	  						}
							System.out.println("We have added interest to your account! (S: " + intrest5 + " C: " +  intrest6 + " )");
  						break;
  				}
  				break;
  			case 2:
  				//withdraw menu
  				int withdrawMenu = 0;
  				System.out.println("Withdraw Money Options: ");
  				System.out.println("1) Withdraw from checking");
  				System.out.println("2) Withdraw from savings");
  				System.out.println("3) Cancel");
  				withdrawMenu = scan.nextInt ();
  				//switch for withdraw menu
  				switch (withdrawMenu) {
  					case 1:
  						System.out.println("How much do you want to withdraw?");
  						int withdraw1 = scan.nextInt();
  						//checking is the withdraw is a positive number and is less then checking
  						if (withdraw1 > checking) {
  							System.out.println("The number you entered was invaild.");
  						} else if (withdraw1 < 0) {
  							System.out.println("The number you entered was invaild.");
  						} else {
  							//taking out the withdraw from the account
  							System.out.println("You have withdrawed " + withdraw1 +" from checking.");
  							checking = checking - withdraw1;
  							total = savings + checking;
  							System.out.println("You account balance is " + total + " (S: " + savings + ", C: " + checking + ")");
  							//calculating the interest
  							double intrest1 = 0;
  	  						double intrest2 = 0;
  	  						if (total < 1000) {
  	  							intrest1 = (checking *.025) + checking; 
  	  							intrest2 = (savings *.025) + savings;
  	  						} else if (total <= 5000) {
  	  							intrest1 = (checking *.035) + checking;
  	  							intrest2 = (savings *.035) + savings;
  	  						} else if (total >= 5001) {
  	  							intrest1 = (checking *.045) + checking;
  	  							intrest2 = (savings *.045) + savings;
  	  						}
  							System.out.println("We have added interest to your account! (S: " + intrest2 + " C: " +  intrest1 + " )");
  						}
  						break;
  					case 2:
  						//withdraw from savings
  						System.out.println("How much do you want to withdraw?");
  						int withdraw2 = scan.nextInt();
  						//checking the savings withdraw is valid
  						if(withdraw2 > savings) {
  							System.out.println("The number you entered was invaild.");
  						} else if (withdraw2 < 0) {
  							System.out.println("The number you entered was invaild.");
  						}else {
  							//printing the withdraw and new account balance
  							System.out.println("You have withdrawed " + withdraw2 +" from savings");
  							savings = savings - withdraw2;
  							total = savings + checking;
  							System.out.println("After this transaction your balance is " + total + " (S: " + savings + ", C: " + checking + ")");
  							//checking the interest based off account
  							double intrest1 = 0;
  	  						double intrest2 = 0;
  	  						if (total < 1000) {
  	  							intrest1 = (checking *.025) + checking; 
  	  							intrest2 = (savings *.025) + savings;
  	  						} else if (total <= 5000) {
  	  							intrest1 = (checking *.035) + checking;
  	  							intrest2 = (savings *.035) + savings;
  	  						} else if (total >= 5001) {
  	  							intrest1 = (checking *.045) + checking;
  	  							intrest2 = (savings *.045) + savings;
  	  						}
  							System.out.println("We have added interest to your account! (S: " + intrest2 + " C: " +  intrest1 + " )");
  						}
  						break;
  					case 3: 
  						//withdraw cancel
  						System.out.println("Cancel Withdraw");
  						System.out.println("Your account balance is " + total + " (S: " + savings + ", C: " + checking + ")");
  						//interest off intital value
  						double intrest1 = 0;
	  						double intrest2 = 0;
	  						if (total < 1000) {
	  							intrest1 = (checking *.025) + checking; 
	  							intrest2 = (savings *.025) + savings;
	  						} else if (total <= 5000) {
	  							intrest1 = (checking *.035) + checking;
	  							intrest2 = (savings *.035) + savings;
	  						} else if (total >= 5001) {
	  							intrest1 = (checking *.045) + checking;
	  							intrest2 = (savings *.045) + savings;
	  						}
							System.out.println("We have added interest to your account! (S: " + intrest2 + " C: " +  intrest1 + " )");
  						break;
  				}
  				break;
  			case 3:
  				//transfer money menu
  				System.out.println(fullName + "'s Account Balance is " + total + " (S: " + savings + ", C: " + checking + ")");
  				int transferMenu = 0;
  				System.out.println("Transfer Money Options: ");
  				System.out.println("1) Transfer from checking to savings");
  				System.out.println("2) Transfer from savings to checking");
  				System.out.println("3) Cancel");
  				transferMenu = scan.nextInt();
  				//switch for transfer money
  				switch (transferMenu) {
  					case 1: 
  						//transfer between checking and savings
  						System.out.println("How much would you like to transfer?");
  						int transfer = scan.nextInt();
  						if(transfer > checking ) {
  							System.out.println("The number you entered was invaild.");
  						} else if (transfer < 0) {
  							System.out.println("The number you entered was invaild.");
  						} else {
  							//doing the transfer
  							System.out.println("You have transfered " + transfer +" from your checking to your savings");
  							checking = checking - transfer; 
  							savings = savings + transfer;
  							total = savings + checking;
  							System.out.println("After this transaction your balance is " + total + " (S: " + savings + ", C: " + checking + ")");
  							//checking the interest
  							double intrest1 = 0;
  	  						double intrest2 = 0;
  	  						if (total < 1000) {
  	  							intrest1 = (checking *.025) + checking; 
  	  							intrest2 = (savings *.025) + savings;
  	  						} else if (total <= 5000) {
  	  							intrest1 = (checking *.035) + checking;
  	  							intrest2 = (savings *.035) + savings;
  	  						} else if (total >= 5001) {
  	  							intrest1 = (checking *.045) + checking;
  	  							intrest2 = (savings *.045) + savings;
  	  						}
  							System.out.println("We have added interest to your account! (S: " + intrest2 + " C: " +  intrest1 + " )");
  						}
  						break;
  					case 2: 
  						//transfer from savings into checking
  						System.out.println("How much would you like to transfer?");
  						int transfer1 = scan.nextInt();
  						//validating the transfer
  						if (transfer1 > savings) {
  							System.out.println("The number you entered was invaild.");
  						} else if (transfer1 < 0) {
  							System.out.println("The number you entered was invaild.");
  						} else {
  							//doing the transfer
  							System.out.println("You have transfered " + transfer1 + " from your savings to your checking");
  							savings = savings - transfer1;
  							checking = checking + transfer1;
  							total = savings + checking;
  							System.out.println("After this transaction your balance is " + total + " (S: " + savings + ", C: " + checking + ")");
  							//checking the interest
  							double intrest1 = 0;
  	  						double intrest2 = 0;
  	  						if (total < 1000) {
  	  							intrest1 = (checking *.025) + checking; 
  	  							intrest2 = (savings *.025) + savings;
  	  						} else if (total <= 5000) {
  	  							intrest1 = (checking *.035) + checking;
  	  							intrest2 = (savings *.035) + savings;
  	  						} else if (total >= 5001) {
  	  							intrest1 = (checking *.045) + checking;
  	  							intrest2 = (savings *.045) + savings;
  	  						}
  							System.out.println("We have added interest to your account! (S: " + intrest2 + " C: " +  intrest1 + " )");
  						}
  						break;
  					case 3: 
  						//canceling the transfer 
  						System.out.println("Cancel Transfer");
  						System.out.println("After this transaction your balance is " + total + " (S: " + savings + ", C: " + checking + ")");
  						//checking the interest on the initial value
  						double intrest1 = 0;
	  						double intrest2 = 0;
	  						if (total < 1000) {
	  							intrest1 = (checking *.025) + checking; 
	  							intrest2 = (savings *.025) + savings;
	  						} else if (total <= 5000) {
	  							intrest1 = (checking *.035) + checking;
	  							intrest2 = (savings *.035) + savings;
	  						} else if (total >= 5001) {
	  							intrest1 = (checking *.045) + checking;
	  							intrest2 = (savings *.045) + savings;
	  						}
							System.out.println("We have added interest to your account! (S: " + intrest2 + " C: " +  intrest1 + " )");
  						break;
  				}
  				break;
  				//quitting the whole program
  			case 4:
				System.out.println("You have quit the program");
				break;
  		}
	
	}
}
