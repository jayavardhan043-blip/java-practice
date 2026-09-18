abstract class Payment {

    abstract void pay(double amount);

    void paymentStarted() {
        System.out.println("Payment processing started");
    }
}

class UPI extends Payment {

    @Override
    void pay(double amount) {
        System.out.println("₹" + amount + " paid using UPI");
    }
}

class CreditCard extends Payment {

    @Override
    void pay(double amount) {
        System.out.println("₹" + amount + " paid using Credit Card");
    }
}

class Cash extends Payment {

    @Override
    void pay(double amount) {
        System.out.println("₹" + amount + " paid using Cash");
    }
}

public class PaymentAbstraction {

    public static void main(String[] args) {

        UPI upi = new UPI();

        upi.paymentStarted();
        upi.pay(500);

        System.out.println();

        CreditCard card = new CreditCard();

        card.paymentStarted();
        card.pay(1500);

        System.out.println();

        Cash cash = new Cash();

        cash.paymentStarted();
        cash.pay(300);
    }
}