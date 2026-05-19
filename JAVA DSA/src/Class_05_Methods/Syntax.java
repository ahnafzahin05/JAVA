package Class_05_Methods;

public class Syntax {
    public static void main(String[] args) {
        a();
    }
    public static void a(){
        System.out.println(1);
        b();
    }
    public static void b(){
        System.out.println(2);
        c();
    }
    public static void c(){
        System.out.println(3);
        a();
    }
}
