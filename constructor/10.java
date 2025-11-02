public package com.bridgelabz.oops.accessmodifiers;

class Student {
    public int rollNumber;
    protected String name;
    private double cgpa;

    public Student(int rollNumber, String name, double cgpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.cgpa = cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public double getCgpa() {
        return cgpa;
    }
}

class PostgraduateStudent extends Student {
    public PostgraduateStudent(int rollNumber, String name, double cgpa) {
        super(rollNumber, name, cgpa);
    }

    public void displayDetails() {
        System.out.println("Roll No: " + rollNumber + ", Name: " + name + ", CGPA: " + getCgpa());
    }

    public static void main(String[] args) {
        PostgraduateStudent s1 = new PostgraduateStudent(101, "Neer", 8.9);
        s1.displayDetails();
    }
}
 {
    
}
