package day23_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        array[0] =100;
        System.out.println(Arrays.toString(array));
        System.out.println("--------");
        ArrayList<String> groceriesList =new ArrayList<>();
        groceriesList.add("Eggs");
        groceriesList.add("Apples");
        groceriesList.add("paper Towels");
        System.out.println(groceriesList);

        groceriesList.set(2, "Oranges");
        System.out.println(groceriesList);
        groceriesList.add(2, "Chicken");
        System.out.println(groceriesList);
        groceriesList.remove(0);
        System.out.println(groceriesList);
        groceriesList.remove("paper Towels"); //it returns boolean at the end, whichever is first matching object will be removed
        System.out.println(groceriesList);
        System.out.println("-------");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
       // numbers.remove(20);
        boolean r1= numbers.remove(Integer.valueOf(10));
        System.out.println(numbers);
        System.out.println(r1);
        numbers.clear();

        System.out.println(numbers);
        System.out.println(numbers.size());
        ArrayList<String>names = new ArrayList<>();
        names.add("Vasyl");
        names.add("Vasyl");
        names.add("Sumeye");
        names.add("Ali");
        names.add("Sumeye");
        System.out.println(names.indexOf("Vasyl"));
        System.out.println(names.lastIndexOf("Vasyl"));
        System.out.println(names.lastIndexOf("Sumeye"));
        
        boolean hasmuhtar = names. contains("Muhtar"); //false
        boolean hasAli = names.contains("Ali");//true
        System.out.println("hasAli = " + hasAli);
        
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = list1;
        
        list1.add(10);
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list1==list2);
        
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        
        l1.add(10);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l1==l2);
        System.out.println(l1.equals(l2));

        ArrayList<Integer> n1 = new ArrayList<>();
        n1.add(10);
        n1.add(20);
        n1.add(30);

        ArrayList<Integer> n2 = new ArrayList<>();
        n1.add(30);
        n1.add(10);
        n1.add(10);
        System.out.println(n1.equals(n2)); //false

        n1.clear();
        System.out.println(n1.isEmpty());



    }
}
