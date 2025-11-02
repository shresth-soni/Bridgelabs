public package com.bridgelabz.oops.classvars;

class Course {
    String courseName;
    int duration;
    double fee;
    static String instituteName = "BridgeLabz";

    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println("Institute: " + instituteName);
        System.out.println("Course: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: " + fee);
    }

    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }

    public static void main(String[] args) {
        Course c1 = new Course("Java Full Stack", 6, 15000);
        c1.displayCourseDetails();
        Course.updateInstituteName("Code Academy");
        Course c2 = new Course("Python", 4, 12000);
        c2.displayCourseDetails();
    }
}
 {
    
}
