package day16_nestedLoop;

import java.util.Scanner;

public class FrequencyOfChar {
    public static void main(String[] args) {
        String str = "aabbbcccc";
        char ch = 'c';
        int count =0;

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==ch) { //if character of string is equal to the given character, it means given character has appeared
                count++;
            }
        }
        System.out.println(count);

    }
}


/*
write a program that can return the frequency of a character from a string
        	Ex:
        		str = "aaabbbbccccc"
        		ch = 'c'

		     output:
		     	5
 */