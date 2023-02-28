package day15_WhileLoop;

public class ContinueStatement {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            if(i==4) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("-----------");

        for(int i =10; i<21; i++) {
            if(i%2==0){ //if it is even, skips current iteration
                continue;
            }
            System.out.println(i);
        }
        System.out.println("--------");

        for (char i ='A'; i<='G'; i++) {
            if(i=='B'|| i=='E') //char can only be single character, so you can only use OR condition.
                continue;
            System.out.println(i);

        }
        System.out.println("-----------");// find sum of all the even number btw 50~100
        for(int i =50; i<101; i++) {
            if(i%2== 0) {
                System.out.print(i+" ");
            }
        }
        System.out.println();

        for(int i=50; i<101; i+=2){
            System.out.print(i+" ");
        }
        System.out.println();
        for ( int i =50; i<101; i++) {
            if(i%2 !=0) {
                continue;
            }
            System.out.print(i+" ");
        }
        System.out.println();
    }
}

