package day23_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
        int max = Collections.max(list); //unboxing
        int min = Collections.min(list);
        System.out.println("min = " + min);
        System.out.println("max = " + max);

        ArrayList<String> items =new ArrayList<>();
        items.addAll(Arrays.asList("Eggs","Potato", "Milk", "Paper towel"));
        Collections.sort(items);
        System.out.println(items);
        Collections.reverse(items);
        System.out.println(items);

        ArrayList<String> students = new ArrayList<>();
        students.addAll(Arrays.asList("Gadir", "Hasan", "Abidullah", "bILAL"));
        System.out.println(students);
        Collections.swap(students, 0, 1);
        System.out.println(students);
        Collections.swap(students, 0, students.size()-1);
        System.out.println(students);
    }
}
