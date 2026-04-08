interface Connectable{
    void connectWiFi();

    default void deviceStatus(){
        System.out.println("Device is active");
    }
}

interface Chargeable{
    void charge();
}

abstract class Device{
    abstract void powerOn();

    void powerOff(){
        System.out.println("Device powered off");
    }
}

class SmartPhone extends Device implements Connectable, Chargeable{
    void powerOn(){
        System.out.println("Smartphone powered on");
    }

    public void connectWiFi(){
        System.out.println("Smartphone connected to WiFi");
    }

    public void charge(){
        System.out.println("Smartphone charging");
    }
}

class Laptop extends Device implements Chargeable{
    void powerOn(){
        System.out.println("Laptop powered on");
    }

    public void charge(){
        System.out.println("Laptop charging");
    }
}

public class DeviceMain{
    public static void main(String args[]){
        SmartPhone s = new SmartPhone();
        s.powerOn();
        s.connectWiFi();
        s.charge();
        s.deviceStatus();
        s.powerOff();

        Laptop l = new Laptop();
        l.powerOn();
        l.charge();
        l.powerOff();
    }
}