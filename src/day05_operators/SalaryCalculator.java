package day05_operators;

public class SalaryCalculator {

    public static void main(String[] args) {
        double hourlyRate = 55,
                weeklyHours = 45;
        double stateTaxRate = 7; //implicit casting, casting is done implicitly
        double federalTaxRate = 24.5;

        //-------------

        double salaryBeforeTax = hourlyRate * weeklyHours * 52;

        double stateTax = salaryBeforeTax * stateTaxRate /100;
        System.out.println("Gross pay is: $"+ salaryBeforeTax);

        double federalTax = salaryBeforeTax * federalTaxRate/100 ;
        double totalTax  = stateTax + federalTax;
        double salaryAfterTax = salaryBeforeTax - totalTax;
        System.out.println("Gross pay is: $" + salaryBeforeTax);
        System.out.println("Federal tax is: $" + federalTax);
        System.out.println("State tax is: $" + stateTax);
        System.out.println("Total tax is: $"+ totalTax);
        System.out.println("Net income is: $" + salaryAfterTax);

        System.out.println("-------");

        System.out.println("Gross pay is: $" +salaryBeforeTax +
                "\nFederal tax is: $" + federalTax +
                "\nState tax is: $" +stateTax
        );

    }
}
