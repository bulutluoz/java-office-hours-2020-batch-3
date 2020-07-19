package day02;

import java.util.Scanner;

public class CheckingPassword {

	public static void main(String[] args) {
		/*
		 * ask user to create a password.
		 * it should have at least 1 special char 
		 * 1 uppercase 
		 * 1 lowercase 
		 * 1 digit 
		 * the length of password should be at least 8 characters
		 */
		//1- Ask user to create a password. tell the conditions
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please create a password");
		System.out.println("Password must contain 1 special char “(!”#$%^’*+-.,/)”, ");
		System.out.println("1 uppercase, 1 lowercase , 1 digit ");
		System.out.println("password should be at least 8 characters");
		
		String password = scan.nextLine();
		
		//2- Check password with all conditions
		int flagSpecial=0;
		int flagUppercase=0;
		int flagLowercase=0;
		int flagDigit=0;
		boolean pass = true;
		
		
		for (int i = 0; i < password.length(); i++) {
			
			if (password.charAt(i)>='!' && password.charAt(i)<='/' ) {
				flagSpecial++;
			} else if (password.charAt(i)>='A' && password.charAt(i)<='Z' ) {
				flagUppercase++;
			}else if (password.charAt(i)>='a' && password.charAt(i)<='z' ) {
				flagLowercase++;
			}else if (password.charAt(i)>='0' && password.charAt(i)<='9' ) {
				flagDigit++;	
			} else {System.out.println("Some character of your password are not invalid");
				break;
			}
		}
		
		
		//3-Print the result if password is created successfully or not
		
		if (password.length()<8) {
			System.out.println("Password must be at least 8 Characters");
			pass = false;
		} if (flagSpecial==0) {
			System.out.println("Password must contain at least 1 special character");
			pass = false;
		} if (flagUppercase==0) {
			System.out.println("Password must contain at least 1 Uppercase letter");
			pass = false;
		} if (flagLowercase==0) {
			System.out.println("Password must contain at least 1 Lowercase letter");
		} if (flagDigit==0) {
			System.out.println("Password must contain at least 1 digit");
		} if (pass)System.out.println("Your password created succesfully");
		scan.close();
		
	}

}