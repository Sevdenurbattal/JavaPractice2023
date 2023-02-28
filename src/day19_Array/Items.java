package day19_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Items {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String[] items =new String[5];
        int[] prices = new int[5];
        int sum=0;

        for (int i = 0; i < items.length; i++) {
            System.out.println("Enter item name:");
             items[i]= input.next();
            System.out.println("Enter item price: ");
            prices[i]=input.nextInt();
            System.out.println(items[i]+" -- $"+ prices[i]);
            sum+= prices[i];
        }


        System.out.println("Total price of the items are $"+sum);




    }
}
/*
6. Items
			1. Create an array named items with the length of 5
			2. Create an array named prices with the length of 5
			3. Ask user to enter item name and price 5 times and store them into the items and prices arrays
			4. calculate the total price of the arrays
			5. display each item name and price in separate lines

						ItemName -- Price
 */
