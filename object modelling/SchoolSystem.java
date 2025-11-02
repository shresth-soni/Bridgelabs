import java.util.*;

class Course {
    String courseName;
    ArrayList<Student> students = new ArrayList<>();

    Course(String name) {
        this.courseName = name;
    }

    void addStudent(Student s) {
        students.add(s);
    }

    void showStudents() {
        System.out.println("Course: " + courseName);
        for (Student s : students)
            System.out.println("- " + s.name);
    }
}

class Student {
    String name;
    ArrayList<Course> courses = new ArrayList<>();

    Student(String name) {
        this.name = name;
    }

    void enroll(Course c) {
        courses.add(c);
        c.addStudent(this);
    }

    void showCourses() {
        System.out.println(name + "'s Courses:");
        for (Course c : courses)
            System.out.println("- " + c.courseName);
    }
}

class School {
    String name;
    ArrayList<Student> students = new ArrayList<>();

    School(String name) {
        this.name = name;
    }

    void addStudent(Student s) {
        students.add(s);
    }

    void showStudents() {
        System.out.println("School: " + name);
        for (Student s : students)
            System.out.println("- " + s.name);
    }
}

public class SchoolSystem {
    public static void main(String[] args) {
        School school = new School("Green Valley School");

        Student s1 = new Student("Rahul");
        Student s2 = new Student("Anjali");

        Course c1 = new Course("Math");
        Course c2 = new Course("Science");

        s1.enroll(c1);
        s1.enroll(c2);
        s2.enroll(c1);

        school.addStudent(s1);
        school.addStudent(s2);

        school.showStudents();
        s1.showCourses();
        c1.showStudents();
    }
}
