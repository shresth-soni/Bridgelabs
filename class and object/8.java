package com.bridgelabz.oops.leveltwo;

class PalindromeChecker {
    String text;

    public PalindromeChecker(String text) {
        this.text = text;
    }

    public boolean isPalindrome() {
        String reversed = new StringBuilder(text).reverse().toString();
        return text.equalsIgnoreCase(reversed);
    }

    public void displayResult() {
        if (isPalindrome())
            System.out.println(text + " is a Palindrome.");
        else
            System.out.println(text + " is not a Palindrome.");
    }

    public static void main(String[] args) {
        PalindromeChecker p1 = new PalindromeChecker("madam");
        p1.displayResult();
    }
}
