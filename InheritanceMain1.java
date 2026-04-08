class Vehicle{
    Vehicle(){
        System.out.println("Vehicle constructor");
    }
}

class Car extends Vehicle{
    Car(){
        System.out.println("Car constructor");
    }
}

class ElectricCar extends Car{
    ElectricCar(){
        System.out.println("ElectricCar constructor");
    }
}

class Bike extends Vehicle{
    Bike(){
        System.out.println("Bike constructor");
    }
}

public class InheritanceMain1{
    public static void main(String args[]){
        ElectricCar e = new ElectricCar();
        Bike b = new Bike();

        System.out.println(e instanceof Vehicle);
        System.out.println(e instanceof Car);
    }
}