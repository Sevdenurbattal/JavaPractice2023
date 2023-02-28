package day15_WhileLoop;

import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = input.nextInt();
        while (!(age >= 1 && age <= 120)) { //while age is not valid
            System.err.println("Invalid Entry, re enter your age");
            age = input.nextInt();
        }
        System.out.println("Are you a US citizen? Yes/No");
        String yesOrNo = input.next().toLowerCase();

        while (!(yesOrNo.equals("yes")|| yesOrNo.equals("no"))) { //while answer is neither yes or no
            System.err.println("Invalid Entry");
            System.out.println("Are you US citizen? yES/nO");
            yesOrNo = input.next().toLowerCase(); //only time to exit the loop when condition is met


        }
    }
}
