package day20_forEach;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayUtilityMethods {
    public static void main(String[] args) {
        int[] score ={70,100,30,40,45};
        System.out.println(Arrays.toString(score));

        String result= Arrays.toString(score);
        System.out.println(result);
        System.out.println("--------");
        int[] a1= {1,2,3,4,5};
        int[] a2 = {3,4,5,6};
        boolean r1= Arrays.equals(a1,a2);
        System.out.println(r1);

        char[] ch1= {'a', 'b', 'c'};
        char[] ch2= {'A','B'};
        boolean r2 = Arrays.equals(ch1,ch2);

        System.out.println(r2);

        int[] nums = {100,40,56,345,24,5};
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println("Min number: "+ nums[0]);
        System.out.println("Maximum: "+nums[nums.length-1]);
        System.out.println("-----------");

        String[] b1= {"C", "A", "B"};
        String[] b2= {"A", "C","B"};
        Arrays.sort(b1);
        Arrays.sort(b2);
        System.out.println(Arrays.equals(b1,b2));
        System.out.println("--------");
        int[] array ={10,20,30,40,50};
        int[] array2= Arrays.copyOf(array,4);
        System.out.println(Arrays.toString(array2));

        int[] n1= {1,2,3,4,5};
        int[] n2= {6,7,8,9,10};
        int[] n3 = Arrays.copyOf(n1,n2.length +n1.length);
        for (int i = 0, j=n1.length; i < n2.length; i++, j++) {
            n3[j]= n2[i];
        }
        System.out.println(Arrays.toString(n3));
        System.out.println("------------");
        char[] ch= {'A','B','C','E', 'F','G'};
        char[] result1 = Arrays.copyOf(ch, 4);
        System.out.println(Arrays.toString(result1));

        char[] result2= Arrays.copyOfRange(ch,2, 4); //excludes ending index
        System.out.println(Arrays.toString(result2));

        char[] result3 = Arrays.copyOfRange(ch,2,ch.length);

    }
}
