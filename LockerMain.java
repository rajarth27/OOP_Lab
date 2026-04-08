class Locker{
    private int lockerId;
    private int pin;
    private double balance;

    Locker(int lockerId, int pin){
        this.lockerId = lockerId;
        setPin(pin);
    }

    public int getLockerId(){
        return lockerId;
    }

    public void setPin(int pin){
        if(pin >=1000 && pin <=9999){
            this.pin = pin;
        } else {
            System.out.println("Invalid pin");
        }
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        if(amount <= balance){
            balance -= amount;
        }
    }

    public double getBalance(){
        return balance;
    }
}

public class LockerMain{
    public static void main(String args[]){
        Locker l = new Locker(101,1234);
        l.deposit(500);
        l.withdraw(200);
        System.out.println(l.getBalance());
    }
}