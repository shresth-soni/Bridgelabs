// File: com/company/hr/Employee.java
package com.company.hr;

public class Employee {
    private int id;
    private String name, department;
    private double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }

    public void setSalary(double salary) { this.salary = salary; }
}
// File: com/company/payroll/Payroll.java
package com.company.payroll;

import com.company.hr.Employee;

public class Payroll {
    public void calculateBonus(Employee e) {
        double bonus = e.getSalary() * 0.10;
        e.setSalary(e.getSalary() + bonus);
        System.out.println("Bonus added: " + bonus);
    }
}
// File: com/company/main/MainApp.java
package com.company.main;

import com.company.hr.*;
import com.company.payroll.*;

public class MainApp {
    public static void main(String[] args) {
        Employee e = new Employee(101, "Neer", "HR", 50000);
        Payroll p = new Payroll();
        p.calculateBonus(e);
        System.out.println("Employee: " + e.getName() + " | Salary after bonus: " + e.getSalary());
    }
}
