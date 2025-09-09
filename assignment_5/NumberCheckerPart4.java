public class NumberCheckerPart4 {

    public static int sumOfProperDivisors(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) sum += i;
        }
        return sum;
    }

    public static boolean isPerfect(int number) {
        return sumOfProperDivisors(number) == number;
    }

    public static boolean isAbundant(int number) {
        return sumOfProperDivisors(number) > number;
    }

    public static boolean isDeficient(int number) {
        return sumOfProperDivisors(number) < number;
    }

    public static boolean isStrong(int number) {
        int sum = 0;
        for (int d : NumberChecker.getDigits(number)) {
            int fact = 1;
            for (int i = 1; i <= d; i++) fact *= i;
            sum += fact;
        }
        return sum == number;
    }
}
