
import java.util.Scanner;

public class CustomTrim {
    public static String trimSpaces(String str) {
        int start = 0, end = str.length() - 1;
        while (start <= end && str.charAt(start) == ' ') start++;
        while (end >= start && str.charAt(end) == ' ') end--;
        String trimmed = "";
        for (int i = start; i <= end; i++) {
            trimmed += str.charAt(i);
        }
        return trimmed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string with spaces: ");
        String input = sc.nextLine();
        System.out.println("Custom Trimmed: '" + trimSpaces(input) + "'");
        System.out.println("Built-in Trimmed: '" + input.trim() + "'");
    }
}