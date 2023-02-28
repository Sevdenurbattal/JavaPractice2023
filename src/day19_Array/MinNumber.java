package day19_Array;

public class MinNumber {
    public static void main(String[] args) {
        int[] smallNumbers= {672, 34, 543, 34,556};
        int min= smallNumbers[0];
        for (int i = 1; i < smallNumbers.length; i++) {
            if( smallNumbers[i]<min ) {
                min= smallNumbers[i];
            }
        }
        System.out.println("min = " + min);

    }
}

/*
2. Write a program that can find the minimum number from an array
 */