package day02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MaxOccurrence {

	public static void main(String[] args) {
//		Write a Java program to get a String from user as input and
//		find the maximum occurring character in that string .
//
//		(Ignore case sensivity)
//		input : Learning java is easy
//		Output:maximum occurring character is : a

		List<Character> inputCharList = new ArrayList<Character>();

		System.out.println("Enter a string");
		Scanner scan = new Scanner(System.in);
		String inputStr = scan.nextLine().toLowerCase();

		char maxOccuredChar = ' ';
		int maxOccuredNum = 0;

		for (int i = 0; i < inputStr.length(); i++) {
			inputCharList.add(inputStr.charAt(i));
		}
		for (int i = 0; i < inputCharList.size(); i++) {
			if (Collections.frequency(inputCharList, inputCharList.get(i)) >= maxOccuredNum) {
				maxOccuredChar = inputCharList.get(i);
				maxOccuredNum = Collections.frequency(inputCharList, inputCharList.get(i));
			}
		}
		System.out.println("Maximum occurring first character is : " + maxOccuredChar);
		scan.close();
		}
}

