import java.util.*;

public class CourseRegistration {
    public static void main(String[] args) {
        Map<String,Integer> courses = new HashMap<>();
        courses.put("CS101", 48);
        courses.put("CS102", 12);
        courses.put("CS201", 3);
        courses.put("CS202", 55);
        courses.put("CS301", 0);

        // Simulate adding/dropping students
        courses.put("CS101", Math.min(60, courses.get("CS101") + 3)); // add 3
        courses.put("CS201", Math.max(0, courses.get("CS201") - 2)); // drop 2

        // Print near full (>=50) and under-subscribed (<5)
        System.out.println("Near-full courses (>=50):");
        courses.forEach((k,v) -> { if (v >= 50) System.out.println(k + ": " + v); });

        System.out.println("\nUnder-subscribed courses (<5):");
        courses.forEach((k,v) -> { if (v < 5) System.out.println(k + ": " + v); });

        // Safe increment/decrement helper example
        // Add student to CS102
        courses.put("CS102", courses.getOrDefault("CS102",0) + 1);
        System.out.println("\nUpdated CS102: " + courses.get("CS102"));
    }
}
