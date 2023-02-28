package day09_scanner;

import java.util.Scanner;

public class OddOrEvenNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");

        int num = scan.nextInt();

        boolean isEven = num % 2 == 0;

        if (isEven) {
            System.out.println(num + " is even number");
        } else {
            System.out.println(num + " is odd number");
        }
    }
}

/*
 1. Odd or Even number
            1.1 Ask the user to enter a number
            1.2 determine if the number is odd or even
 */