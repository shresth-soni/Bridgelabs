import java.util.Scanner;

public class qq10 {
    public static void main(String[] args) {
        double height;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your height in centimeters: ");
        height = input.nextDouble();
        
        double totalInches = height / 2.54;
        int feet = (int) (totalInches / 12);
        double inches = totalInches % 12;
        
        System.out.println("Your Height in cm is " + height + " while in feet is " + feet + " and inches is " + inches);
        
        input.close();
    }
}
