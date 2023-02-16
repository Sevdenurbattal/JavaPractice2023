package day06_ifStatements;

public class OddOrEven {
    public static void main(String[] args) {

        int number =20;
        boolean isEven = number %2 ==0; //when we divide a number by 2 , if remainder is 0, means number is even
       // boolean isOdd = number %2 !=0;
        boolean isOdd = !isEven;
        System.out.println(number + " is an even number: "+ isEven);
        System.out.println( number + " is an odd number: " + isOdd);

    }

}
