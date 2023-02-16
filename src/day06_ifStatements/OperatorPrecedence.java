package day06_ifStatements;

public class OperatorPrecedence {
    public static void main(String[] args) {
        System.out.println( 7 +3 -2 /2 );
        //                  10 - 1

        System.out.println(10 >9 ==8 <7 && "Java" == "Phython" || 'a' == 'A');
        //                 true ==false && false                ||  false   => false

    }
}
