package day17_customClass;

public class Dog {

    public String name;
    public String breed;
    public String size;
    public char gender;
    public int age;
    public String color;
    public void setInfo(String name, String breed, char gender, int age, String size, String color){
                         // "Max" the argument must be set to instance variable.
        this.name = name;  // this keyword is used for calling  the instance variable name
        this.breed = breed;
        this.gender= gender;
        this.age= age;
        this.size = size;
        this.color = color;

    }


    public void eat(){
        System.out.println(name + " is eating");
    }

    public String toString() { // to avoid getting hash-codes when we print the class objects
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
