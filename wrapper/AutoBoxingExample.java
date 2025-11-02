import java.util.ArrayList;

public class AutoBoxingExample {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i); // Auto-boxing
        }

        int sum = 0;
        for (int n : numbers) { // Auto-unboxing
            sum += n;
        }

        System.out.println("Sum of numbers = " + sum);
    }
}
