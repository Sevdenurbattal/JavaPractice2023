package day20_forEach;

import java.util.Arrays;
import utilities.ArraysUtility;

public class Merge {
    public static void main(String[] args) {
        int[] arr1= {1,2,3,4};
        int[] arr2 = {5,6};
        int[] arr3 = new int[arr1.length+ arr2.length];
        int k=0; //for third array's index number

        for (int i = 0; i < arr1.length; i++, k++) {
            arr3[k]=arr1[i];
        }

        for (int i = 0; i < arr2.length; i++,k++) {
            arr3[k]= arr2[i];

        }
        System.out.println(Arrays.toString(arr3));
        System.out.println("-----------");

        int[] a1= {10,20,30,40,50};
        int[] a2= {70,80,90};
       int[] a3= ArraysUtility.merge(a1, a2);
        System.out.println(Arrays.toString(a3));
        System.out.println("-----------");
        double[] b1= {10.5, 4.5, 3.5,6.5};
        double[] b2 = {20.5, 13.5};
        double[] b3 = ArraysUtility.merge(b1, b2);
        System.out.println(Arrays.toString(b3));

        System.out.println("-----------");
        char[] ch1= { 'A', 'B', 'C', 'c', 'e'};
        char[] ch2 ={'D', 'X', 'Y'};
        char[] ch3= ArraysUtility.merge(ch1, ch2);
        System.out.println(Arrays.toString(ch3));
        System.out.println("------------");

        String[] c1= {"Java", "Python", " JavaScript", "Ruby"};
        String[] c2= {"C#", "C++"};
        String[] c3 = ArraysUtility.merge(c1,c2);
        System.out.println(Arrays.toString(c3));




    }
}
/*
2. write a program that can merge two arrays of integers
	        Ex:
	            arr1 = {1,2,3,4}
	            arr2 = {5,6}

	        output
	            arr3 = {1,2,3,4,5,6}

 */
