package day23_ArrayList;

import java.util.ArrayList;

public class AverageNum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(20); //primitive value int to integer wrapper class
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);

        System.out.println(list);
        int sum=0;


        for (int i = 0; i < list.size(); i++) {
            sum+= list.get(i);

        }
        double average = sum/ list.size();
        System.out.println(average);

    }
}
/*
Write a program that can find the average number from an arrayList of integers
 */
