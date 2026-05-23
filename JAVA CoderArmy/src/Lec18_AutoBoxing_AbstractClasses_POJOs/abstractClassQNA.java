package Lec18_AutoBoxing_AbstractClasses_POJOs;

public class abstractClassQNA {
    public static void main(String[] args) {
        Animal d = new Dog();
        d.makeSound();
        d.sleep();
    }
}

abstract class Animal{
    abstract void makeSound();

    void sleep(){
        System.out.println("Every animal sleeps");
    }
}

class Dog extends Animal{
    @Override
    void makeSound() {
        System.out.println("GHEW GHEW");
    }
}

// Abstract classes
// 1. Can't be initiated directly
// 2. Can contain abstract method (method without implementations)
// 3. Can also contain normal methods
// 4. Is meant to be extended
