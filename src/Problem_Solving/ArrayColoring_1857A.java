package Problem_Solving;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayColoring_1857A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            int tSum = 0;
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
                tSum+= arr[i];
            }
            if(n==2 && (arr[0]%2)==(arr[1]%2)) System.out.println("YES");
            else if(n==2 && (arr[0]%2)!=(arr[1]%2)) System.out.println("NO");
            else{
                Arrays.sort(arr);
                int pSum = arr[0];
                boolean possible = false;
                for(int i=1; i<n-1; i++){
                    if((pSum%2)==((tSum-pSum)%2)) {
                        possible = true;
                        break;
                    }
                    pSum+=arr[i];
                }
                if(possible) System.out.println("YES");
                else System.out.println("NO");
            }
            //Another optimal approach is to check the number of odd elements in the array, let it be numOfOdd
            //if numOfOdd is even --> sout(YES)
            //else sout(NO)
            //Because
            // 1)Even+Even = Even   2)Odd+Odd= Even   3)Even+Odd = Odd
            //so if there are even number of odd numbers, the summation of those numbers will be even, and the rest
            //even numbers summation is obviously even whether its count is odd or even
        }
    }
}
