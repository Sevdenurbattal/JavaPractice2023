package day19_Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayLiterals {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        int[] nums = {10,20,30,40,50};

        System.out.println(numbers.length);
        System.out.println(nums.length);
        System.out.println("numbers = "+ Arrays.toString(numbers));
        System.out.println("nums = " + Arrays.toString(nums));
        System.out.println("---------------");

        String[] days= {"Monday", "Tue", "Wed", "Thur", "Friday", "Saturday", "Sun"};
        //index:         0          1     2       3       4          5        6
        //element        1         2      3         4       5        6        7 in order to get Sunday you need to use 6to get element at that number.

        int n= 1;
        System.out.println(days[n-1]);
        System.out.println("-----------------");

        String[] month = {"Jan", "Feb", "March", "Apr", "May", "Jun", "Jul", "Aug", "Sept", "Oct", "Nov", "Dec"};
        System.out.println("month= "+ Arrays.toString(month));

        System.out.println("---------------");

        // int[] numbers2 = new int[100];

        for (int i = month.length - 1; i >= 0; i--) {
            System.out.println(month[i]);
        }
    }
}
