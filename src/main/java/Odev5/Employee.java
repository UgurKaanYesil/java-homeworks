package Odev5;

public class Employee {
    private String firstName;
    private String lastName;
    private int workedDays;

    public Employee(String firstName, String lastName, int workedDays) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.workedDays = workedDays;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getWorkedDays() {
        return workedDays;
    }

    public double calculateSalary() {
        double salary = workedDays * 100; // Daily wage: 100TL
        if (workedDays > 25) {
            int extraDays = workedDays - 25;
            double bonus = extraDays * 1000; // Extra bonus: 1000TL/day
            salary += bonus;
        }
        return salary;
    }
}
