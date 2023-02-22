package day08_ternaries_switch;

public class IfStatementAndTernariesPractice {

    public static void main(String[] args) {

        int score = 90;

        String result = (score >= 0 && score <= 100) ? (score >=90) ?"A" : (score >=80)? "B" :(score>=70) ?"C" :(score>=60)? "D" : "F"
                : "Invalid score";
        System.out.println(result);
    }
}
