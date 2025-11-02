class Employee {
    private static String companyName = "Tech Solutions Pvt Ltd";
    private static int totalEmployees = 0;
    private final int id;
    private String name;
    private String designation;

    Employee(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        totalEmployees++;
    }

    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    void displayDetails() {
        if (this instanceof Employee) {
            System.out.println("Company: " + companyName);
            System.out.println("ID: " + this.id);
            System.out.println("Name: " + this.name);
            System.out.println("Designation: " + this.designation);
        }
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(201, "Neer", "Developer");
        Employee e2 = new Employee(202, "Shresth", "Tester");
        e1.displayDetails();
        e2.displayDetails();
        Employee.displayTotalEmployees();
    }
}
