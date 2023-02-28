package day16_nestedLoop;

import java.util.Scanner;

public class LogIn {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String u, p;
        int attempt = 3;
        do{ //we can set limit with do while loop


            System.out.println("Enter username");
            u= input.next();

            System.out.println("enter password");
            p= input.next();

            attempt--;
            if(attempt ==0) {
                break;
            }
        } while (!(u.equals("Cydeo") && p.equals("WoodenSpoon"))); //while
    }
}
