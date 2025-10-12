package Class_10_2DArrays;

public class MaxRowSum {
    public static void main(String[] args) {
        int[][] arr = {{2,8,3,4,7},{7,2,1,6,3},{5,5,4,1,4},{3,1,8,2,6}};
        int maxSum = 0, maxRow = -1;
        for(int i=0; i<arr.length; i++){
            int sum = 0;
            for(int j=0; j<arr[0].length; j++){
                sum+=arr[i][j];
            }
            if(sum>maxSum) {
                maxSum = sum;
                maxRow = i;
            }
        }
        System.out.println(maxSum+" "+maxRow);
    }
}
