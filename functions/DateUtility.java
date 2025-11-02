import java.text.SimpleDateFormat;
import java.util.Date;

interface DateFormatter {
    static String formatDate(String pattern) {
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.format(new Date());
    }
}

public class DateUtility {
    public static void main(String[] args) {
        System.out.println(DateFormatter.formatDate("dd/MM/yyyy"));
        System.out.println(DateFormatter.formatDate("EEEE, MMM dd yyyy"));
    }
}
