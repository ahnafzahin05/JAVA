package Problem_Solving;

import java.util.Arrays;
import java.util.Scanner;

public class Football_43A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for(int i=0; i<n; i++){
            s[i] = sc.next();
        }
        Arrays.sort(s);

        int[] freq = new int[n];
        int i=0, j=0;
        while(i<s.length-1){
            if(s[i].equals(s[i+1])) freq[j]++;
            else j++;
            i++;
        }

        int max=-1, maxIdx = -1;
        for(int k=0; k<n; k++){
            if(freq[k]>max){
                max = freq[k];
                maxIdx = k;
            }
        }
        int stringIdx = 0;
        for(int k=0; k<maxIdx; k++){
            stringIdx+=freq[k]+1;
        }
        System.out.println(s[stringIdx]);
    }
}
