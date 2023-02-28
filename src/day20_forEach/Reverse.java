package day20_forEach;

import utilities.ArraysUtility;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] array ={1,2,3,4,5,6,7,8,9,10,11,12};
        int[] reverse = new int [array.length]; //{5,4,3,2,1}

        for (int i = array.length - 1, j=0; i >= 0; i--, j++) {
            reverse[j]= array[i];
        }
        System.out.println(Arrays.toString(reverse));

        int[] nums ={100,200,300,400};
        nums = ArraysUtility.reverse(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println("--------");

        double[] a1 ={1.3, 3.5, 3.2};
        a1=ArraysUtility.reverse(a1);
        System.out.println(Arrays.toString(a1));
    }
}
