package day07_ifStatements;

public class NestedIfIntro {
    public static void main(String[] args) {
        int score = -300;
        if(score >= 0 && score <=100) { //if score is valid
            if (score >= 60) { //score is greater or equal to 60
                System.out.println("passed");
            } else { //score is less rgan 60
                System.out.println("Failed");
            }
        } else { //if score not valid
            System.out.println("Invalid score");
        }

        System.out.println("---------");
        int day = 500;
        if(day>=1 && day <=7) {
            if (day == 1) {
                System.out.println("monday");
            }
            if (day == 2) {
                System.out.println("Tuesday");
            }
            if (day == 3) {
                System.out.println("wednesday");
            }
            if (day == 4) {
                System.out.println("Thursday");
            }
            if (day == 5) {
                System.out.println("Friday");
            }
            if (day == 6) {
                System.out.println("saturday");
            }
            if (day == 7) {
                System.out.println("sunday");
            }
        }else { //if precondition is failed
            System.out.println("Invalid Day");
        }


        /*
        if(day==1) {
            System.out.println("Monday");
        } else if (day ==2) {
            System.out.println();
        }

         */
    }
}
