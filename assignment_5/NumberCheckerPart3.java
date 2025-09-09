public class NumberCheckerPart3 {

    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++)
            if (number % i == 0) return false;
        return true;
    }

    public static boolean isNeon(int number) {
        int sq = number * number;
        int sum = 0;
        for (int d : NumberChecker.getDigits(sq)) sum += d;
        return sum == number;
    }

    public static boolean isSpy(int number) {
        int[] digits = NumberChecker.getDigits(number);
        int sum = 0, prod = 1;
        for (int d : digits) {
            sum += d;
            prod *= d;
        }
        return sum == prod;
    }

    public static boolean isAutomorphic(int number) {
        int sq = number * number;
        String strNum = String.valueOf(number);
        String strSq = String.valueOf(sq);
        return strSq.endsWith(strNum);
    }

    public static boolean isBuzz(int number) {
        return number % 7 == 0 || number % 10 == 7;
    }
}
