// ProductSortDemo.java
import java.util.*;
import static java.util.Comparator.*;

class Product {
    String name;
    double price;
    double rating;
    int discountPercent;

    Product(String n, double p, double r, int d) { name = n; price = p; rating = r; discountPercent = d; }

    @Override public String toString() {
        return name + " (₹" + price + ", rating: " + rating + ", discount: " + discountPercent + "%)";
    }
}

public class ProductSortDemo {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>(Arrays.asList(
            new Product("Earbuds", 1199, 4.2, 10),
            new Product("Backpack", 2499, 4.6, 30),
            new Product("Mouse", 799, 4.0, 15),
            new Product("Keyboard", 1499, 4.4, 25)
        ));

        // Sort by price ascending
        products.sort(comparingDouble(p -> p.price));
        System.out.println("Sorted by price:");
        products.forEach(System.out::println);

        // Sort by rating descending
        products.sort(comparingDouble((Product p) -> p.rating).reversed());
        System.out.println("\nSorted by rating (desc):");
        products.forEach(System.out::println);

        // Sort by discount (campaign: high discount first)
        products.sort(comparingInt((Product p) -> p.discountPercent).reversed());
        System.out.println("\nSorted by discount (high to low):");
        products.forEach(System.out::println);
    }
}
