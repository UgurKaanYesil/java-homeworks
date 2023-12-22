package Odev5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter worked days: ");
        int workedDays = scanner.nextInt();

        Employee accountingEmployee = new Employee("Uğur Kaan", "Yeşil", workedDays);

        double salary = accountingEmployee.calculateSalary();

        System.out.println("First Name: " + accountingEmployee.getFirstName() + ", Last Name: " + accountingEmployee.getLastName());
        System.out.println("Worked Days: " + accountingEmployee.getWorkedDays());
        System.out.println("Salary: " + salary + " TL");

        scanner.close();
    }
}
