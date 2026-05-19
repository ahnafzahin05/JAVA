package Class_11_Recursion;

import java.util.Scanner;

public class ReverseOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(reverse(num,0));
        //System.out.println(manualRev(num));
    }

    private static int reverse(int num, int ans) {
        if(num==0) return ans;
        return reverse(num/10, ans*10 + num%10); //first pass ei reversed digit ta create hoye jacche method er moddhe
        //argument pass korayei
    }

//    public static int manualRev(int num){
//        int ans = 0;
//        while(num!=0){
//            ans = ans*10 + num%10;
//            num = num/10;
//        }
//        return ans;
//    }
}
