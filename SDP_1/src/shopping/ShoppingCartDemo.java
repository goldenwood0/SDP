package shopping;

public class ShoppingCartDemo {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Product product1 = new Product("Dish", 100.0, 12);
        Product product2 = new Product("Table", 276.0, 5);

        cart.addProduct(product1);
        cart.addProduct(product2);

        PaymentStrategy creditCardPayment = new CreditCardPaymentStrategy();
        PaymentStrategy payPalPayment = new Cash$PaymentStrategy();

        // Checkout using credit card payment
        cart.checkout(creditCardPayment);

        // Checkout using PayPal payment
        cart.checkout(payPalPayment);

        PaymentStrategy bitcoinPayment = new DogcoinPaymentStrategy();
        cart.checkout(bitcoinPayment);
    }
}