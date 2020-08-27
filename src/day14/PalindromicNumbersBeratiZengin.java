package day14;

public class PalindromicNumbersBeratiZengin {
	public static void main(String[] args) {
		/*
		 * A palindromic number reads the same both ways. The largest palindrome made
		 * from the product of two 2-digit numbers is 9009 = 91 × 99. Find the largest
		 * palindrome made from the product of two 3-digit numbers. like 654*671 =
		 * 438834
		 */

		int max = 0;
		int product, x = 0, y = 0;
		for (int i = 999; i > 99; i--) {
			for (int j = 999; j > 99; j--) {
				product = i * j;
				if (isPalindrom(product)) {
					if (max < product) {
						max = product;
						x = i;
						y = j;
					}
				}
			}
		}
		System.out.println("The largest palindrom: " + x + " * " + y + " = " + max);
	}

	public static boolean isPalindrom(int num) {
		boolean result = false;
		int temp = num;
		int reversed = 0;
		while (temp > 0) {
			reversed = temp % 10 + reversed * 10;
			temp /= 10;
		}
		if (num == reversed) {
			result = true;
		}
		return result;
	}

}