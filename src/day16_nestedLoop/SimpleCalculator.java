package day16_nestedLoop;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String answer = "yes";
        while (answer.equals("yes")) {
            System.out.println("Enter first number");
            double num1 = input.nextInt();
            System.out.println("Enter math operator");
            char o = input.next().charAt(0);
            while (!(o == '-' || o == '+' || o == '*' || o == '/')) {
                System.err.println("Invalid operator, reenter operator");
                o = input.next().charAt(0);

            }
            System.out.println("Enter your second number:");
            double num2 = input.nextDouble();
            double result = (o == '+') ? num1 + num2 : (o == '-') ? num1 - num2 : (o == '*') ? num1 * num2 : num1 / num2;
            System.out.println("result= " + result);

            System.out.println("Would you like to continue?yes/no");
            answer= input.next().toLowerCase();
            while(!(answer.equals("yes") || answer.equals("no"))) {
                System.err.println("Invalid answer, reenter");
                answer = input.next().toLowerCase();
            }
        }
    }
}






/*

	1. Write a program for a simple calculator
			1.1 ask the user to enter first number: (double)
			1.2 ask the user to enter a math operator: (-, +, *, /)
				if the user enters invalid math operator, reapet the same step until user enters a valid operator

			1.3 ask the to enter the second number: (double)
			1.4 display the calculation result
			1.5 Would you like to continue? (Yes/No)
 */
