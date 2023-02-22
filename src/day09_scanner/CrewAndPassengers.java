package day09_scanner;

public class CrewAndPassengers {
    public static void main(String[] args) {
        int number= 50;
        String result1 =  (number ==50 || number==75 || number ==100)?
                (number ==50)? "20 crew, 30 passengers"
                : (number ==75)? "25 crew, 50 passengers" : "30 crew, 70 passengers"
                : "Invalid";
        System.out.println(result1);

        System.out.println("--------------");

        String result2 ="";
        switch(number) {
            case 50:
                System.out.println("20 crew, 30 passengers");
                break;
            case 75:
                System.out.println("25 crew, 50 passengers");
                break;
            case 100:
                System.out.println("30 crew, 70 passengers");
                break;
            default:
                System.out.println("Invalid");
        }




    }
}
