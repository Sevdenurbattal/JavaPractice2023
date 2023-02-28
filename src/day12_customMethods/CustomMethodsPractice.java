package day12_customMethods;

import java.util.Scanner;

public class CustomMethodsPractice {
    public static void main(String[] args) {
        maxNum(10.5, 20.5);
        initials("Alper", "Batt");
        initials ("Hasan", "Ay");

    }

    public static void maxNum(double num1, double num2) {
        if(num1>num2){
            System.out.println(num1 + " is the max number");
        }else if (num2> num1) {
            System.out.println(num2 + " is the max num");
        }else {
            System.out.println("equal");
        }

    }

    // //create a method that can display the initials of a person (firstName, lastName)
    public static void initials (String firstName, String lastName){
        System.out.println(""+firstName.charAt(0)+ lastName.charAt(0));
    }
}
