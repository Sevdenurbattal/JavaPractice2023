package day19_Array;

import java.util.Arrays;

public class ArraysPractice1 {
    public static void main(String[] args) {
        String[] myGroup = new String[5]; //use String array, you have to instantiate it
        myGroup[0]= "Gulcin";
        myGroup[myGroup.length-1] = "Aseel";
        myGroup[1]="Sumeye";
        myGroup[1]="Abidullah";
        myGroup[3]= "Khashayar";
        System.out.println(Arrays.toString(myGroup));
        myGroup[1]= "Kuzzat";
        //myGroup[5]="Muhtar";

        for(int i =myGroup.length-1; i>=0; i--){
            System.out.println(myGroup[i]);
        }
        for (int i = myGroup.length - 1; i >= 0; i--) {
            System.out.println(myGroup[i-1]);

        }


    }
}
