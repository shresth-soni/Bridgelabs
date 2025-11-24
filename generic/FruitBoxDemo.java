// FruitBox5.java
import java.util.ArrayList;
import java.util.List;

class Fruit { public String name; Fruit(String n){ name = n; } }
class Apple extends Fruit { Apple(){ super("Apple"); } }
class Mango extends Fruit { Mango(){ super("Mango"); } }

class FruitBox<T extends Fruit> {
    private final List<T> fruits = new ArrayList<>();
    public void add(T f){ fruits.add(f); }
    public void display(){
        for (T f : fruits) System.out.println(f.name);
    }
}

public class FruitBoxDemo {
    public static void main(String[] args) {
        FruitBox<Apple> apples = new FruitBox<>();
        apples.add(new Apple());
        apples.display();

        FruitBox<Fruit> mixed = new FruitBox<>();
        mixed.add(new Apple());
        mixed.add((Fruit) new Mango());
        mixed.display();

        // The following would NOT compile:
        // FruitBox<Car> carBox = new FruitBox<>(); // Car is not a Fruit
    }
}
