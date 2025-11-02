package com.bridgelabz.oops.accessmodifiers;

class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    public void display() {
        System.out.println("Account: " + accountNumber + ", Holder: " + accountHolder + ", Balance: " + getBalance());
    }

    public static void main(String[] args) {
        SavingsAccount s1 = new SavingsAccount("1234", "Neer", 50000);
        s1.display();
    }
}
