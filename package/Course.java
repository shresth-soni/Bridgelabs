// File: com/university/department/cse/Course.java
package com.university.department.cse;

public class Course {
    public void showCourse() {
        System.out.println("Course: B.Tech CSE");
        System.out.println("Duration: 4 years");
    }
}
// File: MainApp.java
import com.university.department.cse.Course;

public class MainApp {
    public static void main(String[] args) {
        Course c = new Course();
        c.showCourse();
    }
}
