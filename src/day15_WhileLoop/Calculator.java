package day15_WhileLoop;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        System.out.println("Enter first num");
        double num1= input.nextDouble();

        System.out.println("Enter second num");
        double num2 = input.nextDouble();
        System.out.println("enter math operator");

        char operator = input.next().charAt(0);
        while (!(operator=='+' || operator=='-' || operator =='*' || operator=='/')) {
            System.err.println("Invalid operator");
            operator = input.next(). charAt(0);
        }

        if(operator =='+') {
            System.out.println(num1+num2);
        }else if (operator=='-'){
            System.out.println(num1-num2);

        }else if (operator=='*') {
            System.out.println(num1* num2);
        }else {
            System.out.println(num1/num2);

        }
    }
}
