import java.util.Scanner;

// Employee class
class Employee {
    private String name;
    private int employeeId;
    protected double baseSalary; // Renamed to baseSalary to avoid conflict

    // Constructor
    public Employee(String name, int employeeId, double baseSalary) {
        this.name = name;
        this.employeeId = employeeId;
        this.baseSalary = baseSalary;
    }

    // Display employee details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Base Salary: $" + baseSalary);
    }
}



