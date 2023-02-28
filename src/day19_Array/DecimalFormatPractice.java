package day19_Array;

import java.text.DecimalFormat;

public class DecimalFormatPractice {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.0");
        double n1= 10.528379;
        System.out.println(df.format(n1));
    }
}
