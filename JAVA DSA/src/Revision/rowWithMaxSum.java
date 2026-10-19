package Revision;

public class rowWithMaxSum {
    public static void main(String[] args) {
        int sum = Integer.MIN_VALUE, maxRowIdx = -1;
        int[][] arr = {{2,8,3,4,7},{7,2,1,6,3},{5,5,4,1,4},{3,1,8,2,6}};

        for(int i=0; i<arr.length; i++){
            int temp = 0;
            for(int j=0; j<arr[0].length; j++){
                temp+=arr[i][j];
            }
            if(temp>sum){
                sum = temp;
                maxRowIdx = i;
            }
        }

        System.out.println(maxRowIdx);
    }
}
