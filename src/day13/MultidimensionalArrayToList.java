package day13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MultidimensionalArrayToList {

	public static void main(String[] args) {
		/* write a return method that accepts an Multidimensional Array as input
		 * Puts all element in a new list
		 * and prints all elements in natural order
		 * 
		 * Eg : Input : {{John,Brad,Fox},{Lee,Ali},{Suzan}}
		 * 		Output:[Ali, Brad, Fox, John, Lee, Suzan]
		 */

		
		String input[][]= {{"John","Brad","Fox"},{"Lee","Ali"},{"Suzan"}};
		printList(input);
	}
	
	public static void printList(String input[][]) {
		
		List<String> list= new ArrayList<>();
		
		for (int i = 0; i < input.length; i++) {
			for(String each:input[i]) {
				list.add(each);
			}
			
		}
		Collections.sort(list);
		System.out.println(list);
		
	}

}
