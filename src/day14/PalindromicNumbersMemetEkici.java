package day14;

public class PalindromicNumbersMemetEkici {
	/*
	 * A palindromic number reads the same both ways. The largest palindrome made
	 * from the product of two 2-digit numbers is 9009 = 91 × 99. Find the largest
	 * palindrome made from the product of two 3-digit numbers. like 654*671 =
	 * 438834
	 */

	public static void main(String[] args) {
		int multp2 = 0;
		int multp = 0;
		for (int i = 999; i >= 100; i--) {
			for (int j = 999; j >= 100; j--) {
				multp = i * j;
				int num1 = multp / 100000;
				int num6 = multp % 10;
				int num2 = (multp / 10000) % 10;
				int num5 = (multp / 10) % 10;
				int num3 = (multp / 1000) % 10;
				int num4 = (multp / 100) % 10;
				if (num1 == num6 && num2 == num5 && num3 == num4) {
					if (multp > multp2) {
						multp2 = multp;
					}
					break;
				}
			}

		}
		System.out.println(multp2);
	}

}