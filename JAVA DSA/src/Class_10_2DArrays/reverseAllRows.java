package Class_10_2DArrays;

public class reverseAllRows {
    public static void main(String[] args) {
        int[][] arr = {{2,8,3,4,7},{7,2,1,6,3},{5,5,4,1,4},{3,1,8,2,6}};
        for(int i=0; i<arr.length; i++){
            reverse(arr[i]);
        }

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++) System.out.print(arr[i][j]+" ");
            System.out.println();
        }

        // Alternative Approach without method
//        for(int i=0; i<arr.length; i++){
//            int l=0, r=arr[0].length-1;
//            while(l<r){
//                int temp = arr[i][l]; //eikhane amader array tai hocche arr[i], agey 1D te thakto arr
//                arr[i][l] = arr[i][r];
//                arr[i][r] = temp;
//                l++;
//                r--;
//            }
//        }
    }

    private static void reverse(int[] ints) {
        int i=0, j=ints.length-1;
        while(i<j){
            int temp = ints[i];
            ints[i] = ints[j];
            ints[j] = temp;
            i++;
            j--;
        }
    }

}
