package com.bridgelabz.oops.constructors;

class Circle {
    private double radius;

    // Default constructor
    public Circle() {
        this(5.0); // Calls parameterized constructor
    }

    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    public void displayArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area);
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(10.5);

        c1.displayArea();
        System.out.println("----------------");
        c2.displayArea();
    }
}
