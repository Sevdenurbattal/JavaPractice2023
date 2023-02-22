package day08_ternaries_switch;

public class TernaryIntro3 {

    public static void main(String[] args) {
        int score = 95;

        /*

        if (score >= 0 && score <= 100) {
            if (score >= 60) {
                result = "Passed";
            } else {
                result = "Failed";
            }
        }else {
                result ="Invalid";
            }
            System.out.println(result);

         */
        String result = (score >=0 && score <=100) ?
                (score>= 60) ? "Passed" :"Failed" :
                "Invalid";

        System.out.println(result);

        System.out.println("-------------");

        int n= 5;

        String day = (n>=1 && n <=7) ? (n==1) ? "Monday" : (n==2) ? "tuesday":
                (n==3) ? "Wed" : (n==4) ? "Thursday" : (n==5) ? "Friday" : (n==6) ?"Sat" : "sunday"

                : "No such a day";
        System.out.println(day);

        }
    }
