interface Payment {
    void processPayment(double amount);

    default void printReceipt(double amount) {
        System.out.println("Receipt: Payment of " + amount + "/-  completed.");
    }
}

class CreditCardPayment implements Payment {
    public void processPayment(double amount) {
        System.out.println("Processing Credit Card Payment of " + amount+"/-");
        printReceipt(amount);
    }
}

class UPIPayment implements Payment {
    public void processPayment(double amount) {
        System.out.println("Processing UPI Payment of " + amount+"/-");
        printReceipt(amount);
    }
}

public class Pay {
    public static void main(String[] args) {
        Payment credit = new CreditCardPayment();
        credit.processPayment(5000);

        Payment upi = new UPIPayment();
        upi.processPayment(1500);
    }
}
