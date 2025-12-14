package Class_11_Recursion;

public class FunctionCallingItself {
    public static void main(String[] args) {
        zahin(1);
    }
    public static void zahin(int n){
        if(n==10) return; //just return completely breaks the function.. khatam tata good bye
        System.out.println("MD AHNAF ZAHIN");
        zahin(n+1);
    }
}
