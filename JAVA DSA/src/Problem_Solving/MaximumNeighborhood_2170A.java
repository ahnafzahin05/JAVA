package Problem_Solving;

import java.util.Scanner;

public class MaximumNeighborhood_2170A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int max = 0;
            if(n==1) System.out.println("1");
            else if(n==2) System.out.println("9");
            else if(n==3) System.out.println("29");
            else if(n==4) System.out.println("56");
            else{
                max = (n*n -1) + (n*(n-1)) + (n*(n-1)-2) + (n*(n-2)-1) + (n*(n-1)-1);
                System.out.println(max);
            }
        }
    }
}
