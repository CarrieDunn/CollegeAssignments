

//***********************************************************
// Name: Carrie Dunn
// Title: Asiignment4.java
// Description: Banking program using loops
// Time spent: 2 hours
// Date: 09/28/17
//**********************************************************
// Part 1 
// A) i is : 0
//	i is : 1
//	i is : 2
//	i is : 3
//	i is : 4
// B) 55 times
// C) 
//int x = 0; 
//Scanner scan = new Scanner(System.in);
//for ( x = 0; x < 0 && x > 100;) {
//	System.out.println("Please input a number");
//	x = scan.nextInt();
//}
import java.util.Scanner;
public class Assignment4 {
	public static void main (String [] args) {
		//declaring variables
				String fullName = ""; 
				int savings; 
				int checking; 
				int mainMenu;
				int depositMenu = 0;
				String accountType ="";
				boolean with2 = true;
				boolean with1 = true;
				boolean trans1 = false;
				boolean trans2 = true;
				int total;
				//scanner declartion
				Scanner scan = new Scanner(System.in);
				//User input
				System.out.println("Welcome to The Bank!");
				System.out.println("What is your name?");
				fullName = scan.nextLine();
				
				//number validation and savings deposit 
				do {
					System.out.println("How much would you like to deposit into your Savings?");
					savings = scan.nextInt();
					if (savings > 0) {
						//System.out.println("You deposited " + savings + " into your savings account.");
					} else {
						System.out.println("You must enter a positive ammount.");
						savings = 0;
					}
				} while (savings <= 0); 
			
				//deposit into checking
				do {
					System.out.println("How much would you like to deposit into your Checking?");
					checking = scan.nextInt();
					if (checking > 0) {
						//System.out.println("You deposited " + savings + " into your savings account.");
					} else {
						System.out.println("You must enter a positive ammount.");
						checking = 0;
					}
				} while (checking <= 0); 
			
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
				System.out.println(fullName + "'s" + accountType +"Balance is " + total + " (S:$ " + savings + ", C:$ " + checking + ")");
				//main menu
		do {
			with2 = false;
			with1 = false;
			trans1 = false; 
			trans2 = false;
	
				do {
					System.out.println("Banking Options: ");
					System.out.println("1) Deposit Money");
					System.out.println("2) Withdraw Money");
					System.out.println("3) Transfer Money");
					System.out.println("4) Quit");
					mainMenu = scan.nextInt();
					if (mainMenu > 4 ) {
					System.out.println("Invaild Choice");
					}
				} while (mainMenu > 4);
				
				//switch for the main menu
				switch(mainMenu)
		  		{
		  			case 1:
		  				//deposit menu
		  				do {
		  					System.out.println("Deposit Money Options: ");
			  				System.out.println("1) Deposit into checking");
			  				System.out.println("2) Deposit into savings");
			  				System.out.println("3) Cancel");
			  				depositMenu = scan. nextInt();
			  				if (depositMenu > 3) {
			  					System.out.println("Invaild Choice");
			  				}
		  				} while (depositMenu > 3);
		  				
		  				
		  				//switch for deposit menu
		  				switch (depositMenu) {
		  					case 1: 
		  						//making a deposit
		  						int deposit1;
		  						do {
		  							System.out.println("How much do you want to deposit?");
			  						deposit1 = scan.nextInt();
			  						if (deposit1 <= 0) {
			  							System.out.println("Invaild choice");
			  						}
		  						} while (deposit1 <= 0);
		  						
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
		  						System.out.println("After this transaction your balance is " + total + " (S:$ " + savings + ", C:$ " + checking + ")");
		  						System.out.println("We have added interest to your account! (S:$ " + intrest2 + " C:$ " +  intrest1 + " )");
		  						
		  						break;
		  						
		  					case 2:
		  						//deposit into savings
		  						int deposit2;
		  						do {
		  							System.out.println("How much do you want to deposit?");
			  						deposit2 = scan.nextInt();
			  						if (deposit2 <= 0) {
			  							System.out.println("Invaild choice");
			  						}
		  						} while (deposit2 <=0);
		  						System.out.println("You have deposited " + deposit2 + " into your savings account");
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
		  						System.out.println("After this transaction your balance is " + total + " (S:$ " + savings + ", C:$ " + checking + ")");
		  						System.out.println("We have added interest to your account! (S:$ " + intrest3 + " C:$ " +  intrest4 + " )");
		  						break;
		  						
		  					case 3: 
		  						//canceling the program
		  						System.out.println("You have Canceled the program");
		  						break;
		  				}
		  				break;
		  			case 2:
		  				//withdraw menu
		  				int withdrawMenu = 0;
		  				do {
		  					System.out.println("Withdraw Money Options: ");
			  				System.out.println("1) Withdraw from checking");
			  				System.out.println("2) Withdraw from savings");
			  				System.out.println("3) Cancel");
			  				withdrawMenu = scan.nextInt ();
			  				if (withdrawMenu > 3) {
			  					System.out.println("Invaild Choice");
			  				}
		  				} while (withdrawMenu > 3);

		  				//switch for withdraw menu
		  				switch (withdrawMenu) {
		  					case 1:
		  						int withdraw1 = 0;
		  						with1 = true;
		  						while (with1 == false) {
		  							System.out.println("How much do you want to withdraw?");
		  							withdraw1 = scan.nextInt();
		  							//checking is the withdraw is a positive number and is less then checking
		  							if (withdraw1 > checking) {
			  							System.out.println("The number you entered can not be more then your checking");
			  							with1 = false; 
			  						} if (withdraw1 < 0) {
			  							System.out.println("The number you entered was invaild.");
			  							with1 = false;
			  						}
			  						else {
			  						with1 = true;
			  						}
		  						} 
		  						
		  					//taking out the withdraw from the account
	  							System.out.println("You have withdrawed " + withdraw1 +" from checking.");
	  							checking = checking - withdraw1;
	  							total = savings + checking;
	  							System.out.println("You account balance is " + total + " (S:$ " + savings + ", C:$ " + checking + ")");
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
	  							System.out.println("We have added interest to your account! (S:$ " + intrest2 + " C:$ " +  intrest1 + " )");
		  					
		  							
		  						break;
		  					case 2:
		  						//withdraw from savings
		  						int withdraw2 = 0;
		  						
		  						while (with2 == false) {
			  						System.out.println("How much do you want to withdraw?");
			  						withdraw2 = scan.nextInt();
			  						//checking the savings withdraw is valid
			  						if(withdraw2 > savings) {
			  							System.out.println("The number you entered was invaild.");
			  							with2 = false;
			  						} else if (withdraw2 < 0) {
			  							System.out.println("The number you entered was invaild.");
			  							with2 = false;
			  						} else {
			  							with2 = true;
			  						}
		  						}
		  						//printing the withdraw and new account balance
		  							System.out.println("You have withdrawed " + withdraw2 +" from savings");
		  							savings = savings - withdraw2;
		  							total = savings + checking;
		  							System.out.println("After this transaction your balance is " + total + " (S:$ " + savings + ", C:$ " + checking + ")");
		  							//checking the interest based off account
		  							double intrest3 = 0;
		  	  						double intrest4 = 0;
		  	  						if (total < 1000) {
		  	  							intrest3 = (checking *.025) + checking; 
		  	  							intrest4 = (savings *.025) + savings;
		  	  						} else if (total <= 5000) {
		  	  							intrest3 = (checking *.035) + checking;
		  	  							intrest4 = (savings *.035) + savings;
		  	  						} else if (total >= 5001) {
		  	  							intrest3 = (checking *.045) + checking;
		  	  							intrest4 = (savings *.045) + savings;
		  	  						}
		  							System.out.println("We have added interest to your account! (S:$ " + intrest4 + " C:$ " +  intrest3 + " )");
		  						
		  						break;
		  					case 3: 
		  						//withdraw cancel
		  						System.out.println("Cancel Withdraw");
		  						break;
		  				}
		  				break;
		  			case 3:
		  				//transfer money menu
		  				int transferMenu = 0;
		  				do {
		  					System.out.println(fullName + "'s Account Balance is " + total + " (S:$ " + savings + ", C:$ " + checking + ")");
			  				System.out.println("Transfer Money Options: ");
			  				System.out.println("1) Transfer from checking to savings");
			  				System.out.println("2) Transfer from savings to checking");
			  				System.out.println("3) Cancel");
			  				transferMenu = scan.nextInt();
			  				if (transferMenu > 3) {
			  					System.out.println("Invaild Choice");
			  				}
		  				} while (transferMenu >3);
		  				//switch for transfer money
		  				switch (transferMenu) {		  			
		  					case 1:
		  						//transfer between checking and savings
		  						int transfer = 0;
		  						while (trans1 == false) {
		  							System.out.println("How much would you like to transfer?");
			  						transfer = scan.nextInt();
			  						if(transfer > checking ) {
			  							System.out.println("The number you entered was invaild.");
			  							trans1 = false;
			  						} else if (transfer < 0) {
			  							System.out.println("The number you entered was invaild.");
			  							trans1 = false;
			  						} else {
			  						trans1 = true;
			  						}
		  						}
		  						
		  							//doing the transfer
		  							System.out.println("You have transfered " + transfer +" from your checking to your savings");
		  							checking = checking - transfer; 
		  							savings = savings + transfer;
		  							total = savings + checking;
		  							System.out.println("After this transaction your balance is " + total + " (S:$ " + savings + ", C:$ " + checking + ")");
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
		  							System.out.println("We have added interest to your account! (S:$ " + intrest2 + " C:$ " +  intrest1 + " )");
		  							
		  						break;
		  					case 2: 
		  						//transfer from savings into checking
		  						
		  						int transfer1 = 0;
		  						while (trans2 == false) {
		  							System.out.println("How much would you like to transfer?");
			  						transfer1 = scan.nextInt();
			  						//validating the transfer
			  						if (transfer1 > savings) {
			  							System.out.println("The number you entered was invaild.");
			  							trans2 = false;
			  						} else if (transfer1 < 0) {
			  							System.out.println("The number you entered was invaild.");
			  							trans2 = false;
			  						} 
			  						trans2 = true;
		  						} 
		  						
		  					
		  							//doing the transfer
		  							System.out.println("You have transfered " + transfer1 + " from your savings to your checking");
		  							savings = savings - transfer1;
		  							checking = checking + transfer1;
		  							total = savings + checking;
		  							System.out.println("After this transaction your balance is " + total + " (S:$ " + savings + ", C:$ " + checking + ")");
		  							//checking the interest
		  							double intrest3 = 0;
		  	  						double intrest4 = 0;
		  	  						if (total < 1000) {
		  	  							intrest3 = (checking *.025) + checking; 
		  	  							intrest4 = (savings *.025) + savings;
		  	  						} else if (total <= 5000) {
		  	  							intrest3 = (checking *.035) + checking;
		  	  							intrest4 = (savings *.035) + savings;
		  	  						} else if (total >= 5001) {
		  	  							intrest3 = (checking *.045) + checking;
		  	  							intrest4 = (savings *.045) + savings;
		  	  						}
		  							System.out.println("We have added interest to your account! (S:$ " + intrest4 + " C:$ " +  intrest3 + " )");
		  						
		  						break;
		  					case 3: 
		  						//canceling the transfer 
		  						System.out.println("Cancel Transfer");
		  						break;
		  				}
		  				break;
		  				//quitting the whole program
		  			case 4:
						System.out.println("You have quit the program");
						break;
		  		}
		} while (mainMenu != 4); 
	}
}
