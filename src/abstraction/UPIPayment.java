package abstraction;

public class UPIPayment implements Payment {
    @Override
    public void doPayment() {
        System.out.println("Please use UPI ID for payment");
    }


}
