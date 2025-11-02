// Module 1: collegeinfo/module-info.java
module collegeinfo {
    exports college.student;
}
// Module 1: college/student/Student.java
package college.student;

public class Student {
    public void showInfo() {
        System.out.println("Module: collegeinfo → Student Data");
    }
}
// Module 2: app/module-info.java
module app {
    requires collegeinfo;
}
// Module 2: app/MainApp.java
import college.student.Student;

public class MainApp {
    public static void main(String[] args) {
        Student s = new Student();
        s.showInfo();
    }
}
