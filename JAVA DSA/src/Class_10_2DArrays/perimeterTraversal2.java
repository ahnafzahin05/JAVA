package Class_10_2DArrays;

import java.util.Arrays;

public class perimeterTraversal2 {
    public static void main(String[] args) {
        char[][] arr = new char[][]{
                {'O','R','I','R','N','P'},
                {'G','S','A','A','L','R'},
                {'L','M','N','O','N','Y'},
                {'A','H','U','O','O','P'},
                {'T','F','C','T','H','S'},
                {'E','D','Y','O','C','K'}
        };
        int n = arr.length;
        int fr = 0, fc = 0;
        int lr = arr.length-1, lc = arr[0].length-1;

        for(int count = 0; count<n/2; count++){
            int rotation = n/2 - count;
            int t = 0;
            while(t!=rotation){
                char temp1 = arr[fr][lc];
                for(int i=lc; i>fc; i--) {
                    arr[fr][i] = arr[fr][i-1];
                }

                char temp2 = arr[lr][lc];
                for(int i=lr; i>fr; i--) {
                    if(i==fr+1) arr[i][lc] = temp1;
                    else arr[i][lc] = arr[i-1][lc];
                }

                temp1 = arr[lr][fc];
                for(int i=fc; i<lc; i++) {
                    if(i==lc-1) arr[lr][i] = temp2;
                    else arr[lr][i] = arr[lr][i+1];
                }

                for(int i=fr; i<lr; i++) {
                    if(i==lr-1) arr[i][fc] = temp1;
                    else arr[i][fc] = arr[i+1][fc];
                }

                t++;
            }
            fr++; fc++;
            lr--; lc--;
        }

        for(char[] ele: arr) System.out.println(Arrays.toString(ele));
    }

}
