package day06;

import java.util.ArrayList;
import java.util.List;

public class DuplicatedElementsInArray {

	public static void main(String[] args) {
		/*
		 * write a program to find the duplicate values of an array of integer values
		 * 
		 * Input : {3,2,1,4,1,3,3} Output : duplicated elements :1,3
		 */

		int input[] = { 3, 2, 1, 4, 1, 3, 3 };

		// 1) compare every element with others
		// 2) if there is any duplicated put it in output list
		// (check if output list contains that element or not)

		List<Integer> output = new ArrayList<>();

		for (int i = 0; i < input.length; i++) {
			for (int j = i + 1; j < input.length; j++) {
				if (input[i] == input[j] && !output.contains(input[i])) {

					output.add(input[i]);

				}
			}
		}

		System.out.println("duplicated elements" + output);

	}

}
