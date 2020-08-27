package day15;

public class ReverseStringWithArray {

	public static void main(String[] args) {
		/* 
		 * Write a Java program that reverse a sentence by using Array
		 * (with all spaces and special characters)
		 * 
		 * Input  : Coding is greate.
		 * Output : .etaerg si gnidoC
		 * 
		 */
		
		String str = "Coding is greate.";
		String reverseStr="";
		
		String arr[]= str.split("");
		for (int i =arr.length-1; i >=0; i--) {
			reverseStr+=arr[i];
		}
		
		System.out.println("Reverse String : " + reverseStr);
		
		
		
		char [] arr1 = str.toCharArray();
		for (int i = arr1.length-1; i >=0 ; i--) {
			System.out.print(""+arr1[i]);
		}

		
		

	}

}
