import java.util.*;

public class AttendanceTracker {
    public static void main(String[] args) {
        String[] students = {"Alice","Bob","Carol","Dave","Eve"};
        Map<String, Integer> presentCount = new HashMap<>();
        for (String s : students) presentCount.put(s, 0);

        // Simulate 15 days; each day a random subset is present
        Random rnd = new Random(123);
        int days = 15;
        for (int d = 0; d < days; d++) {
            List<String> presentToday = new ArrayList<>();
            for (String s : students) if (rnd.nextBoolean()) presentToday.add(s);

            for (String s : presentToday) {
                presentCount.put(s, presentCount.get(s) + 1);
            }
        }

        System.out.println("Attendance counts after " + days + " days:");
        presentCount.forEach((k,v) -> System.out.println(k + ": " + v));

        int threshold = 10;
        System.out.println("\nStudents present fewer than " + threshold + " days:");
        presentCount.forEach((k,v) -> {
            if (v < threshold) System.out.println(k + " (" + v + ")");
        });
    }
}
