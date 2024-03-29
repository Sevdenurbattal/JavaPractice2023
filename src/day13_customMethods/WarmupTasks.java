package day13_customMethods;

import java.util.Scanner;

public class WarmupTasks {
    public static void main(String[] args) {
        calculate(24, 35, '+');
        calculate(1, 100, '-');
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers and add a math operator");
        double n1 = input.nextDouble(),
                n2 = input.nextDouble();
        char operator = input.next().charAt(0);
        calculate(n1, n2, operator);
        eligibleToVote(20, true);
        ageGroup(87);

    }

    public static void calculate(double num1, double num2, char mathOperator) {

        double result = 0;

        switch (mathOperator) {
            case '+':
                System.out.println(num1 + " " + mathOperator + " " + num2 + " = " + (num1 + num2));
                break;
            case '-':
                System.out.println(num1 + " " + mathOperator + " " + num2 + " = " + (num1 - num2));
                break;
            case '*':
                System.out.println(num1 + " " + mathOperator + " " + num2 + " = " + (num1 * num2));
                break;
            case '/':
                System.out.println(num1 + " " + mathOperator + " " + num2 + " = " + (num1 / num2));
                break;
            default:
                System.out.println("Invalid Operator");


        }


    }

    public static void eligibleToVote(int age, boolean isAmerican) {
        if (age >= 18 && isAmerican) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You arenot eligible to vote");
        }

    }

    public static void ageGroup(int group) {

        if (group > 0 && group < 150) {
            if (group < 21) {
                System.out.println("Teenager");
            } else if (group >= 21 && group < 55) {
                System.out.println("Adult");

            } else {
                System.out.println("Senior");
            }
        }
    }
}

/*
1. Create a method named calculate that can take three arguments:
            num1 (double)
            num2 (double)
            mathOperator (char)

	    The method should display the calculation result of those two numbers as long as the 3rd argument is a valid math operator, otherwise the method prints "Invalid Operator"

	        Ex:
	            calculate(10, 20, '+')

	        output:
	            10 + 20 = 30

	 Create a method named eligibleToVote that takes two arguments:
	        1. age (int)
	        2. isAmerican (boolean)

	    Then the method should determine if the person eligible to vote
	        Ex:
	            eligibleToVote(23, true)

	        output:
	            You are eligible to vote

	  2. Create a method named ageGroup that can print the age group of the person

	        age groups are:
	                Teenager (< 21)
	                Adult   (>=21 && <55 )
	                Senior  ( > 55 )
 */
