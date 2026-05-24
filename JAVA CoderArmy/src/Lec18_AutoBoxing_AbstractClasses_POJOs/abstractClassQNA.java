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
// 1. Can't be initiated directly i.e. no objects of abstract class can be created. Ex: Animal a = new Animal();
// 2. Can contain abstract method (method without implementations)
// 3. Can also contain normal methods
// 4. Is meant to be extended
// 5. Constructor is allowed, but constructor isn't needed for object creation (cuz abstract classes can't have objects)
// rather it is needed for the super() call from the constructors of its inheritors
// 6. Static methods and vars allowed
// 7. Can have private methods, but cannot be abstract.
// 8. Can have no abstract method.
