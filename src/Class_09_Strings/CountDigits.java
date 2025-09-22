package Class_09_Strings;

public class CountDigits {
    public static void main(String[] args) {
        int n = 00500;
        String s = Integer.toString(n);
        System.out.println(s.length());
        s = "00500";
        System.out.println(s.length());

        double x = 000.006700;
        String y = Double.toString(x);
        System.out.println(y.length()); //it counted 0.0067
    }


}
