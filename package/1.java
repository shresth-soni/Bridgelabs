// File: college/student/Student.java
package college.student;

public class Student {
    public void display(String name, int rollNo) {
        System.out.println("Student Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }
}
// File: college/faculty/Faculty.java
package college.faculty;

public class Faculty {
    public void display(String name, String subject) {
        System.out.println("Faculty Name: " + name);
        System.out.println("Subject: " + subject);
    }
}
// File: MainApp.java
import college.student.*;
import college.faculty.*;

public class MainApp {
    public static void main(String[] args) {
        Student s = new Student();
        s.display("Shresth", 101);

        Faculty f = new Faculty();
        f.display("Dr. Mehta", "Computer Science");
    }
}
