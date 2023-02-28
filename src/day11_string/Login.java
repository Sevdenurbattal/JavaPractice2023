package day11_string;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        String correctUsername ="Cydeo";
        String correctPassword ="WoodenSpoon";
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the username");
        String username = scan. next();

        System.out.println("Enter the password");
        String password = scan.next();

        if (correctPassword.equals(password) && correctUsername.equals(username)) {
            System.out.println("You are now logged in");
        }else {
            System.out.println("Incorrect username or password. Please try again");
        }

    }
}
/*
 Create a class named LogIn
			2.1 Ask the user to enter the username & password
			2.2 print "You are now logged in" If user entered valid username and password
				otherwise print the error message "Incorrect username or password. Please try again"

			Note: Assume that the valid credentials are:
						username: Cydeo
						password: WoodenSpoon
 */
