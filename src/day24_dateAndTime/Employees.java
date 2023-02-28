package day24_dateAndTime;

import day17_customClass.Employee;

import java.util.ArrayList;
import java.util.Arrays;

public class Employees {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.addAll(Arrays.asList(
                new Employee(), new Employee(), new Employee(), new Employee(), new Employee()
        ));

        employees.get(0).setInfo("Josh", 34, 'M', "Java Developer", 100000, "A01");
        employees.get(1).setInfo("Emily", 40, 'F', "SDET", 90000, "A02");
        employees.get(1).setInfo("Conor", 38, 'M', "Project Manager", 130000, "A03");
        employees.get(1).setInfo("Bella", 29, 'F', "Java Developer", 95000, "A04");
        employees.get(1).setInfo("Jimmy", 54, 'M', "Data Analyst", 105000, "A05");

        for( Employee each: employees) {
            System.out.println(each.name + " : "+ each.jobTitle);
            }
        System.out.println("-------");

        for(Employee each : employees){
            if(each.jobTitle.equals("Java Developer")){ //if job title of the employee is JD, then get the name of employee
                System.out.println(each.name);
            }
        }
        double minimum= employees.get(0).salary;
        double maximum= employees.get(0).salary;
        for(Employee each : employees){
           if(each.salary >maximum){
               maximum = each.salary;
           }
           if(each.salary <minimum){
               minimum = each.salary;
           }
        }
        System.out.println("max = "+ maximum);
        System.out.println("min= "+ minimum);
        System.out.println("-------------");

        ArrayList<Employee> female = new ArrayList<>();
        ArrayList<Employee> male = new ArrayList<>();
        for(Employee employee: employees){
            if(employee.gender== 'M'){
                male.add(employee);
            }else {
                female.add(employee);
            }
        }
        System.out.println("total num of female employees: "+ female.size());
        System.out.println("total num of male employees: "+ male.size());

    }
}
/*
    Given the following arraylist of Employees:
        ArrayList<Employee> employees = new ArrayList<>();
        employees.addAll(Arrays.asList(
        new Employee(), new Employee(), new Employee(), new Employee(), new Employee()
        ));

        employees.get(0).setInfo("Josh", 34, 'M', "Java Developer", 100000, "A01");
        employees.get(1).setInfo("Emily", 40, 'F', "SDET", 90000, "A02");
        employees.get(1).setInfo("Conor", 38, 'M', "Project Manager", 130000, "A03");
        employees.get(1).setInfo("Bella", 29, 'F', "Java Developer", 95000, "A04");
        employees.get(1).setInfo("Jimmy", 54, 'M', "Data Analyst", 105000, "A05");

        Note: Employee class is imported from day17 package

        1.1 Write a program that can display the name and job title of each employee

        1.2 Write a program that can display the names of "Java Developers"

        1.3 Write a progam that can display the maximum and minimum salary

        1.4 Create two arraylists named femaleEmployees and maleEmployees, write a program that
        can add all the female employees and male emloyees to the femaleEmployees and maleEmployees arraylists
*/