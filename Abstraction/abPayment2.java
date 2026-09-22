abstract class Payment {
    abstract void pay(double amount);

    void printReceipt() {
        System.out.println("Generating payment receipt...");
    }
}

class CreditCardPayment extends Payment {
    @Override
    void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}

public class Payment2 {
    public static void main(String[] args) {
        Payment p = new CreditCardPayment();
        p.pay(2500);
        p.printReceipt();
        System.out.println("Transaction completed successfully.");
    }
}
