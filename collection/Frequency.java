// Frequency.java
import java.util.*;

public class Frequency {
    public static Map<String,Integer> freq(List<String> list) {
        Map<String,Integer> map = new HashMap<>();
        for (String s : list) map.put(s, map.getOrDefault(s, 0) + 1);
        return map;
    }
    public static void main(String[] args){
        System.out.println(freq(List.of("apple","banana","apple","orange")));
        // {apple=2, banana=1, orange=1}
    }
}
