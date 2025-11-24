// PatientIdPrinter.java
import java.util.*;

public class PatientIdPrinter {
    public static void main(String[] args) {
        List<String> patientIds = Arrays.asList("P1001", "P1002", "P1003", "P1004");

        // Using method reference to print each ID
        System.out.println("Patient IDs:");
        patientIds.forEach(System.out::println);
    }
}
