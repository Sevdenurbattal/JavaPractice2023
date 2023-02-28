package day13_customMethods;

public class ReturnMethodsPractice {
    public static void main(String[] args) {
        System.out.println(isOdd(100));
        int num1 =200;
        if(isEven(num1)){
            System.out.println(num1 + " is even number");
        }else {
            System.out.println(num1 + " is odd number");
        }



    }
    public static boolean isOdd (int num1) {
        // return (num1%2 !=0)?true : false;
        if (num1 % 2 != 0) {
            return true;
        }
        return false;
    }
    public static boolean isEven (int num2) {
        return !isOdd(num2);
    }


    public static int maximum(int n1 , int n2) {
        //return n1>n2 ? n1 : n2;
        if (n1 > n2) {
            return n1;
        }
        return n2;
    }

}

/*
create method named isOdd, that can return true if number is odd num
create method named max , return max number between two numbers


 */
