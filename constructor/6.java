package com.bridgelabz.oops.constructors;

class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    public double calculateCost() {
        double costPerDay = 2000.0;
        return rentalDays * costPerDay;
    }

    public void displayDetails() {
        System.out.println("Customer: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: " + calculateCost());
    }

    public static void main(String[] args) {
        CarRental r1 = new CarRental("Neer Soni", "Honda City", 5);
        r1.displayDetails();
    }
}
