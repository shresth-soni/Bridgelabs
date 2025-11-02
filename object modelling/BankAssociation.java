class Customer {
    String name;
    double balance;

    Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    void viewBalance() {
        System.out.println(name + "'s balance: " + balance);
    }
}

class Bank {
    String name;

    Bank(String name) {
        this.name = name;
    }

    void openAccount(Customer c) {
        System.out.println("Account opened for " + c.name + " at " + name);
    }
}

public class BankAssociation {
    public static void main(String[] args) {
        Bank bank = new Bank("State Bank of India");
        Customer c1 = new Customer("Amit", 5000);
        Customer c2 = new Customer("Neha", 8000);

        bank.openAccount(c1);
        bank.openAccount(c2);

        c1.viewBalance();
        c2.viewBalance();
    }
}
