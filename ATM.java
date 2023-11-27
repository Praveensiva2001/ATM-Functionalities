package com.atm;

import java.util.Scanner;

public class ATM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pin = 1234;
		int balance = 15000;
		int deposit = 0;
		int withdrawal = 0;
		String name;
		
		System.out.println("Enter your Password");
		int password = sc.nextInt(); // getting the password from user
		
		if(password == pin)
		{
			System.out.println("Please enter your Name");
			name = sc.next();
	        System.out.println("Welcome to Besant Bank " +  name );

			
			while(true)
			{
				System.out.println();
				System.out.println("Press 1 to CHECK YOUR BALANCE");
				System.out.println("Press 2 to DEPOSIT THE AMOUNT");
				System.out.println("Press 3 to WITHDRAWAL");
				System.out.println("Press 4 to PRINT THE RECEIPT");
				System.out.println("Press 5 to EXIT");
				System.out.println();
				
				int userInput = sc.nextInt();
				
				switch(userInput) {
				case 1 : 
					System.out.println("Your Current Balance is " + balance);
					break;
					
				case 2 :
					System.out.println("Enter your amount to Deposit");
					deposit = sc.nextInt();
					balance = deposit + balance;
					// 15000 = 1000 + 15000 =>16000
					break;
					
				case 3 :
					System.out.println("Enter the amount to Withdraw");
					withdrawal = sc.nextInt();
					if(balance > withdrawal)
					{
						balance = balance - withdrawal;
						System.out.println("You have successfully withdrawed the amount");
					}
					else 
					{
						System.out.println("Sorry for the Inconvenience " + name);
						System.out.println("Insufficient Amount in your Account");
						System.out.println("Please Check your balance and try once again");
					}
					break;
					
				case 4 :
					System.out.println("Welcome to Besant ATM ");
					System.out.println("Here comes your Receipt");
					System.out.println("Available Balance is " + balance);
					System.out.println("Withdrawal amount is " + withdrawal);
					System.out.println("Deposited amount is " + deposit);
					break;
					
				}
				if(userInput == 5)
				{
					System.out.println("THANK YOU");
					System.out.println("VISIT AGAIN");
					break;
				}
			}
			
		}
		else
		{
			System.out.println("You have Entered the Wrong Pin");
		}
	}
}
