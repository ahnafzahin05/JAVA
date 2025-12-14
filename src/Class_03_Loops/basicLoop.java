package Class_03_Loops;

public class basicLoop {
    public static void main(String[] args) {
        //time table of 17
//        for(int i=1; i<=10; i++){
//            System.out.printNto1(i*17+" ");
//        }
        //geometric series
//        int a = 1;
//        for(int i=1; i<=10; i++){
//            System.out.printNto1(a+" ");
//            a = a*2; //r = 2
//        }
        //random sequence
        int n = 10;
        for(int i=1; i<=n; i++){
            System.out.println(i+" "+(n-i+1));
            //System.out.println(n-i+1);
        }
    }
}
