import java.util.Random;

class OutOfStockException extends Exception {
    public OutOfStockException(String msg) { super(msg); }
}

class PaymentFailedException extends Exception {
    public PaymentFailedException(String msg) { super(msg); }
}

public class OnlineOrder {
    public static void placeOrder() throws OutOfStockException, PaymentFailedException {
        Random rand = new Random();
        int situation = rand.nextInt(2);
        if (situation == 0) throw new OutOfStockException("Product is out of stock!");
        else throw new PaymentFailedException("Payment failed! Try again.");
    }

    public static void main(String[] args) {
        try {
            placeOrder();
        } catch (OutOfStockException | PaymentFailedException e) {
            System.out.println(e.getMessage());
        }
    }
}
