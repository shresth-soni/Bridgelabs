// RemoveDuplicates.java
import java.util.*;

public class RemoveDuplicates {
    public static <T> List<T> removeDuplicatesPreserveOrder(List<T> list) {
        Set<T> seen = new LinkedHashSet<>();
        List<T> out = new ArrayList<>();
        for (T x : list) {
            if (seen.add(x)) out.add(x);
        }
        return out;
    }
    public static void main(String[] args){
        System.out.println(removeDuplicatesPreserveOrder(List.of(3,1,2,2,3,4)));
        // [3,1,2,4]
    }
}
