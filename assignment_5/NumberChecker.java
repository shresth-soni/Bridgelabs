import java.util.Scanner;

public class NumberChecker {

    public static boolean isPositive(int num) {
        return num >= 0;
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static int compare(int n1, int n2) {
        if (n1 > n2) return 1;
        else if (n1 == n2) return 0;
        else return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];

        for (int i = 0; i < nums.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            nums[i] = sc.nextInt();

            if (isPositive(nums[i])) {
                if (isEven(nums[i])) {
                    System.out.println(nums[i] + " is Positive & Even");
                } else {
                    System.out.println(nums[i] + " is Positive & Odd");
                }
            } else {
                System.out.println(nums[i] + " is Negative");
            }
        }

        int result = compare(nums[0], nums[nums.length - 1]);
        if (result == 0) {
            System.out.println("First and Last numbers are Equal");
        } else if (result == 1) {
            System.out.println("First number is Greater than Last");
        } else {
            System.out.println("First number is Less than Last");
        }
    }

        // Returns the digits of a number in order (e.g., 123 -> [1, 2, 3])
        public static int[] getDigits(int number) {
            String numStr = Integer.toString(Math.abs(number));
            int[] digits = new int[numStr.length()];
            for (int i = 0; i < numStr.length(); i++) {
                digits[i] = numStr.charAt(i) - '0';
            }
            return digits;
        }
}
