package day06;

import java.util.ArrayList;
import java.util.List;

public class FindingFirstNMaxNumbersInAnArray {

	/*
	 * write a java program to find out the first “n” max values from an array (do
	 * not use sort method)
	 * 
	 * Input : {1,2,3,4,5,6,7,8} input n:3 Output : 7 and 8
	 */

	public static void main(String[] args) {

		int input[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int n = 4;

		List<Integer> inputList = new ArrayList<>();
		for (int each : input) {
			inputList.add(each);
		}

		// 1) create an output list

		List<Integer> output = new ArrayList<>();

		// 2) create a count variable to compare with n

		int count = 1;

		// 3) find the max value and add it to output
		//    do it until count==n

		while (count <= n) {
			int max = inputList.get(0);

			for (int i = 0; i < inputList.size(); i++) {
				if (inputList.get(i) > max) {
					max = inputList.get(i);
				}
			}

			output.add(max);
			inputList.remove(inputList.indexOf(max));
			count++;
		}
		System.out.println("Max " + n + " element(s) in the given Array : " + output); // [7,8]

	}

}
