package abstraction;

public class CardPayment implements Payment {
    @Override
    public void doPayment() {
        System.out.println("Please use CARD number for Payment..");
    }
}
