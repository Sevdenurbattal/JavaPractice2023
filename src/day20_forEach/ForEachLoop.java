package day20_forEach;

public class ForEachLoop {
    public static void main(String[] args) {
        int[] numbers= {10,20,30,40,50};
        for (int i = 2; i < numbers.length; i++) { //initialization, condition, iterator
            System.out.println(numbers[i]);

        }

        for( int each:numbers) {
            System.out.println(each);
        }

    }
}
