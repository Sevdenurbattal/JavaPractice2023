package day08_ternaries_switch;

public class SwitchStatementIntro2 {

    public static void main(String[] args) {
        int n =9;
        String day ="";

        switch(n) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Not such a day ");
        }
    }
}
