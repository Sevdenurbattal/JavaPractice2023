package day11_string;

import java.util.Scanner;

public class LongestString {
    public static void main(String[] args) {


        Scanner name = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String longest = name.nextLine();
        int length2 =longest.length();
        System.out.println("Enter second string: ");
        String longest2=name. next();
        int length1 = longest2.length();

        System.out.println((length1==length2) ? "Equal" : "Not Equal");
        if (longest.length() > longest2.length() ) {
            System.out.println("first string is the longest");
        } else if (longest.length()<longest2.length()) {
            System.out.println("second string is the longest");
        }else {
            System.out.println("Equal");
        }



    }
}
/*
 Create a class named LongestString
			1.1 Ask the user to enter two strings
			1.2 Write a program that can print the longest string,
			if both have the same number of characters then print "Equal"
 */