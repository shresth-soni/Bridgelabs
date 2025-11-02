class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Name: " + name + ", ID: " + id + ", Salary: " + salary);
    }
}

class Manager extends Employee {
    int teamSize;

    Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}

class Developer extends Employee {
    String programmingLanguage;

    Developer(String name, int id, double salary, String language) {
        super(name, id, salary);
        this.programmingLanguage = language;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Language: " + programmingLanguage);
    }
}

class Intern extends Employee {
    String mentorName;

    Intern(String name, int id, double salary, String mentorName) {
        super(name, id, salary);
        this.mentorName = mentorName;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Mentor: " + mentorName);
    }
}

public class EmployeeSystem {
    public static void main(String[] args) {
        Employee e1 = new Manager("Amit", 1, 80000, 5);
        Employee e2 = new Developer("Ravi", 2, 60000, "Java");
        Employee e3 = new Intern("Nita", 3, 15000, "Amit");

        e1.displayDetails();
        e2.displayDetails();
        e3.displayDetails();
    }
}
