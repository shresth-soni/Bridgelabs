import java.util.Scanner;

public class WordLengths2D {
    public static String[][] getWordsWithLengths(String str) {
        String[] words = SplitWords.splitWords(str);
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(words[i].length());
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = sc.nextLine();
        String[][] result = getWordsWithLengths(input);
        for (String[] row : result) {
            System.out.println(row[0] + " - " + row[1]);
        }
    }
}