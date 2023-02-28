package day19_Array;

import java.util.Arrays;

public class ArrayObjects {
    public static void main(String[] args) {
        int[] arr1 = {10,20,30,40,50}; //it is object, stored in heap memory.
        int[] arr2 = arr1; //this array variable should reference to new object if you wanna print different data
        int[] arr3 = arr2; //only one object is allocated in heap memory

        arr1[0]=1000;
        arr2[2]=3000;

        System.out.println(Arrays.toString(arr1));
        System.out.println("arr2 = " + Arrays.toString(arr2));
        System.out.println("arr3 = " + Arrays.toString(arr3));
        System.out.println("------------");

        String[] a1 = {"Umran", "Mehmet"}; //this is gonna be eligible for garbage collection, you cant reference it two times., it becomes unreachable.
        a1 = new String[]{"James", "Daniel"}; //reinitialize the variable
        System.out.println(Arrays.toString(a1));
    }
}
