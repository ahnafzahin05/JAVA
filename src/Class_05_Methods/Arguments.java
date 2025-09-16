package Class_05_Methods;

import java.util.Scanner;

public class Arguments {
//    public static void max(int a, int b, int c){ //parameters
//        if(a>b){
//            if(a>c) System.out.println(a);
//            else System.out.println(c);
//        }
//        else{
//            if(b>c) System.out.println(b);
//            else System.out.println(c);
//        }
//    }
    public static int max(int a, int b, int c){ //parameters
        if(a>b){
            if(a>c) return a; //passes value, i.e. int max is a value or type of a variable
            else return c;
        }
        else{
            if(b>c) return b;
            else return c;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        //max(x,y,z); //for void function
        System.out.println(max(x,y,z)); //for int func
    }
}
