// NameUppercase.java
import java.util.*;
import java.util.stream.Collectors;

public class NameUppercase {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("alice", "bob", "charlie");

        List<String> upper = names.stream()
                                  .map(String::toUpperCase) // method reference
                                  .collect(Collectors.toList());

        System.out.println("Uppercased names: " + upper);
    }
}
