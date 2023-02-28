package day14_forLoop;

public class ForLoopPractice {
    public static void main(String[] args) {
        for(int i =10; i>=10; i--) { //i value is set to 10, then it will check condition, i<=10, then iteration gets executed, i: 10, 9, 8, 7, 6, 5, 4
            System.out.println("Hello Cydeo");//1, 2, 3, 4,5, 6
        }
       // System.out.println("Hello World"); this can never gets executed since condition never gets false
        System.out.println("---------");

        int sum =0;
        for (int i=1; i <=100; i ++){
            sum+=i;

        }
        System.out.println(sum); //this wont be repeated therefore should be inside the loop
        System.out.println("---------");

        for (char i ='A'; i<='Z'; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
       // System.out.println("Hello");
        for (char i ='Z'; i >='A'; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Cydeo");


    }
    /*

    sum of all numbers 1-100
    print all the alphabet letters A-Z
     */
}
