package day14_forLoop;

public class OverloadingTheMainMethod {
    public static void main(String[] args) {
        System.out.println("A");
        main(25); //B
        main(2.05); //C
    }

    public static void main(int args) {
        System.out.println("B");

    }

    public static void main(double args) {
        System.out.println("C");
    }
}
