import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0, number;
        System.out.print("Enter a number (0 to stop): ");
        number = input.nextDouble();
        while (number != 0) {
            total += number;
            System.out.print("Enter a number (0 to stop): ");
            number = input.nextDouble();
        }
        System.out.println("Total = " + total);
        input.close();
    }
}
