package day02;

import java.util.Scanner;

public class FindingFrequencyWithMethod {
static String strWithFrequency= "";
	
	public static void main(String[] args) {
		/*
		 * Interview question
		 * 
		 * write a return method that can find the frequency of characters (with case
		 * sensitivity)
		 * 
		 * Input = AAABBCDD output = A3B2C1D2 
		 */

		// 1- get a string from user
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Please enter a word to find frequencies of characters");
		String str= scan.next();
		
		
		
		frequency(str);
		System.out.println(strWithFrequency);
		scan.close();

	}
	
	public static String frequency(String str) {
		// 2- take every single character and find its occurrences
		int frequency=0;
		for (int i = 0; i < str.length(); i++) {
			for (int j = i; j < str.length(); j++) {
				if (str.substring(i, i+1).equals(str.substring(j, j+1))) {
					frequency++;
				}
			} 
			if (!strWithFrequency.contains(str.substring(i, i+1))) {
				strWithFrequency=strWithFrequency+str.charAt(i)+frequency;
			}
			frequency=0;
		}

		return strWithFrequency;
	}

}