package Lec17_Abstraction_Polymorphism_Interfaces;

public class interfacePractice {
    public static void main(String[] args) {
        //vehicle v = new vehicle(); //Interfaces cannot be initialised
        vehicle ec = new electricCar();
        ec.accelerate();
    }
}

interface vehicle{
    void start();
    void accelerate();
    void brake();
}

class electricCar implements vehicle{
    //methods in interfaces are by default public, so we can't change any methods visibility while overriding
    @Override
    public void start(){

    }

    @Override
    public void accelerate(){
        System.out.println("Accelerating....");
    }

    @Override
    public void brake(){

    }
}


