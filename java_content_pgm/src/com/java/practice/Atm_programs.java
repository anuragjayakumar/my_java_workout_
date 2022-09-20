package com.java.practice;

import java.util.Scanner;


public class Atm_programs {

	public static void main(String[] args) {
		int balance = 500, withdraw = 0, deposit, my_account_number = 500101011, phone_Number = 955172281;
		String lang;
		 short pin = 1999 ;

		while (true) {

			Scanner sc = new Scanner(System.in);

			System.out.println("WELCOME TO  SBI ATM ");
			System.out.println("PRESS 1 FOR WITHDRAW");
			System.out.println("PRESS 2 FOR DEPOSIT");
			System.out.println("PRESS 3 FOR CHECK BALANCE");
			System.out.println("PRESS 4 FOR EXIT");
			int atm = sc.nextInt();

			switch (atm) {
			case 1:
				// choose language 
				System.out.println("ENTER THE LANGUAGE ");
				lang = sc.next();
				lang = "English";
				if (lang == "English") {
					System.out.println("you selected English lanauage");

				} else if (lang == "Hindi") {
					System.out.println("you selected Hindi lanauage");

				} else {
					System.out.println("unselected language");

				}
				// Enter pin
				System.out.println("Enter your pin");
				pin = sc.nextShort();
				if(pin == 1999) {
					System.out.println("Continue");
				}else {
					System.err.println("incorrect_pin******");
					
				}
				
				

				System.out.println("ENTER THE WITHDRAWAL AMOUNT ");
				withdraw = sc.nextInt();
				if (balance >= withdraw) {

					balance = balance - withdraw;
					System.out.println("please collect your cash");

				} else {
					System.err.println(" insufficient balance ");

				}
				System.out.println(" ");
				break;
			case 2:

				// Account Number process
				System.out.println("ENTER YOUR ACCOUNT NUMBER ");
				my_account_number = sc.nextInt();
				if (my_account_number == 500101011) {
					System.out.println("STATE BANK OF INDIA , PORUR BRANCH");

				} else {
					System.err.println("invalid account number");

				}
				// phone number process
				System.out.println("ENTER YOUR PHONE NUMBER");
				phone_Number = sc.nextInt();
				if (phone_Number == 955172281) {
					System.out.println("ACCOUNT HOLDER NAME : ANURAG , ISFC :SBIY88759");

				} else {
					System.err.println("invalid Phone Number");

				}
				// deposit amount
				System.out.println("Enter The depositing amount");
				deposit = sc.nextInt();
				balance = balance + deposit;
				System.out.println("YOUR AMOUNT HAS BEEN SUCESSFULLY DEPOSITED......THANK YOU");

				break;
			case 3:
				System.out.println("Balance : " + balance);
				break;

			case 4:
				System.exit(0);

			}
		}

	}
}
