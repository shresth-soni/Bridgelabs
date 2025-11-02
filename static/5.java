class Student {
    private static String universityName = "GLA University";
    private static int totalStudents = 0;
    private final int rollNumber;
    private String name;
    private String grade;

    Student(int rollNumber, String name, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        totalStudents++;
    }

    static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    void displayStudentDetails() {
        if (this instanceof Student) {
            System.out.println("University: " + universityName);
            System.out.println("Roll No: " + this.rollNumber);
            System.out.println("Name: " + this.name);
            System.out.println("Grade: " + this.grade);
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student(1, "Neer", "A");
        Student s2 = new Student(2, "Shresth", "B");
        s1.displayStudentDetails();
        s2.displayStudentDetails();
        Student.displayTotalStudents();
    }
}
