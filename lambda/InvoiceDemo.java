// InvoiceDemo.java
import java.util.*;
import java.util.stream.Collectors;

class Invoice {
    String transactionId;
    Invoice(String transactionId) { this.transactionId = transactionId; }
    @Override public String toString() { return "Invoice{" + transactionId + "}"; }
}

public class InvoiceDemo {
    public static void main(String[] args) {
        List<String> txIds = Arrays.asList("TX100", "TX101", "TX102");

        // Constructor reference: create Invoice objects from transaction IDs
        List<Invoice> invoices = txIds.stream()
                                      .map(Invoice::new)
                                      .collect(Collectors.toList());

        System.out.println("Generated invoices:");
        invoices.forEach(System.out::println);
    }
}
