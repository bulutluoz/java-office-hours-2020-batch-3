package day14;

public class StringBuilderExample {
	/*
	 Write a java program which accept a sentence as parameter, than reverses sentence by using StringBuilder
     and checks if sentence is palindrome or not
     (without case sensitivity)
     Eg : input : I love Java
     Output: "Reversed sentence : avaJ evol I .
        It is not a palindrome"
	 */

	public static void main(String[] args) {
		
		String input = "I love Java";
		
		StringBuilder str = new StringBuilder();
		str.append(input);
		
		String reverseInput= str.reverse().toString();
		
	
		
		if(input.equalsIgnoreCase(reverseInput)) {
			System.out.println(" Reversed sentence : " + reverseInput +"  It is a palindrome");
		} else System.out.println(" Reversed sentence : '" + reverseInput +"'  It is not a palindrome");
		
	}

}