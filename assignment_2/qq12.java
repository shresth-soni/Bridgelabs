import java.util.Scanner;

public class qq12 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter base of the triangle (in inches): ");
	double base = sc.nextDouble();
	System.out.print("Enter height of the triangle (in inches): ");
	double height = sc.nextDouble();

	double areaInches = 0.5 * base * height;
	double areaCm = areaInches * 6.4516;

	double heightCm = height * 2.54;
	double heightFeet = height / 12.0;
	int feetPart = (int) heightFeet;
	double inchesPart = height - (feetPart * 12);

	System.out.printf("Area of triangle: %.2f square inches\n", areaInches);
	System.out.printf("Area of triangle: %.2f square centimeters\n", areaCm);
	System.out.printf("Your Height in cm is %.2f while in feet is %d and inches is %.2f\n", heightCm, feetPart, inchesPart);
	sc.close();
	}
}

