package Problem_Solving;

import java.util.Scanner;

public class RoadToZero_1342A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x = sc.nextInt(), y = sc.nextInt();
            int a = sc.nextInt(), b = sc.nextInt();
            long op1 = (long) (x + y) *a, op2 = (long) Math.min(x, y) *b + (long) Math.abs(x - y) *a;
            System.out.println(Math.min(op1,op2));
            //Java decides the data type of expression from the operands, not the variable it’s assigned to.
        }
    }
}
