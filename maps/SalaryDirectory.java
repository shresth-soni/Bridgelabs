import java.util.*;
import java.util.stream.Collectors;

public class SalaryDirectory {
    public static void main(String[] args) {
        Map<String, Double> salary = new HashMap<>();
        salary.put("Alice", 70000.0);
        salary.put("Bob", 85000.0);
        salary.put("Carol", 90000.0);
        salary.put("Dave", 60000.0);
        salary.put("Eve", 90000.0);
        salary.put("Frank", 50000.0);

        // Give raises: Alice +10%, Frank +20%
        salary.computeIfPresent("Alice", (k,v) -> v * 1.10);
        salary.computeIfPresent("Frank", (k,v) -> v * 1.20);

        // Average salary
        double avg = salary.values().stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
        System.out.println("Average salary: " + avg);

        // Find highest salary
        double maxSalary = salary.values().stream().mapToDouble(Double::doubleValue).max().orElse(0.0);
        System.out.println("Highest salary: " + maxSalary);

        // Names of highest-paid employee(s)
        List<String> top = salary.entrySet().stream()
            .filter(e -> e.getValue() == maxSalary)
            .map(Map.Entry::getKey)
            .collect(Collectors.toList());

        System.out.println("Top earner(s): " + top);
    }
}
