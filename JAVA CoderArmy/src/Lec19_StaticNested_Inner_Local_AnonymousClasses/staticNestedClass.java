package Lec19_StaticNested_Inner_Local_AnonymousClasses;

public class staticNestedClass {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer.Inner();
        inner.fun();
    }
}

// reasons/importance of nested class:
// 1. Logical grouping 2. Better access to outer class
class Outer{
    static int x = 10;
    int y = 20;
    private static String s = "Can easily access private";

    static class Inner{
        Outer out;
        static int var;
        static void hi(){

        }
        private static int n;
        private String name;

        void fun(){
            System.out.println("Inner Fun");
            System.out.println(s);
            System.out.println(x); //static can only access other static of its class..
            //System.out.println(y); Can't access non-static items from inside static
        }
    }
}
