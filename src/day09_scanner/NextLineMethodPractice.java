package day09_scanner;

import java.util.Scanner;

public class NextLineMethodPractice {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //EnterEnter

        System.out.println("Enter your full name:");
        String full_name = input.nextLine();

        System.out.println("Enter your school name:");
        String school_name = input.nextLine();

        System.out.println("Enter gender");
        String gender = input.next(); //Male+Enter

        System.out.println("Enter your age");
        int age = input.nextInt(); //28+Enter

        input.nextLine();

        System.out.println("Street name:");
        String street= input.nextLine(); //first it is gonna ask what is left in scanner, then look for user input
    }
}
