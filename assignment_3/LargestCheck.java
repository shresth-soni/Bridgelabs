import java.util.Scanner;

public class LargestCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1, number2, number3;
        System.out.print("Enter three numbers: ");
        number1 = input.nextInt();
        number2 = input.nextInt();
        number3 = input.nextInt();
        System.out.println("Is the first number the largest? " + (number1 > number2 && number1 > number3));
        System.out.println("Is the second number the largest? " + (number2 > number1 && number2 > number3));
        System.out.println("Is the third number the largest? " + (number3 > number1 && number3 > number2));
        input.close();
    }
}
