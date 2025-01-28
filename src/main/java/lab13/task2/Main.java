package lab13.task2;

public class Main {
    public static void main(String[] args) {
        Payment payment =  PaymentFactory.createPayment("Paypal");
        if(payment instanceof CreditCardPayment) {
            CreditCardPayment creditCardPayment = (CreditCardPayment) payment;
            creditCardPayment.processPayment();
        }
        if(payment instanceof PaypalPayment){
            PaypalPayment paypalPayment = (PaypalPayment) payment;
            paypalPayment.processPayment();
        }
    }
}
