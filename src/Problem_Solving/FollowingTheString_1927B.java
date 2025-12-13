package Problem_Solving;

import java.util.Scanner;

public class FollowingTheString_1927B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            int zeroCount = 0;
            for(int i=0; i<n; i++) {
                arr[i] = sc.nextInt();
                if(arr[i]==0) zeroCount++;
            }
            int[] freq = new int[zeroCount];
            StringBuilder ans = new StringBuilder();
            for(int i=0; i<n; i++){
                for(int j=0; j<zeroCount; j++){
                    if(freq[j]==arr[i]){
                        ans.append((char)('a'+j));
                        freq[j]++;
                        break;
                    }
                }
            }
            System.out.println(ans);
        }
    }
}
