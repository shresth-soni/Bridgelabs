import java.util.*;

public class CountryCapital {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("India","New Delhi");
        map.put("USA","Washington D.C.");
        map.put("Japan","Tokyo");
        map.put("France","Paris");
        map.put("Brazil","Brasilia");
        map.put("Canada","Ottawa");
        map.put("Australia","Canberra");
        map.put("Germany","Berlin");

        // Lookup example:
        String query = "Japan";
        System.out.println("Lookup '" + query + "': " + 
            (map.containsKey(query) ? map.get(query) : "Unknown country"));

        // Print all sorted by country
        System.out.println("\nAll countries (alphabetical):");
        map.keySet().stream().sorted()
            .forEach(c -> System.out.println(c + " -> " + map.get(c)));
    }
}
