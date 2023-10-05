package shopping;

public class DogcoinPaymentStrategy implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        // Implement Dogcoin payment logic
        System.out.println("Paid " + amount + " Dogcoin.");
    }
}

