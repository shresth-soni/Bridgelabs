// Interface
interface Department {
    void assignDepartment(String deptName);
    String getDepartmentDetails();
}

// Abstract Class
abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public int getEmployeeId() { return employeeId; }
    public String getName() { return name; }
    public double getBaseSalary() { return baseSalary; }

    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
    }

    public abstract double calculateSalary();
}

// Subclass 1
class FullTimeEmployee extends Employee implements Department {
    private String department;

    public FullTimeEmployee(int id, String name, double baseSalary) {
        super(id, name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() * 1.2; // Fixed increment for full-time
    }

    @Override
    public void assignDepartment(String deptName) {
        department = deptName;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department: " + department;
    }
}

// Subclass 2
class PartTimeEmployee extends Employee implements Department {
    private int hoursWorked;
    private double ratePerHour;
    private String department;

    public PartTimeEmployee(int id, String name, double baseSalary, int hours, double rate) {
        super(id, name, baseSalary);
        this.hoursWorked = hours;
        this.ratePerHour = rate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * ratePerHour;
    }

    @Override
    public void assignDepartment(String deptName) {
        department = deptName;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department: " + department;
    }
}

// Main
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee(101, "Alice", 30000);
        Employee e2 = new PartTimeEmployee(102, "Bob", 0, 80, 400);

        ((Department) e1).assignDepartment("IT");
        ((Department) e2).assignDepartment("Support");

        Employee[] employees = {e1, e2};

        for (Employee e : employees) {
            e.displayDetails();
            System.out.println("Calculated Salary: " + e.calculateSalary());
            System.out.println(((Department) e).getDepartmentDetails());
            System.out.println("------------------------");
        }
    }
}
