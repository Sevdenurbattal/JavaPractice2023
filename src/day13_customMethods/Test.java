package day13_customMethods;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n= input.nextInt();
        input.close(); //void method does not return any value to you at the end.it just performs a task.

        System.out.println("Hello");
        String str = "Java";
        str.toUpperCase(); //string is also char sequence
    }
}
