package day18_garbageCollection;

public class TestPizzaObjects {
    public static void main(String[] args) {
       Pizza pizza= new Pizza();
       //pizza1.size ='m';
       pizza.setInfo('L', 2 , 3);

       Pizza pizza2 = new Pizza();
      // pizza2.size = 'M';
        pizza2.setInfo('S', 1, 2);
        System.out.println(pizza);
        System.out.println(pizza2);
        double total = 0;

        for (int i = 0; i < 20; i++) {
            Pizza small= new Pizza();
            small.setInfo('S', 2, 2);
            total +=small.calcCost();
            Pizza medium = new Pizza();
            medium.setInfo('M', 3, 4);
            total += medium.calcCost();

            Pizza large = new Pizza();
            large.setInfo('L', 4, 5);
            total += large.calcCost();

        }
        System.out.println("total: " + total);

    }
}
