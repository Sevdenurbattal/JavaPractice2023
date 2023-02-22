package day09_scanner;
import java.util.Scanner;
//import java.util.*;
public class ScannerIntro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //for reading user inputs
        System.out.println("Enter your first number: ");

        //byte num1 =input.nextByte();
        int num1 = input. nextByte();
        System.out.println("Enter your second number:");
        short num2 = input.nextShort();
        System.out.println("Enter your third number: ");
        int num3 = input.nextInt();
        System.out.println("Enter your fourth number:");
        long num4 = input.nextLong();

        input.close(); //scanner is closed, cannot read user input again by using same scanner object, you need to recreate it.
        /*System.out.println("Enter your fifth number");
        int num5 = input.nextInt();

        scanner is closed at line 27, once it is closed cannot read inputs.
        */

        System.out.println(" First number: "+num1);
        System.out.println("Second number: "+num2);
        System.out.println("Third number: "+num3);
        System.out.println("Fourth number:"+ num4);
        // System.out.println("Fifth number: "+ num5); //you get illegal state exception





    }
}
