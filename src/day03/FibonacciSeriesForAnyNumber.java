package day03;

import java.util.ArrayList;
import java.util.List;

public class FibonacciSeriesForAnyNumber {
	static boolean fibo;
	static int num1;
	static int num2;

	public static void main(String[] args) {
		/*
		 * Write a method which accepts an integer as parameter 
		 * and returns “true” if it is a Fibonacci number
		 * 
		 * Then check the result and print 
		 * “Fibonacci series contain your number” or
		 * “Fibonacci series contain that numbers : X and Y” 
		 * (X and Y should be the closest Fibonacci numbers to given number X<num<Y)
		 */

		int input = 250;
		checkFibonacci(input);
		
		
		if (fibo) {
			System.out.println("Fibonacci series contain your number");
			
		}else System.out.println("Fibonacci series contain that numbers :"+num1+ " and " + num2);
		
	}
	
	public static boolean checkFibonacci(int input) {
		

		List<Integer> fibonacci = new ArrayList<>();
		
		fibonacci.add(0);
		fibonacci.add(1);
		
		
		for (int i = 2; i < input; i++) {
			
			fibonacci.add(fibonacci.get(i-2)+fibonacci.get(i-1));
			
			if (fibonacci.get(i)>=input) {
				break;
			}
		}
		if((fibonacci.get(fibonacci.size()-1))==input) {
			fibo=true;
		}else fibo=false;
		num1= fibonacci.get(fibonacci.size()-2);
		num2= fibonacci.get(fibonacci.size()-1);
		
		return fibo;
	}
	
	

}
