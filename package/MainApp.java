// File: MainApp.java
import com.access.two.Derived;

public class MainApp {
    public static void main(String[] args) {
        Derived d = new Derived();
        d.testAccess();
    }
}
// File: college/faculty/Faculty.java
package college.faculty;

public class Faculty {
    public String name, subject;
    public Faculty(String n, String s) { name = n; subject = s; }
    public void show() {
        System.out.println("Faculty: " + name + " - " + subject);
    }
}
// File: college/department/Department.java
package college.department;

public class Department {
    public String name;
    public Department(String n) { name = n; }
    public void show() {
        System.out.println("Department: " + name);
    }
}
// File: college/main/MainApp.java
package college.main;

import college.student.*;
import college.faculty.*;
import college.department.*;
import static java.lang.System.out;

public class MainApp {
    public static void main(String[] args) {
        out.println("=== College Management System ===");
        Student s = new Student("Neer", 101);
        Faculty f = new Faculty("Dr. Sharma", "AI & ML");
        Department d = new Department("Computer Science");
        s.show();
        f.show();
        d.show();
    }
}
