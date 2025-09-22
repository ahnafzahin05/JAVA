package Class_09_Strings;

public class SumofallSubstringsofaNum {
    public static void main(String[] args) {
        String s = "6759";
        int n = s.length();
        int sum=0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<=n; j++){
                int num = Integer.parseInt(s.substring(i,j));
                sum+=num;
            }
        }
        System.out.println(sum);
    }
}



