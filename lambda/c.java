// NotificationFilter.java
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Alert {
    String type; // e.g., "critical", "info", "reminder"
    String message;
    Alert(String t, String m) { type = t; message = m; }
    @Override public String toString() { return "[" + type + "] " + message; }
}

public class NotificationFilter {
    public static void main(String[] args) {
        List<Alert> allAlerts = Arrays.asList(
            new Alert("critical", "Patient A: low oxygen"),
            new Alert("info", "Routine check scheduled"),
            new Alert("reminder", "Medicine due for Patient B"),
            new Alert("critical", "Patient C: high fever")
        );

        // Suppose user wants only critical alerts
        Predicate<Alert> prefersCriticalOnly = alert -> "critical".equalsIgnoreCase(alert.type);

        List<Alert> shown = allAlerts.stream()
                                     .filter(prefersCriticalOnly)
                                     .collect(Collectors.toList());

        System.out.println("Filtered alerts:");
        shown.forEach(System.out::println);
    }
}
