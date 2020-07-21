package day05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveElementFromAnArray {

	public static void main(String[] args) {
		/*
		 * write a Java program to removes a specific element from an array and put the
		 * remaining elements in a new array ant prints the new array 
		 * Input :{1,2,3,4,5,6} element:6 
		 * Output : [1,2,3,4,5]
		 */

		int input[] = { 1, 2, 3, 4, 5, 6 };
		int remove = 6;

		List<Integer> outputList = new ArrayList<>();

		for (int each : input) {
			if (each != remove) {
				outputList.add(each);
			}
		}

		int output[] = new int[outputList.size()];

		for (int i = 0; i < output.length; i++) {

			output[i] = outputList.get(i);
		}

		Integer output2[] = new Integer[outputList.size()];
		output2 = outputList.toArray(output2);

		System.out.println(Arrays.toString(output));
		System.out.println(Arrays.toString(output2));

	}

}