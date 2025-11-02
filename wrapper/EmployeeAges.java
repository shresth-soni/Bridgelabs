import java.util.ArrayList;
import java.util.Collections;

public class EmployeeAges {
    public static void main(String[] args) {
        int[] ages = {25, 30, 45, 22, 38};
        ArrayList<Integer> ageList = new ArrayList<>();

        for (int age : ages)
            ageList.add(age); // Auto-boxing

        System.out.println("Youngest: " + Collections.min(ageList));
        System.out.println("Oldest: " + Collections.max(ageList));
    }
}
