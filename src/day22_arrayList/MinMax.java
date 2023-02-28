package day22_arrayList;

public class MinMax {
    public static void main(String[] args) {
        int[][] array =  { {100, 20, 300}, {10, 1000, 50}, {-200, 400, 0} }; //indexes of array:0-2
        //                   0               1                 2
        int max= array[0][0];
        int min= array[0][0];
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length; j++) {
                if(array[i][j] > max){
                    max=array[i][j];
                }
                if(array[i][j]<min){
                    min=array[i][j];
                }
            }

        }
        System.out.println(max);
        System.out.println(min);

    }

}
/*
Write a program that can find the minimum and maximum numbers from a two dimensional array of integers
		Ex:
			array = { {100, 20, 300}, {10, 1000, 50}, {-200, 400, 0} };

			output:
				Minimum number is: -200
				Maximum number is: 1000
 */
