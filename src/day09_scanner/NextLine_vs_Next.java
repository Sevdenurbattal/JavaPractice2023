package day09_scanner;

import java.util.Scanner;

public class NextLine_vs_Next {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = input.nextInt(); //45

        input.nextLine(); //Enter

        System.out.println("Enter your full name:");
        String full_name = input.nextLine(); //nextLine is used after other method of the scanner which is NextInt

        System.out.println("age = " + age);
        System.out.println("full_name = " + full_name);
    }
}
