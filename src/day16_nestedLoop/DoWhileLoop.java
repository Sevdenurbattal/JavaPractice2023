package day16_nestedLoop;

import org.w3c.dom.ls.LSOutput;

public class DoWhileLoop {
    public static void main(String[] args) {

        boolean condition = false;
        for (; condition; ) {
            System.out.println("Hello Cydeo");
        }
        System.out.println("--------");

        while (condition) {
            System.out.println("Hello -while loop");
        }
        System.out.println("-------");

        do {
            System.out.println("Hello-do while loop");
        } while (condition); {
            System.out.println("Hello");
        }
    }
}
