package day13_customMethods;

public class ReturnStatement {

    public static void main(String[] args) {
        eligible(25);
        System.out.println("=-----");
        System.out.println("Test started");
        boolean exit = true;
        if(exit) {
            return; //it will exit correct method so main method gets terminated here, any other lines wont get executed.
        }
        System.out.println("Test 1 completed");

    }
    public static void eligible(int age) {
        if(age <0 || age >150) {

            System.err.println("Invalid age: "+ age);
            return; //exits method
            //if age is invalid, then this gets terminated. I just wanted it to display message, so I did void method
        }
        if(age >=21) {
            System.out.println("eligible");
        }else {
            System.out.println("not eligible");
        }
    }

    public static int multiplication (int n1, int n2) {
        int result = n1*n2;
        return result;
    }
}
