import java.util.ArrayList;
import java.util.Collections;

public class WrapperInCollections {
    public static void main(String[] args) {
        double[] prices = {10.5, 20.0, 35.75, 5.5};
        ArrayList<Double> list = new ArrayList<>();

        for (double p : prices)
            list.add(p); // Auto-boxing

        double sum = 0;
        for (double price : list)
            sum += price;

        double avg = sum / list.size();
        System.out.println("Highest Price: " + Collections.max(list));
        System.out.println("Average Price: " + avg);
    }
}
