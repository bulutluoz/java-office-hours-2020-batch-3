package day02;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		// ask user to enter an integer, word or any sentences
		// 1- check if the entry palindrome or not
		// (a word, phrase, or sequence that reads the same backwards as forwards, e.g.
		// madam or "Live on time, emit no evil")
		// 2- if it is not a palindrome, tell to user first character that does not
		// fallow the rule
		// 3- print on console how it should written to be palindrome

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter an integer, a word or sentences to check if it is palindrome or not");
		String entry = scan.nextLine();

		// 1- we should find the middle character and compare characters from middle
		// character to end end beginning

		entry = entry.toLowerCase();
		int length = entry.length();
		int middleIndex = length / 2;
		boolean isPalindrome = true;

		// if it has odd number of characters we will not check one character which at
		// middle index
		// if it has even number of characters we will check all characters

		for (int i = 0; i < middleIndex; i++) {

			if (entry.charAt(i) != entry.charAt(length - i - 1)) {
				System.out.println("The entry is not a palindrome");
				System.out.println("first character that does not fallow the rule  : " + (i + 1)
						+ ". character does not match with " + (length - i) + ". character");
				isPalindrome = false;

				break;
			}
		}

		if (isPalindrome) {
			System.out.println("The entry is a palindrome");
		}

		// 3- print on console how it should written to be palindrome
		// it is important if the entry has odd numbers of character or even numbers of
		// characters
		// eg. 12345 ==>12321 123456==>123321
		int count = 0;

		if (length % 2 == 0) { // it means entry has even number of characters
			System.out.print("it should be like that to be a palindrom ");
			while (count < (length / 2)) {

				System.out.print(entry.charAt(count));
				count++;
			}

			while (count < length) {
				System.out.print(entry.charAt(length - count - 1));
				count++;
			}

		} else { // it means entry has odd number of characters
			System.out.print("it should be like that to be a palindrom ");
			while (count < length / 2) {

				System.out.print(entry.charAt(count));
				count++;
			}

			while (count < length) {
				System.out.print(entry.charAt(length - count - 1));
				count++;
			}
		}

		scan.close();

	}

}