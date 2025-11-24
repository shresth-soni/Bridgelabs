public // Price10.java
import java.util.List;

class Product { private double price; Product(double p){price=p;} public double getPrice(){return price;} }
class Mobile extends Product { Mobile(double p){super(p);} }
class Laptop extends Product { Laptop(double p){super(p);} }

public class PriceCalc {
    public static double calculateTotal(List<? extends Product> items) {
        double total = 0.0;
        for (Product p : items) total += p.getPrice();
        return total;
    }

    public static void main(String[] args) {
        List<Mobile> mobiles = List.of(new Mobile(100.0), new Mobile(200.0));
        System.out.println(calculateTotal(mobiles)); // 300.0
    }
}
 {
    
}
