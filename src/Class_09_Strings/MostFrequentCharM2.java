package Class_09_Strings;

import java.util.Arrays;
import java.util.Scanner;

public class MostFrequentCharM2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        int i=0, j=1;
        int maxW = -1;
        char ans = '0';
        while(j<s.length()){
            if(arr[i] == arr[j]) j++;
            else{
                if(j-i>maxW) {
                    maxW = j-i;
                    ans = arr[i];
                }
                i = j++;
            }
        }
        if(j-i>maxW) {
            maxW = j-i;
            ans = arr[i];
        }
        System.out.println(ans);
    }
}
