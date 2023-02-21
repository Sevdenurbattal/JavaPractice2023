package day07_ifStatements;

import java.sql.SQLOutput;

public class MultiBranchIf {

    public static void main(String[] args) {
        int num = 100;
        String result = "";
        if(num>0) {
            result = "Positive";
        } else if (num<0) {
            result ="Negative";
        } else {
            result ="Zero";
        }
        System.out.println(result);



    }
}

/*
  1. Create a class named PosNegZero.java
2. An integer variable named number is declared and given, Write a
program can identify if the number is positive, negative or zero

Ex:

number = 20

output:

Positive
 */
