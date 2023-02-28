package day22_arrayList;
import java.lang.Byte;

public class WrapperClassesIntro {
    public static void main(String[] args) {


        String str = "Java";
        int a1 = 10;
        Integer a2 = 10;
        System.out.println("----------");
        int b1=100;
        Integer b2= b1; //autoboxing
      //  Long b3=b1; this gives compiler error
       // Long b3= (long)b1; even if casting works here you should not use
        char ch ='A';
        Character ch2 =ch; //autoboxing
        double d1= 5.5;
        Double d2= d1; //autoboxing
        System.out.println("-------");
        Integer n1= 20;

        int n2= n1; //unboxing
    //    long n3=n1;
      //  double n4= n1;

        Character e1='Z';
        char e2= e1; //unboxing
      //  int e3=e1;




    }
}
