package day17_customClass;

public class TestDogObjects {
    public static void main(String[] args) {
       Dog dog1 = new Dog();
       dog1.name = "Max";
       dog1.breed ="Husky";
       dog1.age = 4;
       dog1.size = "Large";

       dog1.eat();
        System.out.println(dog1);

        Dog dog2 = new Dog();
        dog2.name= "Leki";
        dog2.breed= "Golden Retriver";
        dog2.gender = 'F';
        dog2.size = "Small";
        System.out.println(dog2);
        
        Dog dog3 = new Dog();
        dog3.setInfo("Loki"," Chow chow", 'M', 4, "small", "black");
        System.out.println(dog3);

    }


}
