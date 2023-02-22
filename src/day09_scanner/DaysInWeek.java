package day09_scanner;

import java.util.Scanner;

public class DaysInWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the day number:");
        //int num = new Scanner (System.in).nextInt();
        int num = input.nextInt();
        String day = "Invalid"; //this cannot be changed if this precondition fails. if it fails, value of day will be invalid

        if(num>=1 && num <= 7) {
            day=(num==1) ? "Monday" :
                    (num==2) ? "Tuesday" :(num==3) ? "Wed" :(num==4) ? "Thursday"
                            :(num==5) ? "Friday" : (num ==6) ? "Saturday" : "Sunday";
        }

        System.out.println(day);

        input.close(); //or you can give closing statement after nine 11. you cannot use variable before declaring it.


    }
}
