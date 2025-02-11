package payment;
import java.util.Random;
public class PaymentForm {
        public boolean processPayment(String cardNumber, double amount) {
            if (cardNumber == null || cardNumber.length() < 12 || amount <= 0) {
                System.out.println("Invalid payment details.");
                return false;
            }

            boolean success = new Random().nextBoolean();

            if (success) {
                System.out.println("Payment of $" + amount + " processed successfully using card " + maskCardNumber(cardNumber));
            } else {
                System.out.println("Payment failed. Please try again.");
            }

            return success;
        }

        private String maskCardNumber(String cardNumber) {
            return "**** **** **** " + cardNumber.substring(cardNumber.length() - 4);
        }

        public static void main(String[] args) {
            PaymentForm payment = new PaymentForm();
            payment.processPayment("1234567890123456", 100.50);
        }
    }

