import java.util.Arrays;

public class NumberCheckerPart {

    public static int countDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }

    public static int[] getDigits(int number) {
        number = Math.abs(number);
        int[] digits = new int[countDigits(number)];
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    public static boolean isDuck(int number) {
        int[] digits = getDigits(number);
        for (int d : digits) if (d != 0) return true;
        return false;
    }

    public static boolean isArmstrong(int number) {
        int[] digits = getDigits(number);
        int sum = 0;
        for (int d : digits) sum += Math.pow(d, digits.length);
        return sum == number;
    }

    public static int[] largestTwo(int number) {
        int[] digits = getDigits(number);
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        for (int d : digits) {
            if (d > max1) {
                max2 = max1;
                max1 = d;
            } else if (d > max2) max2 = d;
        }
        return new int[]{max1, max2};
    }

    public static int[] smallestTwo(int number) {
        int[] digits = getDigits(number);
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for (int d : digits) {
            if (d < min1) {
                min2 = min1;
                min1 = d;
            } else if (d < min2) min2 = d;
        }
        return new int[]{min1, min2};
    }
}
