public class Powerof2 {
    public static void main(String[] args) {
        int n = 320;
        int count=0;
        boolean flag = false;
        while(n%2==0){
            n/=2;
            count++;
            if(n==1) {
                flag = true;
                break;
            }
        }
        if(flag==true) System.out.println("YES"+" "+count);
        else System.out.println("NO");
    }
}
