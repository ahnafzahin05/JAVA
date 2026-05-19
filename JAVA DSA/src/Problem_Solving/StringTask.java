package Problem_Solving;

import java.util.Scanner;

public class StringTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] arr = s.toCharArray();
        String ans = "";
        for(int i=0; i<s.length(); i++){
            if(arr[i] <= 'Z') arr[i] = (char) (arr[i]+32);

            if(arr[i] != 'a' && arr[i] != 'e' && arr[i] != 'i' && arr[i] != 'o' && arr[i] != 'u' && arr[i] != 'y'){
                ans+= "." + arr[i];
            }
        }
        System.out.println(ans);
    }
}
