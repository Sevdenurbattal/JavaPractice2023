package day16_nestedLoop;

import java.util.Scanner;

public class CydeoLogin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your username and password");
        String userName = scan.next();
        String password = scan.next();

        if ((userName.equals ("Cydeo") && password.equals ("Cydeo123"))) {

            System.out.println("Logged in");

        } else {
            for (int i = 0; i < 3; i++) { //i:0, 1, 2
                if (i != 2) {
                    System.err.println("Incorrect username or password, reenter");
                } else {
                    System.err.println("This is your last attempt");
                }
                System.out.println("Enter your username");
                userName = scan.next();

                System.out.println("Enter your password");
                password = scan.next();
                if (userName.equals("Cydeo") && password.equals("Cydeo123")) {
                    System.out.println("You are now logged in");
                    break; //exits the loop
                }

            }
            if(!(userName.equals("Cydeo") && password.equals("Cydeo123"))) {
                System.err.println("Your account is locked, contact with support team");
            }
        }
        scan.close();
    }

    public static void cydeoLogin(String username, String password) {
        if(username.equals("Cydeo")&& password.equals("WoodenSpoon")){
            System.out.println("Logged in");
        } else {
            System.out.println("Invalid credentials");
        }
    }
}
            


/*
you are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user to
                have three attempts to enter correct credentials and if all three attempts are failed, then print "Your account is lucked."
 */
