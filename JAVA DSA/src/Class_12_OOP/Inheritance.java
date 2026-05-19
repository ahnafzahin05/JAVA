package Class_12_OOP;

class Vehicle{
    int wheels;
    int maxSpeed;
}

class MotorVehicle extends Vehicle{
    int Engine;
}

class AirCrafts extends Vehicle{
    int wings;
}

public class Inheritance {
    public static void main(String[] args) {
        AirCrafts J7 = new AirCrafts();
        J7.maxSpeed = 500;
        J7.wheels = 6;
        J7.wings = 2;
    }
}
