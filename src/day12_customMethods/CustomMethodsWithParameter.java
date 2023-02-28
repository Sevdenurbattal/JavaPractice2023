package day12_customMethods;

public class CustomMethodsWithParameter {
    public static void main(String[] args) {
        int num1 =100;
        oddOrEven(num1);
        int num2 = 35;
        oddOrEven(num2);
        int num3=76;
        oddOrEven(num3);



    }
    public static void oddOrEven(int number) {
        if(number%2==0) {
            System.out.println("number is even number= " + number);
        } else {
            System.out.println("number is odd number = "+ number);
        }
    }

    public static void buyAlcohol(int age) {
        if(age>= 18) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not eligible");
        }
    }


    //create a method that can print the maximum number between two numbers, if both are equal then it prints "Equal" (num1, num2)

    //create a method that can display the initials of a person (firstName, lastName)

}
