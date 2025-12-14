package Class_11_Recursion;

import java.util.Scanner;

public class aRaisedToThePowerB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println(pow(a,b));
    }
    public static int pow(int a, int b){
        //T.C: O(logb)
        if(b==0) return 1;

        int ans = pow(a,b/2); //calling func two times is redundant
        if(b%2==0) return ans*ans;
        else return a*ans*ans;
    }
//    public static int pow(int a, int b){
//        // T.C: O(b)
//        if(b==0) return 1;
//        return a*pow(a,b-1);
//    }
}
