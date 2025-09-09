import java.util.Random;

public class RandomVoting {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] ages = new int[20];
        System.out.println("Student\tAge\tCan Vote");
        for (int i = 0; i < 20; i++) {
            ages[i] = rand.nextInt(90) + 10;
            System.out.println((i + 1) + "\t" + ages[i] + "\t" + (ages[i] >= 18 ? "Yes" : "No"));
        }
    }
}