package day06;

import java.util.ArrayList;
import java.util.List;

public class FindingCommonElementsFromTwoArrays {

	public static void main(String[] args) {
		/*
		 * write a program to find the common elements between two String Arrays
		 * (without case sensitivity)
		 * 
		 * Input1 : {John,Brad,Ange,Sofia,Emily} Input2 : {sofia,brad,grace,emily,hazel}
		 * 
		 * Output : [sofia,brad,emily]
		 */

		String input1[] = { "John", "Brad", "Ange", "Sofia", "Emily" };
		String input2[] = { "sofia", "brad", "grace", "emily", "hazel" };

		List<String> output = new ArrayList<>();
		// 1)compare all elements from input1 to all elements in input2

		for (int i = 0; i < input1.length; i++) {
			for (int j = 0; j < input2.length; j++) {
		// 2)add the common elements to a list
				if (input1[i].equalsIgnoreCase(input2[j])) {
					output.add(input1[i]);
				}
			}
		}

		System.out.println("Common elements from given two Arrays : "+ output);

	}

}
