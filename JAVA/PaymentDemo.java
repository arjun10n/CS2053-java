interface Payment {
    void processPayment(double amount);
}

class UPI implements Payment {
    public void processPayment(double amount) {
        System.out.println("Paid Rs." + amount + " via UPI.");
    }
}

class Wallet implements Payment {
    public void processPayment(double amount) {
        System.out.println("Paid Rs." + amount + " via Wallet.");
    }
}

class CreditCard implements Payment {
    public void processPayment(double amount) {
        System.out.println("Paid Rs." + amount + " using Credit Card.");
    }
}

public class PaymentDemo {
    public static void main(String[] args) {
        Payment p1 = new UPI();
        Payment p2 = new Wallet();
        Payment p3 = new CreditCard();

        p1.processPayment(500);
        p2.processPayment(1000);
        p3.processPayment(2500);
    }
}
