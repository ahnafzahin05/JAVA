package Class_01_Basics;

public class IncreDecre {
    public static void main(String[] args) {
        int x = 10;
        int y = x++; //first assign then increase
        System.out.println(x+" "+y);
        int a = 5;
        int b = ++a; //first increase then assign
        System.out.println(a+" "+b);
    }
}
