package day12_customMethods;

import java.util.Scanner;

public class EmailTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first name");
        String first = scan. next().trim();
        //trim and replace methods will make sure that the white spaces and additional spaces btw. characters will be removed
        System.out.println("Enter last name");
        String last = scan.next().trim();

        String sub = first.substring(1).toLowerCase();
        String first1 = first.substring(0,1).toUpperCase();
        System.out.println(first1+sub+ " "+ last.substring(0,1).toUpperCase()+last.substring(1).toLowerCase());

    }
}
/*
Write a program that asks user to enter first and last names, and then prints the full name in regular format (first character in upper case)

	                    input:
	                        firstName = "cyDEo"
	                        lastName = "SCHOOL";

	                    output:
	                        Cydeo School
 */