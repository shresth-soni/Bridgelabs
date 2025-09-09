import java.util.Scanner;

public class QuadraticSolver {

    public static double[] findRoots(double a, double b, double c) {
        double delta = b * b - 4 * a * c;

        if (delta < 0) return new double[0];
        else if (delta == 0) return new double[]{-b / (2 * a)};
        else {
            double sqrtDelta = Math.sqrt(delta);
            return new double[]{
                (-b + sqrtDelta) / (2 * a),
                (-b - sqrtDelta) / (2 * a)
            };
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        System.out.print("Enter b: ");
        double b = sc.nextDouble();
        System.out.print("Enter c: ");
        double c = sc.nextDouble();

        double[] roots = findRoots(a, b, c);

        if (roots.length == 0) {
            System.out.println("No Real Roots");
        } else if (roots.length == 1) {
            System.out.println("One Root: " + roots[0]);
        } else {
            System.out.println("Root 1: " + roots[0]);
            System.out.println("Root 2: " + roots[1]);
        }
    }
}
