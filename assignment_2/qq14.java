import java.util.Scanner;

public class qq14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = sc.nextDouble();
        
        double distanceInYards = distanceInFeet / 3.0;
        double distanceInMiles = distanceInYards / 1760.0;
        
        System.out.printf("Your distance in yards is %.2f while in miles is %.2f and in feet is %.2f\n", 
                         distanceInYards, distanceInMiles, distanceInFeet);
        sc.close();
    }
}
