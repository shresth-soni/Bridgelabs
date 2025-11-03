interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}

abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public String getAccountNumber() { return accountNumber; }
    public String getHolderName() { return holderName; }
    public double getBalance() { return balance; }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) balance -= amount;
        else System.out.println("Insufficient balance!");
    }

    public abstract double calculateInterest();
}

class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(String acc, String name, double bal) {
        super(acc, name, bal);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.04;
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Loan of " + amount + " applied for Savings Account.");
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() > 10000;
    }
}

class CurrentAccount extends BankAccount implements Loanable {
    public CurrentAccount(String acc, String name, double bal) {
        super(acc, name, bal);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.02;
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Loan of " + amount + " applied for Current Account.");
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() > 50000;
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        BankAccount[] accounts = {
            new SavingsAccount("S101", "Neha", 20000),
            new CurrentAccount("C202", "Raj", 80000)
        };

        for (BankAccount acc : accounts) {
            System.out.println("Account: " + acc.getHolderName());
            System.out.println("Interest: " + acc.calculateInterest());
            ((Loanable) acc).applyForLoan(30000);
            System.out.println("Eligible: " + ((Loanable) acc).calculateLoanEligibility());
            System.out.println("-----------------------");
        }
    }
}
