package Lab24_07;

class Payment {
    void pay() {
        System.out.println("Payment method selected");
    }
}

class CreditCard extends Payment {
    void pay() {
        System.out.println("Payment done using Credit Card");
    }
}

class UPI extends Payment {
    void pay() {
        System.out.println("Payment done using UPI");
    }
}

class NetBanking extends Payment {
    void pay() {
        System.out.println("Payment done using Net Banking");
    }
}

public class Payments {
    public static void main(String[] args) {
        Payment p1 = new CreditCard();
        Payment p2 = new UPI();
        Payment p3 = new NetBanking();

        p1.pay();
        p2.pay();
        p3.pay();
    }
}
