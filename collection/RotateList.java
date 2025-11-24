// RotateList.java
import java.util.*;

public class RotateList {
    public static <T> List<T> rotate(List<T> list, int k) {
        int n = list.size();
        if (n == 0) return new ArrayList<>();
        k = ((k % n) + n) % n;
        List<T> out = new ArrayList<>(n);
        for (int i = 0; i < n; ++i) out.add(list.get((i + k) % n));
        return out;
    }
    public static void main(String[] args){
        System.out.println(rotate(List.of(10,20,30,40,50), 2));
        // [30,40,50,10,20]
    }
}
