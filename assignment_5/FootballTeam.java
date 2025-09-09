import java.util.Random;

public class FootballTeam {

    // Method to calculate sum of array elements
    public static int sum(int[] arr) {
        int sum = 0;
        for (int height : arr) {
            sum += height;
        }
        return sum;
    }

    // Method to calculate mean
    public static double mean(int[] arr) {
        return (double) sum(arr) / arr.length;
    }

    // Method to find shortest height
    public static int shortest(int[] arr) {
        int min = arr[0];
        for (int h : arr) {
            if (h < min) min = h;
        }
        return min;
    }

    // Method to find tallest height
    public static int tallest(int[] arr) {
        int max = arr[0];
        for (int h : arr) {
            if (h > max) max = h;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] heights = new int[11];
        Random rand = new Random();

        // Generate random heights between 150 to 250 cm
        for (int i = 0; i < heights.length; i++) {
            heights[i] = rand.nextInt(101) + 150; // 150 to 250
        }

        System.out.println("Heights of players:");
        for (int h : heights) {
            System.out.print(h + " ");
        }
        System.out.println();

        System.out.println("Shortest height: " + shortest(heights));
        System.out.println("Tallest height: " + tallest(heights));
        System.out.println("Mean height: " + mean(heights));
    }
}
