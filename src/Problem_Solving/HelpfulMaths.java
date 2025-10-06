package Problem_Solving;

import java.util.Arrays;
import java.util.Scanner;

public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        char[] arr = new char[n - (n/2)];
        for(int i=0, j=0; i<s.length(); i+=2, j++){
            arr[j] = s.charAt(i);
        }
//        for(char ele : arr){
//            System.out.print(ele+" ");
//        }
        Arrays.sort(arr);
//        System.out.println();
//        for(char ele : arr){
//            System.out.print(ele+" ");
//        }
        for(int i=0, j=0; i<s.length(); i++){
            if(i%2!=0) System.out.print("+");
            else System.out.print(arr[j++]);
        }
    }
}
