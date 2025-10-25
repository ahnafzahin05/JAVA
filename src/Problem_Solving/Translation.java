package Problem_Solving;

import java.util.Scanner;

public class Translation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.next();

        //Method 1 (312 ms, 1200 KB)
        String ans = "";
        for(int i=0; i<a.length(); i++){
            ans = a.charAt(i) + ans;
        }
        if(b.equals(ans)) System.out.println("YES");
        else System.out.println("NO");

        //Method 2 (312 ms, 1900 KB)
//        char[] arr = a.toCharArray();
//        int i=0, j=a.length()-1;
//        while(i<j){
//            char temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//            i++; j--;
//        }
//        String ans = new String(arr);
//        if(b.equals(ans)) System.out.println("YES");
//        else System.out.println("NO");
    }
}
