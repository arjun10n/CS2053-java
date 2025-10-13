interface Payment {
    void processPayment(double amount);
}

interface UserLogin{
    void login();
}

class UPI implements Payment, UserLogin {
    public void processPayment(double amount) {
        System.out.println("Paid Rs." + amount + " via UPI.");
    }


public void login(){
    System.out.println ("UPI login with Credentials");
}
}

public class PaymentDemo1 {
    public static void main(String[] args) {
        UPI upi = new UPI();
        p1.login();           
        p1.processPayment(500);
    }
}