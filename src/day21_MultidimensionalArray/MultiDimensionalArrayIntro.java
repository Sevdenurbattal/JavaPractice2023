package day21_MultidimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayIntro {
    public static void main(String[] args) {
        int[] arr1= {10,20,30};
        int[] arr2 = {40,50,60,70,80};
        int[] arr3 = {90,100};
        int[] arr4 ={1000,2000};

        int[][] arr2D = {{10,20,30},{40,50,60,70,80}, {90,100}};//index: 0-2
        // index:         0             1              2
        System.out.println(arr2D.length);//3
        System.out.println(Arrays.toString(arr2D[1]));
        System.out.println(Arrays.toString(arr2D[2]));
        System.out.println(arr2D[2][0]);
        System.out.println(arr2D[1][2]);
    }
}
