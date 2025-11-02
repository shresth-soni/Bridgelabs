class Product {
    private static double discount = 10.0;
    private final int productID;
    private String productName;
    private double price;
    private int quantity;

    Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    void displayDetails() {
        if (this instanceof Product) {
            System.out.println("Product ID: " + this.productID);
            System.out.println("Name: " + this.productName);
            System.out.println("Price: ₹" + this.price);
            System.out.println("Quantity: " + this.quantity);
            System.out.println("Discount: " + discount + "%");
        }
    }

    public static void main(String[] args) {
        Product p1 = new Product(301, "Laptop", 75000, 2);
        p1.displayDetails();
        Product.updateDiscount(15);
        System.out.println("\nAfter Discount Update:");
        p1.displayDetails();
    }
}
