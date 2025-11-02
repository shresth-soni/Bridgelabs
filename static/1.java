class BankAccount {
    private static String bankName = "State Bank of India";
    private static int totalAccounts = 0;
    private final int accountNumber;
    private String accountHolderName;
    private double balance;

    BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        totalAccounts++;
    }

    static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    void displayDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank: " + bankName);
            System.out.println("Account Holder: " + this.accountHolderName);
            System.out.println("Account Number: " + this.accountNumber);
            System.out.println("Balance: ₹" + this.balance);
        }
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(101, "Neer", 5000);
        BankAccount acc2 = new BankAccount(102, "Shresth", 8000);

        acc1.displayDetails();
        acc2.displayDetails();

        BankAccount.getTotalAccounts();
    }
}
