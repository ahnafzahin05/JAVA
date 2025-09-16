package Class_02_IfElse;

import java.util.Scanner;

public class TernaryInVar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int zahin = (x>0) ? +1000 : -1000;
        System.out.println(zahin);
    }
}
