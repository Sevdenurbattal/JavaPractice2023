package day08_ternaries_switch;

public class SwitchIntro {
    public static void main(String[] args) {

        char grade = 'Q';

        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good job");
                break;
            case 'C':
                System.out.println("Good");
                break;
            case 'D':
                System.out.println("Passed");
                break;
            case 'F':
                System.out.println("Failed");
                break;
            default :
                System.out.println("Invalid");
        }


        /*
        A
        B
        C
        D
        F
         */
    }
}
