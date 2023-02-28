package day10_string;

import java.util.Scanner;

public class StringIntro {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String str = "Java";
        System.out.println();
        input.close();

        System.out.println("-------");

        String s1= "Dog";
        String s2 = "Dog";
        System.out.println(s1==s2);

        String s3 = new String("Java");
        String s4 = new String ("Java");
        System.out.println(s3==s4);

        String t1 = "Python";
        String t2= new String ("Python");
        String t3 = new String("Python");
        System.out.println(t1==t2);
        System.out.println(t2==t3);

    }
}
