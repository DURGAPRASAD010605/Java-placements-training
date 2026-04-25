interface PaymentProcessor{
    void processPayment(double amount);
}

class CreditCardProcessor implements PaymentProcessor{
    public void processPayment(double amount){
        System.out.println("processing credit card payment "+ amount);
    }
}

class PaypalProcessor implements PaymentProcessor{
    public void processPayment(double amount){
        System.out.println("processing PayPal payment "+ amount);
    }
}

class ShoppingCart{
    private PaymentProcessor paymentProcessor;

    public ShoppingCart(PaymentProcessor paymentProcessor){
        this.paymentProcessor = paymentProcessor;
    }

    public void checkout(double amount){
        paymentProcessor.processPayment(amount);
    }
}

class xyz extends CreditCardProcessor{
    int amount;

    public xyz(double amount){
        this.amount = (int)amount;
        processPayment(amount);
    }
}

public class Main{
    public static void main(String [] args){
        PaymentProcessor processor = new CreditCardProcessor();
        xyz ob = new xyz(10000);
    }
}