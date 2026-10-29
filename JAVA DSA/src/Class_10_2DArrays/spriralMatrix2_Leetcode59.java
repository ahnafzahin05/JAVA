package Class_10_2DArrays;

public class spriralMatrix2_Leetcode59 {
    public static void main(String[] args) {

    }
    public int[][] generatematrix(int n){
        //int size = n*n;
        int num = 1;
        //int[] arr = new int[size];
        int[][] spiralMatrix = new int[n][n];

        //for(int i=0; i<size; i++) arr[i] = i+1;

        int fr = 0, lr = n-1, fc = 0, lc = n-1;
        //int idx = 0;

        while(fr<=lr && fc<=lc){
            for(int i=fc; i<=lc; i++) spiralMatrix[fr][i] = num++;
            fr++;
            for(int i=fr; i<=lr; i++) spiralMatrix[i][lc] = num++;
            lc--;
            for(int i=lc; i>=fc; i--) spiralMatrix[lr][i] = num++;
            lr--;
            for(int i=lr; i>=fr; i--) spiralMatrix[i][fc] = num++;
            fc++;
        }

        return spiralMatrix;
    }
}
