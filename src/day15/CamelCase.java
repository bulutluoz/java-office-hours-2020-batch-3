package day15;

public class CamelCase {

	public static void main(String[] args) {
		/* Write a return method that accepts a sentence as parameter
		 * Then converts it to Camelcase
		 * (without any space or specialCharacter)
		 * 
		 * Input  : I am writing code easily
		 * Output : IAmWritingCodeEasilyItIsGreat
		 * 
		 */
		
		String input="I am writing code Easily, it is great!";
		camelCase(input);
		camelCase1(input);

	}

	public static void camelCase1(String input) {
		

		String words[]=input.split(" ");
		String output="";
		for (int i = 0; i < words.length; i++) {
			String word = words[i].replaceAll("[^a-zA-Z]", "");
			output+= word.substring(0, 1).toUpperCase()+word.substring(1, word.length()).toLowerCase();
		}
		System.out.println("berati " +  output);
		
		
		
		
		
	}

	public static void camelCase(String input) {

		String camelCase="";
		String words[]=input.split(" ");
		for (int i = 0; i < words.length; i++) {
			camelCase+= words[i].substring(0, 1).toUpperCase()+words[i].substring(1, words[i].length()).toLowerCase();
		}
		System.out.println(camelCase);
	}

}
