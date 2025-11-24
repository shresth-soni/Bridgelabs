// Animals8.java
import java.util.List;

class Animal { String name; Animal(String n){name=n;} }
class Dog extends Animal { Dog(String n){super(n);} }
class Cat extends Animal { Cat(String n){super(n);} }

public class AnimalPrinter {
    public static void printAnimals(List<? extends Animal> animals) {
        for (Animal a : animals) System.out.println(a.name);
    }

    public static void main(String[] args) {
        List<Dog> dogs = List.of(new Dog("Rex"), new Dog("Buddy"));
        List<Cat> cats = List.of(new Cat("Luna"), new Cat("Milo"));
        printAnimals(dogs);
        printAnimals(cats);
    }
}
