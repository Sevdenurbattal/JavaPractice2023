package day21_MultidimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayPractice {
    public static void main(String[] args) {
        String[] group1 ={"Luc", "Umran", "Sumeye", "Abid"};// 4 names
        String[] group2= {"Madiyar", "Khashayar","Rayhane"}; //3 names
        String[] group3= {"Alena", "Evgeniya","Shukur","Hasan","Bilal"};//5 names
        String[] group4= {"Adelina","Ali"};//2 names

        String[][] groups= {group1, group2, group3, group4};

        //                   0       1        2       3
        for (int i = 0; i < groups.length; i++) {
           String[] eachGroup= groups[i];
            System.out.println(Arrays.toString(eachGroup));

            for (int j = 0; j < eachGroup.length; j++) {
                String eachStudent = eachGroup[j];
                System.out.println(eachStudent);
            }
        }
        for(String[] eachGroup : groups) {
            System.out.println(Arrays.toString(eachGroup));
            for(String eachStudent: eachGroup){
                System.out.println(eachStudent);
            }
        }

        for (int i = groups.length - 1; i >= 0; i--) {
            String[] eachGroup = groups[i];
            System.out.println(Arrays.toString(eachGroup));

        }

        System.out.println(Arrays.toString(groups)); //toString() is for single dimensional arrays only, otherwise you get hashcode
        System.out.println(Arrays.deepToString(groups));
    }
}
