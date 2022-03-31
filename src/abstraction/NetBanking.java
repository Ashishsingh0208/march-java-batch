package abstraction;

public class NetBanking implements Payment {
    @Override
    public void doPayment() {
        System.out.println("Please use net banking for Payment");
    }
}
