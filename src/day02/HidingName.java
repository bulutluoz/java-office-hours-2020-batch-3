package day02;

import java.util.Scanner;

public class HidingName {

	public static void main(String[] args) {
		/*
		 * Ask user Name, Surname and credit card numbers than convert it to special
		 * form
		 * 
		 * (Check credit card number, if there aren’t 16 digit print 
		 * “Invalid credit card number”
		 * 
		 * Input : John White 1234234534561478 
		 * Output : Name : J*** W**** 
		 *          CCN  : **** **** **** 1478 
		 *  (Initials for name and surname should be uppercase) 
		 */
		
		// 1) Get data from user
		  Scanner scan = new Scanner(System.in);
		  System.out.println("Please enter your first name");
		  String firstName= scan.next();
		  System.out.println("Please enter your surname");
		  String surname= scan.next();
		  System.out.println("Please enter your Credit Card Number");
		  String ccn = scan.next();
		  
		// 2) Check CCN if it has 16 digit or not
		  if (ccn.length()!=16) { 
			  System.out.println("Your credit card number is invalid");
			
		}else {
			// 3) Convert data to excepted form
			firstName = firstName.substring(0, 1).toUpperCase()+ firstName.substring(1).replaceAll("\\w", "*");
			surname = surname.substring(0, 1).toUpperCase()+ surname.substring(1).replaceAll("\\w", "*");
			ccn= "**** **** ****"+ ccn.substring(12);
			
			
			// 4) print data on console
			System.out.println("Name  : " +  firstName + " " + surname);
			System.out.println( "CCN   :" + ccn);
			
		}
		  

		  scan.close();
	}

}
