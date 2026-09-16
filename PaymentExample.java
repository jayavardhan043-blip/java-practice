class Payment {

    void pay() {
        System.out.println("Making payment");
    }
}

class UPI extends Payment {

    @Override
    void pay() {
        System.out.println("Payment through UPI");
    }
}

class CreditCard extends Payment {

    @Override
    void pay() {
        System.out.println("Payment through Credit Card");
    }
}

class Cash extends Payment {

    @Override
    void pay() {
        System.out.println("Payment through Cash");
    }
}

public class PaymentExample {

    public static void main(String[] args) {

        Payment payment1 = new UPI();
        Payment payment2 = new CreditCard();
        Payment payment3 = new Cash();

        payment1.pay();
        payment2.pay();
        payment3.pay();
    }
}