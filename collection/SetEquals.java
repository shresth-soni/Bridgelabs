// SetEquals.java
import java.util.*;

public class SetEquals {
    public static <T> boolean setsEqual(Set<T> a, Set<T> b) {
        return a.equals(b); // Set equals checks membership, order irrelevant
    }
    public static void main(String[] args){
        System.out.println(setsEqual(new HashSet<>(List.of(1,2,3)), new HashSet<>(List.of(3,2,1))));
        // true
    }
}
