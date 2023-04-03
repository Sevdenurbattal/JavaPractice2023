package day12_customMethods;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Split or No split (Yes or No)");
        String yesOrNo = scan.next().toLowerCase();
        System.out.println("Enter the number of people");
        int people = scan.nextInt();
        System.out.println("Enter the check amount");
        double check = scan.nextDouble();
        System.out.println("Service Quality");
        String quality = scan.next().toLowerCase();

        double tip= (quality.equals("Poor")) ? check*5/100 : (quality. equals("Fair")) ? check*10/100 :
                (quality.equals("Good")) ? check *15/100 : (quality.equals("Great"))? check*20/100 :
                        check*25/100;
        System.out.println("Number of people entered: "+ people);
        System.out.println("Total to pay: "+ (check +tip));
        System.out.println("Total tip: " + tip);
        if(yesOrNo.equals("yes")) {
            System.out.println("Total per person: " + (check + tip) / people);
            System.out.println("Tip per person: " + (tip / people));
        }



    }
}

/*
 Create a class called TipCalculator, and write a program for a tip calculator.
	    There will be different service quality benchmarks that will determine the tip given.
	    There will also the ability to calculate based on the number of people in the party and if there is a split of the bill or not.

	        Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%

	    The program should ask the user to enter:
	            - Split or No split (Yes or No),
	             - Enter the number of people (number)
	             - Enter the check amount (number)
	             - Service Quality (String)

	    And then it should display:
	             Number of people entered
	             Total to pay
	             Total tip
	             Total per person
	             Tip per person:

		    Ex:
		        Split or No split (Yes or No)?
		        YeS
		        Enter the number of people
		        4
		        Enter the check amount:
		        476
		        How was the srvice quality? (Excellent/Great/Good/Fair/Poor)
		        ExCElLeNt

		        output:
		            Number of people entered: 4
		            Total to pay: 595.0
		            Total tip: 119.0
		            Total per person: 148.75
		            Tip per person: 29.75




Custom Methods:
		1. Void methods
		2. Parameters
		3. Return Methods
		4. Return with parameters
		5. Method Overloading

 */
