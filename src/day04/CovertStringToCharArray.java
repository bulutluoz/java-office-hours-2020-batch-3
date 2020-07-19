package day04;

import java.util.Arrays;

public class CovertStringToCharArray {

	public static void main(String[] args) {
		/*
		 * create a custom return type method accepts a name as parameter 
		 * and prints the name as a char array
		 * 
		 * (do not use toCharArray() method)
		 * 
		 * Input : John 
		 * Output : [J, o, h, n]
		 */

		String input="John";
		charArray(input);
		
	}
	public static void charArray(String input) {
		
		char output[]=new char[input.length()];
		
		for (int i = 0; i < input.length(); i++) {
			output[i]=input.charAt(i);
		}
		
		
		System.out.println(Arrays.toString(output));
	}
}