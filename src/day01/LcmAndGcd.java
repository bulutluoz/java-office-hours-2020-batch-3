package day01;

import java.util.Scanner;

public class LcmAndGcd {

	public static void main(String[] args) {
		/*
		 * Ask user to enter 2 integer then find GCD (Greatest Common Divisor) and 
		 * LCM (Least Common Multiple)
		 * (if user enter 30 and 40 GCD = 10 and LCM = 120) 
		 * 
		 */

		// GCD 1- get 2 numbers from user
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter 2 integer to find GCD and LCM");
		
		int num1= scan.nextInt();
		int num2= scan.nextInt();
		
		System.out.println("Your first number is =" + num1 );
		System.out.println("Your second number is =" + num2 );
		
		// 2- start from any of numbers and check both of numbers can divide by it
		// 3- first number which provide our condition is GCD
		int gcd=num1;
		while (gcd>1) {
			if (num1%gcd==0 && num2%gcd==0) {
				System.out.println("for " + num1 + " and " + num2 + " GCD is = " + gcd );
				break;
			}
			gcd--;
		}
		
		// LCM 4 - start from any of numbers and check if it can divide by our two numbers
		// 5- the first number which provide our condition is LCM
		
	    int lcm=num1;
		while (lcm<=num1*num2) {
			if (lcm%num1==0 && lcm%num2==0) {
				System.out.println("for " + num1 + " and " + num2 + " LCM is = " + lcm );
				break;
			}
			lcm++;
		}
		scan.close();

	}

}