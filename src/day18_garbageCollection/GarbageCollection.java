package day18_garbageCollection;

import day17_customClass.Dog;

public class GarbageCollection {
    public static void main(String[] args) {
        String s1= "Java";
        s1= null;
       // System.out.println(s1);
        //System.out.println(s1.toUpperCase());
        String a = "";
        String b= null;
        System.out.println("------------");
        String str1= "Python"; //it is no longer an object, since it is assigned to new variable, therefore it will be collected by GC
        str1= "CYDEO";
        System.out.println(str1);
        System.out.println("------------");

        Dog dog3 = new Dog();
        dog3.setInfo("Loki"," Chow chow", 'M', 4, "small", "black");
        Dog dog1 = new Dog();
        dog1.setInfo("Loki", "bulldog", 'M', 5, "small", "white");
        dog1=dog3;
        System.out.println(dog1);
        System.out.println(dog3);

    }
}
