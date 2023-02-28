package day17_customClass;

public class TestEmployeeObjects {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        //it is better to just put info method
        employee1.setInfo("Sumeye", 28, 'F', "Java Developer", 95000, "A12");

        Employee employee2 = new Employee();
        employee2.setInfo("Khashayar", 29, 'M', "Back end developer", 98000, "B13");

        Employee employee3 = new Employee();
        employee3.setInfo("Abidullah", 30, 'M', "Front end developer", 99000, "C14");

        employee1.age =39;
        employee3.name="Lucy";
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);

        employee3.work();

    }
}
