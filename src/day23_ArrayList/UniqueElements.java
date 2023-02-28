package day23_ArrayList;

import java.util.ArrayList;

public class UniqueElements {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Vasyl");
        names.add("Vasyl");
        names.add("Sumeye");
        names.add("Ali");
        names.add("Sumeye");
        names.add("Shujir");

        for (String each : names) {
            if(names.indexOf(each)== names.lastIndexOf(each)){ //it will return index of elements in array
                System.out.println(each);
                break;
            }
        }

    }
}
