import java.util.ArrayList;

public class FactorUtils {

    public static int[] factors(int number) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) list.add(i);
        }
        return list.stream().mapToInt(i -> i).toArray();
    }

    public static int greatestFactor(int number) {
        int[] f = factors(number);
        return f[f.length - 1];
    }

    public static int sumOfFactors(int number) {
        int sum = 0;
        for (int f : factors(number)) sum += f;
        return sum;
    }

    public static long productOfFactors(int number) {
        long prod = 1;
        for (int f : factors(number)) prod *= f;
        return prod;
    }

    public static long productOfCubes(int number) {
        long prod = 1;
        for (int f : factors(number)) prod *= Math.pow(f, 3);
        return prod;
    }
}
