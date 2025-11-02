import java.util.*;

class Professor {
    String name;
    Professor(String name) { this.name = name; }
}

class CourseU {
    String name;
    Professor professor;

    CourseU(String name) { this.name = name; }

    void assignProfessor(Professor p) {
        this.professor = p;
        System.out.println("Professor " + p.name + " assigned to " + name);
    }
}

class StudentU {
    String name;
    ArrayList<CourseU> courses = new ArrayList<>();

    StudentU(String name) { this.name = name; }

    void enrollCourse(CourseU c) {
        courses.add(c);
        System.out.println(name + " enrolled in " + c.name);
    }
}

public class UniversityManagementSystem {
    public static void main(String[] args) {
        Professor prof = new Professor("Dr. Sharma");
        CourseU c1 = new CourseU("Data Structures");
        c1.assignProfessor(prof);

        StudentU s1 = new StudentU("Neer");
        s1.enrollCourse(c1);
    }
}
