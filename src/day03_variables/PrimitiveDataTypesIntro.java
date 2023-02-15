package day03_variables;

public class PrimitiveDataTypesIntro {

    public static void main(String[] args) {
        //DataType variableName = Data;

        byte a = 78; //byte ONLY accepts integer values (-128~127), it doesnot accept "Java".
        //byte a =20000; // it gives compiling error because it is out of Byte range.

        //price of the car is $17500

        short p = 17500;
        System.out.println("p");
        System.out.println(p);

        //salary is $95000;
        int s = 95000; //preferred

        System.out.println(s);

        //int n= 999999999999;
        long n = 999999999999L;

        //gpa is 3.5
        double gpa1 = 3.5; //preferred

        float gpa2 = 3.5F;
    }


}
