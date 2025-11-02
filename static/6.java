class Vehicle {
    private static double registrationFee = 5000;
    private final String registrationNumber;
    private String ownerName;
    private String vehicleType;

    Vehicle(String registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    void displayDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner: " + this.ownerName);
            System.out.println("Vehicle Type: " + this.vehicleType);
            System.out.println("Registration No: " + this.registrationNumber);
            System.out.println("Registration Fee: ₹" + registrationFee);
        }
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("UP93B1234", "Neer", "Car");
        v1.displayDetails();
        Vehicle.updateRegistrationFee(6000);
        System.out.println("\nAfter Fee Update:");
        v1.displayDetails();
    }
}
