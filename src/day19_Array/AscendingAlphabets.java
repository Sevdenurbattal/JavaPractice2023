package day19_Array;

import java.util.Arrays;

public class AscendingAlphabets {
    public static void main(String[] args) {

        char[] ascending = new char[26];
        char[] descending= new char[26];
        for ( int i=0, j= 'A', k='Z';  i< ascending.length; i++, j++, k--) {
            ascending[i]= (char) j;
            descending[i] = (char) k;
        }

        System.out.println(Arrays.toString(ascending));
        System.out.println("descending = " + Arrays.toString(descending));

        char [] characters = new char[65535];
        for (int i = 0; i<characters.length ; i++) {
            characters[i] = (char) i;
        }
        System.out.println(Arrays.toString(characters));

    }
}
/*
 Create a char array and store
 all the alphabet letters in ascending order
 */
