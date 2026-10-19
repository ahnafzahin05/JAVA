package Class_10_2DArrays;

public class secondaryDiagonalSum {
    public static void main(String[] args) {
        int[][] arr = {{4,3,8,-7},{2,5,-1,12},{-6,16,9,10},{4,13,11,18}};
        System.out.println(getSecondaryDiagonalSum(arr));
    }

    private static int getSecondaryDiagonalSum(int[][] arr) {
        int sum = 0;
        int j=0;
        for(int i=arr.length-1; i>=0; i--){
            sum+=arr[j++][i];
        }
        return sum;
    }
}
