package Problem_Solving;

import java.util.Scanner;

public class UnnaturalLanguageProcessing_1915D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String s = sc.next();
            //soln1(s,n);
            soln2(s,n);
        }
    }
    public static void soln2(String s, int n){
        StringBuilder ans = new StringBuilder();
        int i=0;
        while(i<n-1){
            char ch1 = s.charAt(i), ch2 = s.charAt(i+1);

            if((ch1=='b'||ch1=='c'||ch1=='d') && (ch2=='a'||ch2=='e')){//C-V
                ans.append(ch1);
                ans.append(ch2);
                //if(i!=0) ans.append(".");
                i+=2;
            }
            else if((ch1=='b'||ch1=='c'||ch1=='d') && (ch2=='b'||ch2=='c'||ch2=='d')){ //C-C
                ans.append(ch1);
                ans.append(".");
                i++;
            }
            else{
                ans.append(".");
                ans.append(ch1);
                ans.append(ch2);
                i+=2;
            }
        }
        if(i==n-1) ans.append(s.charAt(n-1));
        System.out.println(ans);
    }
    public static void soln1(String s, int n){
        StringBuilder ans = new StringBuilder();

        if(n<=3) System.out.println(s);
        else{
            int i=0;
            while(i<n-1){
                if(i==n-2){
                    ans.append(".");
                    ans.append(s, i, i+2);
                    i+=2;
                }
                else if(i==n-3){
                    ans.append(".");
                    ans.append(s, i, i+3);
                    i+=3;
                }
                else{
                    char ch1 = s.charAt(i+2), ch2 = s.charAt(i+3);
                    if((ch1=='b' || ch1=='c' || ch1=='d') && (ch2=='b' || ch2=='c' || ch2=='d')){
                        //3rd and 4th char jodi C hoy, tahole 3rd char i.e. index-2 porjonto append koro, mane CVC
                        //no part can start like VC, that's why we check after CV whether there are 2 C or 1 C, if one then
                        //we append first two char i.e. CV otherwise CVC
                        if(i!=0) ans.append(".");
                        ans.append(s, i, i+3);
                        i+=3;
                    }
                    else{
                        if(i!=0) ans.append(".");
                        ans.append(s, i, i+2);
                        i+=2;
                    }
                }
            }
            System.out.println(ans);
        }
    }
}
