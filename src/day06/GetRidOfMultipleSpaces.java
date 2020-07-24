package day06;

import java.util.ArrayList;
import java.util.List;

public class GetRidOfMultipleSpaces {

	public static void main(String[] args) {
		// Write java code to get rid of multiple spaces from a string. 


		String input = "I am  learning   Java. I liked  it     very much.";
		
		//1)Long way
		// 1-1) create an array for use split() and output2 list for make changes
		String words[]=input.trim().split("\\s");
		List<String> output2=new ArrayList<>();
		
		
		// 1-2) create a temp variable for assign the value after trim() for every word
		String temp;
		for(String each:words) {
			temp=each.trim();
		// 1-3) check all words and if it not equal to NOTHING add the element to output
			if(!temp.equals("")) {
				output2.add(temp);	
			}
		}
		// 1-4) for print it as sentences print every element from output in same line

		System.out.println("Output from long way");
		for(int i=0;i<output2.size();i++) {
			System.out.print(output2.get(i)+" ");
		}
		System.out.println("");
		
		//2)The shortest way. Use regex \\s+
		
		String output=input.trim().replaceAll("\\s+", " ");
		System.out.println("Output from the Shortest way\n" + output);
		
	}

}
