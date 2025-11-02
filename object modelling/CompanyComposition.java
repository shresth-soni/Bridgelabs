import java.util.*;

class Employee {
    String name;
    Employee(String name) {
        this.name = name;
    }
    void display() {
        System.out.println("Employee: " + name);
    }
}

class Department {
    String name;
    ArrayList<Employee> employees;

    Department(String name) {
        this.name = name;
        employees = new ArrayList<>();
    }

    void addEmployee(Employee e) {
        employees.add(e);
    }

    void display() {
        System.out.println("Department: " + name);
        for (Employee e : employees)
            e.display();
    }
}

class Company {
    String name;
    ArrayList<Department> departments;

    Company(String name) {
        this.name = name;
        departments = new ArrayList<>();
    }

    void addDepartment(Department d) {
        departments.add(d);
    }

    void display() {
        System.out.println("Company: " + name);
        for (Department d : departments)
            d.display();
    }
}

public class CompanyComposition {
    public static void main(String[] args) {
        Company comp = new Company("TechNova Pvt Ltd");
        Department d1 = new Department("IT");
        Department d2 = new Department("HR");

        d1.addEmployee(new Employee("Ravi"));
        d1.addEmployee(new Employee("Sita"));
        d2.addEmployee(new Employee("Meera"));

        comp.addDepartment(d1);
        comp.addDepartment(d2);

        comp.display();
        System.out.println("If company is deleted → all departments/employees deleted too!");
    }
}
