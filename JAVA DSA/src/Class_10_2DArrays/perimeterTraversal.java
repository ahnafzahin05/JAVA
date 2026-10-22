package Class_10_2DArrays;

import java.util.Arrays;

public class perimeterTraversal {
    //travel the perimeter and store the data in an array
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4, 5,  11},
                       {6, 7, 8, 9, 10, 22},
                       {11,12,13,14,15, 33},
                       {16,17,18,19,20, 44},
                       {21,22,23,24,25, 55},
                       {26,27,28,29,30, 66}};

        int k = arr.length/2;
        int fR = 0, fC = 0;
        int lR = arr.length-1, lC = arr[0].length-1;

        for(int t=0; t<k; t++){
            int m = (lC-fC+1)*(lC-fC+1) - (lC-fC-1)*(lC-fC-1);
            int[] ans = new int[m];
            int count = 0;

            for(int i=fC; i<=lC; i++) ans[count++] = arr[fR][i]; //System.out.print(arr[fR][i]+" ");
            fR++;
            for(int i=fR; i<=lR; i++) ans[count++] = arr[i][lC]; //System.out.print(arr[i][lC]+" ");
            lC--;
            for(int i=lC; i>=fC; i--) ans[count++] = arr[lR][i]; //System.out.print(arr[lR][i]+" ");
            lR--;
            for(int i=lR; i>=fR; i--) ans[count++] = arr[i][fC]; //System.out.print(arr[i][fC]+" ");
            fC++;

            System.out.println(Arrays.toString(ans));
            rotateArray(ans,k-t);
            System.out.println(Arrays.toString(ans));
        }
        


//        for(int t=0; t<arr.length/2; t++){
//            int row = arr.length, col = arr[0].length;
//            for(int i=0+t; i<col-t; i++) System.out.print(arr[0+t][i]+" ");
//            for(int i=1+t; i<row-t; i++) System.out.print(arr[i][col-1-t]+" ");
//            for(int i=col-2-t; i>=0+t; i--) System.out.print(arr[row-1-t][i]+" ");
//            for(int i=row-2-t; i>0+t; i--) System.out.print(arr[i][0+t]+" ");
//            System.out.println();
//        }

    }

    private static void rotateArray(int[] ans, int k) {
        k = k%ans.length;

        int i=0, j=ans.length-1;
        while(i<j){
            int temp = ans[i];
            ans[i] = ans[j];
            ans[j] = temp;
            i++;
            j--;
        }

        i=0; j=k-1;
        while(i<j){
            int temp = ans[i];
            ans[i] = ans[j];
            ans[j] = temp;
            i++;
            j--;
        }

        i=k; j=ans.length-1;
        while(i<j){
            int temp = ans[i];
            ans[i] = ans[j];
            ans[j] = temp;
            i++;
            j--;
        }
    }
}
