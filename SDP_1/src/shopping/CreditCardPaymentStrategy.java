package shopping;

public class CreditCardPaymentStrategy implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        // Implement credit card payment logic
        System.out.println("Paid " + amount + " Credit Card.");
    }
}

