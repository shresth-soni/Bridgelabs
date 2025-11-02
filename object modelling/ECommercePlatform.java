import java.util.*;

class Product {
    String name;
    double price;
    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

class Order {
    int orderId;
    ArrayList<Product> products = new ArrayList<>();

    Order(int orderId) {
        this.orderId = orderId;
    }

    void addProduct(Product p) {
        products.add(p);
    }

    void showOrder() {
        System.out.println("Order ID: " + orderId);
        for (Product p : products)
            System.out.println("- " + p.name + ": ₹" + p.price);
    }
}

class Customer {
    String name;
    ArrayList<Order> orders = new ArrayList<>();

    Customer(String name) {
        this.name = name;
    }

    void placeOrder(Order o) {
        orders.add(o);
    }

    void showOrders() {
        System.out.println("Customer: " + name);
        for (Order o : orders)
            o.showOrder();
    }
}

public class ECommercePlatform {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 75000);
        Product p2 = new Product("Mouse", 1000);

        Order o1 = new Order(101);
        o1.addProduct(p1);
        o1.addProduct(p2);

        Customer c1 = new Customer("Shreya");
        c1.placeOrder(o1);

        c1.showOrders();
    }
}
