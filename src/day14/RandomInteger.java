package day14;

import java.util.Random;

public class RandomInteger {
	
	public static void main(String[] args) {
		/* Write a return method that accepts an integer as input
		 * and creates a random integer which less than input
		 * and prints the sum of it's digits
		 * 
		 * Eg : Input : 2548
		 *      Random Integer = 1324
		 *      Output " I created 1324 and sum of it's digits is =10 "
		 * 
		 */
		
		int input=2458;
		createRandomInt(input);
	}

	public static void createRandomInt(int input) {
		
		int digit =0;
		int sum=0;
		
		
		Random rnd = new Random();
		int randomInt= rnd.nextInt(input);
		
		int temp=randomInt;
		
		while(temp>0) {
			digit=temp%10;
			sum+=digit;
			temp/=10;
		}
		
		System.out.println(" I created " + randomInt+"  and sum of it's digits is = " + sum );
	}

	

		



}
