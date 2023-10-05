package shopping;

public class Cash$PaymentStrategy implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        // Implement PayPal payment logic
        System.out.println("Paid " + amount + " Cash$.");
    }
}
