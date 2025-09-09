import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];
        System.out.println("Enter ages of 10 students:");
        for (int i = 0; i < 10; i++) {
            ages[i] = sc.nextInt();
        }

        System.out.println("Student\tAge\tCan Vote");
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + "\t" + ages[i] + "\t" + (ages[i] >= 18 ? "Yes" : "No"));
        }
    }
}