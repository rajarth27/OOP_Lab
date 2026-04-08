interface OnlinePayment{
    void payOnline();

    default void generateReceipt(){
        System.out.println("Receipt generated");
    }

    static void paymentInfo(){
        System.out.println("Online payment interface");
    }
}

interface OfflinePayment{
    void payOffline();
}

abstract class Payment{
    abstract void processPayment();

    void validateUser(){
        System.out.println("User validated");
    }
}

class UPIPayment extends Payment implements OnlinePayment{
    public void payOnline(){
        System.out.println("Payment done using UPI");
    }

    void processPayment(){
        System.out.println("Processing UPI payment");
    }
}

class CashPayment extends Payment implements OfflinePayment{
    public void payOffline(){
        System.out.println("Payment done using cash");
    }

    void processPayment(){
        System.out.println("Processing cash payment");
    }
}

public class PaymentMain{
    public static void main(String args[]){
        UPIPayment u = new UPIPayment();
        u.validateUser();
        u.processPayment();
        u.payOnline();
        u.generateReceipt();

        OnlinePayment.paymentInfo();

        CashPayment c = new CashPayment();
        c.validateUser();
        c.processPayment();
        c.payOffline();
    }
}