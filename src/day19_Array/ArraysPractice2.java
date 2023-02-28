package day19_Array;


import java.util.Arrays;

public class ArraysPractice2 {
    public static void main(String[] args) {


        int[] arr1 = new int[100];
       /* for (int i = 0, j =1 ; i < arr1.length; i++, j++) { //I have two variables, one is "i" for index number and j is for element.
            arr1[i]=j;

       */

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i + 1;
        }

        System.out.println("arr1 = " + Arrays.toString(arr1));
        System.out.println("---------------");

        int[] arr2 = new int[100]; //0~99

        for (int i = 0, j=100; i < arr2.length; i++, j--) {
            arr2[i]=j;
        }

        System.out.println("arr2 = " + Arrays.toString(arr2));
    }

    }

