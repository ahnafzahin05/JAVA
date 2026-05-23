package Lec17_Abstraction_Polymorphism_Interfaces;

public class staticMethodPolymorphism {
    public static void main(String[] args) {
        A a = new B();
        a.fun();
        //normally, the method in object type executes. But if the method is static, then the method of reference class is executed
        //that is, overriding isn't implemented for static method. cuz static belong to class and not to objects

        //static, private and final methods can never be overridden
        //fields and variables are not polymorphic. They refer to the reference type always.
    }
}

class A{
    static void fun(){
        System.out.println("FUN-A");
    }
}

class B extends A{
    static void fun(){
        System.out.println("FUN-B");
    }
}
