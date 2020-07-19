package day02;

import java.util.Scanner;

public class FindingString {

	public static void main(String[] args) {
		/*
		 * Ask the user for a String and a sentences 
		 * Find and print occurrence of String in sentences. 
		 * (without case sensitivity)
		 * 
		 * sentences =“hihihi” String=“hi” output=“There are 3 "hi"s in hihihi "
		 * sentences =“I am coming” String=“com” output ="there is 1 “com” in sentences "
		 */
		
		
		// 1) get a sentences and a word from user
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Please enter a sentences");
		String sentences = scan.nextLine();
		System.out.println("Please enter a String to find occurrence");
		String word= scan.next();
		
		// 2) find the occurrence of word
		
		int count=0;
		
		for (int i = 0; i <= sentences.length()-word.length(); i++) {
			
			if (sentences.substring(i, i+word.length()).equalsIgnoreCase(word)) {
				count++;
			}
		}
		
		// 3) print the result
		
		if (count>1) {
			System.out.println("There are " + count +" " +  word + "'s in the sentences");
		} else if (count==1) {
			System.out.println("There is 1" +  word + " in the sentences");
		} else System.out.println("There is not any " +  word + " in the sentences");
		
		scan.close();
			
	}

}
