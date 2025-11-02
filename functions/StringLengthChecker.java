import java.util.function.Function;

public class StringLengthChecker {
    public static void main(String[] args) {
        Function<String, Integer> lengthChecker = str -> str.length();

        String msg = "Hello Functional Interface!";
        int length = lengthChecker.apply(msg);

        System.out.println("Message Length: " + length);
        System.out.println(length > 20 ? "Message too long!" : "Message okay.");
    }
}
