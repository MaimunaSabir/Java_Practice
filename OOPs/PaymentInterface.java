interface Payment {

    void pay();
}

class CreditCard implements Payment {

    @Override
    public void pay() {
        System.out.println("Payment through Credit Card");
    }
}

class JazzCash implements Payment {

    @Override
    public void pay() {
        System.out.println("Payment through JazzCash");
    }
}

class EasyPaisa implements Payment {

    @Override
    public void pay() {
        System.out.println("Payment through EasyPaisa");
    }
}

public class Main {
    public static void main(String[] args) {

        Payment p;

        p = new CreditCard();
        p.pay();

        p = new JazzCash();
        p.pay();

        p = new EasyPaisa();
        p.pay();
    }
}