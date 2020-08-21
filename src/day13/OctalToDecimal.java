package day13;

public class OctalToDecimal {

	public static void main(String[] args) {
		/* write a java program to convert octal numbers to decimal
		 * ask user to enter an octal number than
		 * write a return method that accepts given octal number as parameter
		 * Checks if it is an octal number 
		 * 		if it is not an octal number prints "It is not an octal number" 
		 * 		if it is an octal number prints the decimal value
		 * 
		 *  Eg: Input 1238  Output : It is not an octal number
		 *      Input 145  Output : Decimal value of given octal number is = 101
		 * 
		 */
		
		int octal= 345;
		octalToDecimal(octal);

	}
	
	public static void octalToDecimal(int octal) {
		
		int decimal=0;
		int digitValue=1;
		int replaceValue=1;
		
		while (octal>0) {
			
			digitValue=octal%10;
			decimal=decimal+digitValue*replaceValue;
			replaceValue*=8;
			octal=octal/10;
		} System.out.println(decimal);
	}
	
	

}
