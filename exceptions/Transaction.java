import java.util.Random;

class NegativeAmountException extends Exception { public NegativeAmountException(String m){super(m);} }
class InsufficientFundsException2 extends Exception { public InsufficientFundsException2(String m){super(m);} }
class NetworkFailureException extends Exception { public NetworkFailureException(String m){super(m);} }

public class Transaction {
    public static void performTransaction() throws NegativeAmountException, InsufficientFundsException2, NetworkFailureException {
        Random r = new Random();
        int n = r.nextInt(3);
        if (n == 0) throw new NegativeAmountException("Error: Negative amount not allowed!");
        else if (n == 1) throw new InsufficientFundsException2("Error: Insufficient funds!");
        else throw new NetworkFailureException("Error: Network failure, try again!");
    }

    public static void main(String[] args) {
        try {
            performTransaction();
        } catch (NegativeAmountException e) {
            System.out.println(e.getMessage());
        } catch (InsufficientFundsException2 e) {
            System.out.println(e.getMessage());
        } catch (NetworkFailureException e) {
            System.out.println(e.getMessage());
        }
    }
}
