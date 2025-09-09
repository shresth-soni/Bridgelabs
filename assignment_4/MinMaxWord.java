import java.util.Scanner;

public class MinMaxWord {
    public static String[] findMinMax(String[][] wordsWithLengths) {
        String minWord = wordsWithLengths[0][0];
        String maxWord = wordsWithLengths[0][0];

        for (String[] pair : wordsWithLengths) {
            if (pair[0].length() < minWord.length()) minWord = pair[0];
            if (pair[0].length() > maxWord.length()) maxWord = pair[0];
        }

        return new String[]{minWord, maxWord};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = sc.nextLine();
        String[][] wordsWithLengths = WordLengths2D.getWordsWithLengths(input);
        String[] result = findMinMax(wordsWithLengths);
        System.out.println("Shortest Word: " + result[0]);
        System.out.println("Longest Word: " + result[1]);
    }
}