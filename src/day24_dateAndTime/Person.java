package day24_dateAndTime;

import java.time.LocalDate;

public class Person {
    public String name;
    public int age;
    public char gender;
    public LocalDate dateOfBirth;

    public void setInfo(String name, char gender, LocalDate dateOfBirth) {
        this.name = name;
        this.gender= gender;
        this.dateOfBirth = dateOfBirth;
        age = LocalDate.now().getYear() - dateOfBirth.getYear();
    } // allows you set info for every person object


    public String toString() { //toString method is what compiler looks for
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
