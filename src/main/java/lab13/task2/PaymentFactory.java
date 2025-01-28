package lab13.task2;

public class PaymentFactory {
    public static Payment createPayment(String paymentType) {
        if(paymentType==null || paymentType.equals("")) {
            return null;
        }
        if(paymentType.equals("CreditCard")) {
            return new CreditCardPayment();
        }
        if(paymentType.equals("Paypal")) {
            return new PaypalPayment();
        }
        throw new IllegalArgumentException("Unknown payment type " + paymentType);
    }
}
