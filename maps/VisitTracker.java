import java.util.*;
import java.util.stream.Collectors;

public class VisitTracker {
    public static void main(String[] args) {
        Map<String,Integer> visits = new HashMap<>();
        String[] sequence = {"home","about","products","home","products","contact","home","blog","products","home","about"};

        for (String p : sequence) {
            visits.put(p, visits.getOrDefault(p, 0) + 1);
        }

        System.out.println("Visits map: " + visits);

        // Sort pages by descending visit count
        List<Map.Entry<String,Integer>> sorted = visits.entrySet().stream()
            .sorted((a,b) -> b.getValue().compareTo(a.getValue()))
            .collect(Collectors.toList());

        System.out.println("\nPages sorted by visits (desc):");
        sorted.forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));

        // Page with most visits
        if (!sorted.isEmpty()) {
            System.out.println("\nMost visited page: " + sorted.get(0).getKey());
        }
    }
}
