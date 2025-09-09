import java.util.Scanner;

public class VowelConsonantType {
    public static String getType(char ch) {
        ch = Character.toLowerCase(ch);
        if (!Character.isLetter(ch)) return "Not a Letter";
        return "aeiou".indexOf(ch) != -1 ? "Vowel" : "Consonant";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            System.out.println(ch + " - " + getType(ch));
        }
    }
}