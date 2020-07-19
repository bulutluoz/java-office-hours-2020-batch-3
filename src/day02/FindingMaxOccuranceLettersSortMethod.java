package day02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FindingMaxOccuranceLettersSortMethod {
	public static void main(String[] args) {
		/*
		 * Write a Java program to get a String from user as input and find the maximum
		 * occurring character in that string .
		 * 
		 * (Ignore case sensitivity) input : Learning java is easy output: maximum
		 * occurring character is : a
		 */

		// 1- get a string from user

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a word to find frequencies of characters");
		String str = scan.next();

		// 2- take every characters and find their occurrences
		String strWithFrequency = "";
		int frequency = 0;
		List<Integer> occurrence = new ArrayList<>();
		List<Integer> occurrenceSorted = new ArrayList<>();
		for (int i = 0; i < str.length(); i++) {
			for (int j = i; j < str.length(); j++) {
				if (str.substring(i, i + 1).equals(str.substring(j, j + 1))) {
					frequency++;
				}
			}
			if (!strWithFrequency.contains(str.substring(i, i + 1))) {
				strWithFrequency = strWithFrequency + str.charAt(i);
				occurrence.add(frequency);
				occurrenceSorted.add(frequency);
			}
			frequency = 0;
		}

		Collections.sort(occurrenceSorted);
		int maxocc = occurrenceSorted.get(occurrenceSorted.size() - 1);
		String result = "";
		for (int i = 0; i <occurrence.size() ; i++) {
			
			if (occurrence.get(i)==maxocc) {
				result=result+strWithFrequency.charAt(i)+" " ;
			}
			
		}
		System.out.println("Max usage is " + maxocc + " times");
		System.out.println("Max used letter(s) : " + result);
		scan.close();

	}

}