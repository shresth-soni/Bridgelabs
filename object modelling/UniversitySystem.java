import java.util.*;

class Faculty {
    String name;
    Faculty(String name) {
        this.name = name;
    }
    void show() {
        System.out.println("Faculty: " + name);
    }
}

class DepartmentU {
    String name;
    DepartmentU(String name) {
        this.name = name;
    }
    void show() {
        System.out.println("Department: " + name);
    }
}

class University {
    String name;
    ArrayList<DepartmentU> departments = new ArrayList<>();
    ArrayList<Faculty> faculties = new ArrayList<>();

    University(String name) {
        this.name = name;
    }

    void addDepartment(DepartmentU d) {
        departments.add(d);
    }

    void addFaculty(Faculty f) {
        faculties.add(f);
    }

    void showDetails() {
        System.out.println("University: " + name);
        for (DepartmentU d : departments)
            d.show();
        for (Faculty f : faculties)
            f.show();
    }
}

public class UniversitySystem {
    public static void main(String[] args) {
        University u = new University("Delhi University");
        DepartmentU d1 = new DepartmentU("CSE");
        DepartmentU d2 = new DepartmentU("ECE");
        Faculty f1 = new Faculty("Dr. Meena");
        Faculty f2 = new Faculty("Dr. Ravi");

        u.addDepartment(d1);
        u.addDepartment(d2);
        u.addFaculty(f1);
        u.addFaculty(f2);

        u.showDetails();
    }
}
