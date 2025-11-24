// Box1.java
public class Box<T> {
    private T value;
    public void set(T value) { this.value = value; }
    public T get() { return value; }

    public static void main(String[] args) {
        Box<Integer> b1 = new Box<>();
        b1.set(42);
        System.out.println("Integer: " + b1.get());

        Box<String> b2 = new Box<>();
        b2.set("Hello");
        System.out.println("String: " + b2.get());

        Box<Double> b3 = new Box<>();
        b3.set(3.14);
        System.out.println("Double: " + b3.get());
    }
}
