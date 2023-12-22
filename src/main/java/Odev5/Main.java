package Odev5;

public class Main {
    public static void main(String[] args) {
        Employee accountingEmployee = new Employee("Uğur Kaan", "Yeşil", 28);

        double salary = accountingEmployee.calculateSalary();

        System.out.println("First Name: " + accountingEmployee.getFirstName() + ", Last Name: " + accountingEmployee.getLastName());
        System.out.println("Worked Days: " + accountingEmployee.getWorkedDays());
        System.out.println("Salary: " + salary + " TL");
    }
}
