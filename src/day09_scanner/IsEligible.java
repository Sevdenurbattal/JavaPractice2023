package day09_scanner;

import java.util.Scanner;

public class IsEligible {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scan.nextInt();
        if(age >=18) {
            System.out.println("You are eligible to buy alcohol");
        }else {
            System.out.println("You are not eligible to buy alcohol");
        }
        scan.close();
    }
}
