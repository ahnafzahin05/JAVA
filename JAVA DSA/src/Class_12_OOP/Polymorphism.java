package Class_12_OOP;

public class Polymorphism {
    public static class Dog{
        void speak(){
            System.out.println("Ghew Ghew");
        }
    }

    public static class Human{
        void speak(){
            System.out.println("Hello");
        }
    }

    public static class Cat{
        void speak(){
            System.out.println("Meww Meww");
        }
    }

    public static void main(String[] args) {
        Dog tommy = new Dog();
        Human zahin = new Human();
        Cat puchu = new Cat();

        tommy.speak();
        zahin.speak();
        puchu.speak();
    }
}
