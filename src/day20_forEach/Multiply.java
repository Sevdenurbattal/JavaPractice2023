package day20_forEach;

import java.util.Arrays;

public class Multiply {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==1) {
                arr[i] *=2;
            }


        }
        System.out.println(Arrays.toString(arr));

    }
}
/*
1. write a program that can multiply each odd number of an integer array by 2
		            ex:
		            	array = [1,2,3,4,5];

	                output:
	                	array =[2,2,6,4,10]

 */
