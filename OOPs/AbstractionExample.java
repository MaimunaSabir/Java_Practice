abstract class ATM {

    abstract void withdraw();

    void showMessage() {
        System.out.println("Welcome to ATM");
    }
}

class HBLATM extends ATM {

    @Override
    void withdraw() {
        System.out.println("Money Withdrawn Successfully");
    }
}

public class Main {
    public static void main(String[] args) {

        ATM a = new HBLATM();

        a.showMessage();
        a.withdraw();
    }
}