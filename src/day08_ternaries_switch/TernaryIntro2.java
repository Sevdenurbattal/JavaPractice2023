package day08_ternaries_switch;

public class TernaryIntro2 {
    public static void main(String[] args) {
        int number = 100;

       String result= (number>0) ? "Positive" :(number<0) ? "Negative" : "Zero";
        System.out.println(result);

        System.out.println("-----------");

        int n = 1;
        String day = (n==1)? "Monday" : (n==2) ? "Tuesday" : (n==3) ? "Wednesday" : (n==4) ? "Thursday" : (n==5) ? "Friday":
                (n==6) ? "Saturday": "Sunday";
        System.out.println(day);

        System.out.println("-----");
        int num =4;
        String month= (num==1) ?"Jan": (num==2)? "Feb" : (num==3) ? "March" : (num==4) ? "April":
                (num==5) ? "May" : "June";
        System.out.println(month);



    }
}
