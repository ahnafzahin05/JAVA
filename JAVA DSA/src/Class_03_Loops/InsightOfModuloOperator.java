package Class_03_Loops;

public class InsightOfModuloOperator {
    public static void main(String[] args) {
        int n = 9540341; //last er jei koita digit chai, n%10^tot koita korte hobe
        int req = n % (10*10*10*10*10*10*10);
        System.out.println(req);
        req = n % (10*10*10*10*10*10);
        System.out.println(req);
        req = n % (10*10*10*10*10);
        System.out.println(req);
        req = n % (10*10*10*10);
        System.out.println(req);
        req = n % (10*10*10);
        System.out.println(req);
        req = n % (10*10);
        System.out.println(req);
    }
}
