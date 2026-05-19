package Class_05_Methods;

public class ReturnType {
    public static int zahin(){
        System.out.println("hello");
        return 5; //return means END, no code execution after return
        //return 0;
    }

    public static void main(String[] args) {
        zahin(); //stand alone call only (it has done it's work)
        System.out.println(zahin()); //it has done it's work + printNto1 it's value
        System.out.println(5+zahin()); //has done it's work + add 5 with it's value
    }
}
