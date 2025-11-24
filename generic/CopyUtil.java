public // Copy7.java
import java.util.List;
import java.util.ArrayList;

public class CopyUtil {
    public static void copyList(List<? super Number> dest, List<? extends Number> src) {
        for (Number n : src) dest.add(n);
    }

    public static void main(String[] args) {
        List<Number> dest = new ArrayList<>();
        List<Integer> src = List.of(1,2,3);
        copyList(dest, src);
        System.out.println(dest); // [1, 2, 3]
    }
}
 {
    
}
