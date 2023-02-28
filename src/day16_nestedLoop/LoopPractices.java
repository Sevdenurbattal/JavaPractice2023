package day16_nestedLoop;

import java.util.Scanner;

public class LoopPractices {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            System.out.println("Hello "+ i);

        }
        System.out.println("---------");

        int j= 0;
        while(j<5) {
            System.out.println("Hello "+ j); //while loop only demands condition
            j++;
        }
        System.out.println("--------");
        
        int k =0;
        do {
            System.out.println("Hello " + k);
            k++;
        } while(k<5);
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your score");
        
        int score = input.nextInt();
        while(score>100 || score<0) {
            System.out.println("Invalid, reenter");
            score= input.nextInt();
        }
        if(score>= 60 ) {
            System.out.println("Passed");
        }else {
            System.out.println("failed");
        }
    }



}
