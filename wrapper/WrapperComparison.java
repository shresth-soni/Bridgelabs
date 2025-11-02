public class WrapperComparison {
    public static void main(String[] args) {
        Integer a = 100, b = 100, c = 200, d = 200;

        System.out.println("a == b : " + (a == b));
        System.out.println("c == d : " + (c == d));
        System.out.println("a.equals(b) : " + a.equals(b));

        System.out.println("\nExplanation:");
        System.out.println("a == b is true because Integer caching works between -128 to 127.");
        System.out.println("c == d is false because 200 is outside the cached range.");
    }
}
