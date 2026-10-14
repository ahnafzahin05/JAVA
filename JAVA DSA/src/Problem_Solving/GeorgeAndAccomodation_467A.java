package Problem_Solving;

import java.util.Scanner;

public class GeorgeAndAccomodation_467A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0;
        for(int i=0; i<n; i++){
            int p = sc.nextInt(), q = sc.nextInt();
            if(q-p>=2) count++;
        }
        System.out.println(count);
    }
}
