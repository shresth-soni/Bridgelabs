// Cart9.java
import java.util.ArrayList;
import java.util.List;

class Electronics { String name; Electronics(String n){name=n;} public String toString(){return name;} }
class Clothing { String name; Clothing(String n){name=n;} public String toString(){return name;} }

class Cart<T> {
    private final List<T> items = new ArrayList<>();
    public void addItem(T item) { items.add(item); }
    public void removeItem(T item) { items.remove(item); }
    public void displayItems() { items.forEach(System.out::println); }
}

public class CartDemo {
    public static void main(String[] args) {
        Cart<Electronics> eCart = new Cart<>();
        eCart.addItem(new Electronics("Phone"));
        eCart.displayItems();

        Cart<Clothing> cCart = new Cart<>();
        cCart.addItem(new Clothing("T-Shirt"));
        cCart.displayItems();
    }
}
