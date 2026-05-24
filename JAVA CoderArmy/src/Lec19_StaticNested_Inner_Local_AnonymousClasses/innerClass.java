package Lec19_StaticNested_Inner_Local_AnonymousClasses;

public class innerClass {
    public static void main(String[] args) {
        outerClass outer = new outerClass();
        outerClass.Inner inner = outer.new Inner();

        //outerClass.Inner inner = new outerClass().new Inner();
        //this syntax can be used rather than those two lines above, but if we initialise inner class by this way
        //we'll have the reference of inner class only, there is no reference of the outer class
        //so we can't use outer class using this way
        inner.fun();

        //inner class/es is a member of any object of the outer class
        //so we've to first create an object of the outer class
        //and then to initialise the inner class of the outer object we do -  outerClass.Inner inner = outer.new Inner();

        //here's the difference with static nested class, static members doesn't require any object to function
        //but non-static member requires their object at first

        inner.hw();
        outerClass.Inner.hw();
    }
}

class outerClass{

    int x = 20;

    class Inner{
        int x = 10;

        //outerClass outerClass; This remains implicitly, i.e by default, it holds the reference of the object of the outerClass
        //so that we can use/access anything of outer class from inner class

        void fun(){
            System.out.println(x);
            System.out.println(outerClass.this.x);
        }

        static void hw(){
            System.out.println("Hello World from Inner Class");
        }

        //static members are allowed inside inner class in modern java
    }
}
