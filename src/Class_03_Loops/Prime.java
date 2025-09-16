package Class_03_Loops;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //Method 1
//        int count=0;
//        for(int i=1; i<=n; i++){
//            if(n%i==0) count++;
//            if(count>2) break;
//        }
//        if(count==2 && n>1) System.out.println("Prime");
//        else System.out.println("Composite");
        //Method 2
        boolean flag = true; //true for prime
        for(int i=2; i<=Math.sqrt(n); i++)
        {
            if(n%i==0)
            {
                System.out.println("Composite");
                flag = false;
                break;
            }
        }
        if(flag) System.out.println("Prime");
    }
}
