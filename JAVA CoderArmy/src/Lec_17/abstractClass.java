package Lec_17;

public class abstractClass {
    public static void main(String[] args) {
        Car ec = new ElectricCar();
        ec.start();
        ec.accelerate();
        ec.brake();
    }
}

abstract class Car{
    void start(){
        System.out.println("Car started!");
    }

    abstract void accelerate();
    abstract void brake();
}

class ElectricCar extends Car{
    @Override
    void accelerate() {
        System.out.println("Accelerates at 30 km/h");
    }

    @Override
    void brake() {
        System.out.println("Breaks very fast");
    }
}
