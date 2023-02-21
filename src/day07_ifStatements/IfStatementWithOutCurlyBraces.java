package day07_ifStatements;

public class IfStatementWithOutCurlyBraces {

    public static void main(String[] args) {
        int age =42;
        if(age >= 21) {
            System.out.println("Eligible");
        }else {
            System.out.println("not eligible");
        }
        if(age >=21) System.out.println("eligible");
        else System.out.println("not eligible");


        int day = 2; //1-7
        if(day==1)System.out.println("Monday");
        else if(day==2) System.out.println("Tuesday");
        else if (day ==3) System.out.println("wed");
        else if (day ==4) System.out.println("Thursday");
        else if (day ==5) System.out.println("Friday");
        else if (day ==6) System.out.println("Sat");
        else System.out.println("Sunday");



    }
}
