class ShoppingCart {
    void cartInfo() {
        System.out.println("This is a Shopping Cart.");
    }
}

class Payment extends ShoppingCart {
    void paymentInfo() {
        System.out.println("Payment methods are available.");
    }
}

class UPI extends Payment {
    void upiPayment() {
        System.out.println("Payment done via UPI.");
    }
}

class CreditCard extends Payment {
    void creditCardPayment() {
        System.out.println("Payment done via Credit Card.");
    }
}

public class Shopping {
    public static void main(String[] args) {
        UPI upi = new UPI();
        CreditCard cc = new CreditCard();

        upi.cartInfo();
        upi.paymentInfo();
        upi.upiPayment();
        System.out.println("-----------------");
        cc.cartInfo();
        cc.paymentInfo();
        cc.creditCardPayment();
    }
}
