import java.util.Scanner;

public class CountdownFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter;
        System.out.print("Enter countdown start: ");
        counter = input.nextInt();
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }
        input.close();
    }
}
