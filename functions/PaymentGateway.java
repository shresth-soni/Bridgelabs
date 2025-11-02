interface PaymentProcessor {
    void processPayment(double amount);
    default void refund(double amount) {
        System.out.println("Refund of ₹" + amount + " processed.");
    }
}

class PayPal implements PaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("Paid ₹" + amount + " via PayPal.");
    }
}

public class PaymentGateway {
    public static void main(String[] args) {
        PaymentProcessor p = new PayPal();
        p.processPayment(500);
        p.refund(100);
    }
}
