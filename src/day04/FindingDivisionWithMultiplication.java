package day04;


public class FindingDivisionWithMultiplication {
    public static void main(String[] args) {
        /*
         * Guys... Here is second challenge ... we solve yesterday but I want to solve
         * it with "multiplication operator " 9:29 write a return method that can divide
         * two numbers without division operator and prints quotient and remainder (use
         * multiplication operator instead of division operator)
        */
        
        int input = 44;
        int divisor = 5;
        division(input, divisor);
    }
    static void division(int num1, int num2) {
        int product = 1;
        int i = 0;
        do {i++;
            product = i*num2;
        }while(product<=num1);
        
        int quotient = i-1;
        int remainder = num1-(product-num2);
        System.out.println("Quotient = " + quotient + " and remainder = " + remainder);
        }
}
    