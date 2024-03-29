import java.util.Scanner;

class DevOpsCalculator extends Employee {
    private double bonus;

    // Constructor
    public DevOpsCalculator(String name, int employeeId, double baseSalary, double bonus) {
        super(name, employeeId, baseSalary);
        this.bonus = bonus;
    }

    // Calculate total salary including bonus
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Bonus: $" + bonus);
        System.out.println("Total Salary: $" + (baseSalary + bonus));
    }
}

public class DevOpsEngineer { // Renamed the class to DevOpsCalculator
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in); // Renamed to inputScanner for clarity

        // Employee details
        System.out.println("Enter employee name:");
        String name = inputScanner.nextLine();
        System.out.println("Enter employee ID:");
        int employeeId = inputScanner.nextInt();
        System.out.println("Enter employee base salary:");
        double baseSalary = inputScanner.nextDouble(); 

        // Create Employee object and display details
        Employee employee = new Employee(name, employeeId, baseSalary);
        System.out.println("\nEmployee Details:");
        employee.displayDetails();

        // DevOps Engineer details
        System.out.println("\nEnter bonus for DevOps Engineer:");
        double bonus = inputScanner.nextDouble();

        // Close scanner
        inputScanner.close();
    }
}
