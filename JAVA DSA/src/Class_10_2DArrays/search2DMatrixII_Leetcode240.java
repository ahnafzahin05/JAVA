package Class_10_2DArrays;

public class search2DMatrixII_Leetcode240 {
    public static void main(String[] args) {
        int[][] arr = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target = 25;
        int i=0, j=arr[0].length-1;
        boolean flag = false;
        //T: O(m+n)
        while(i<arr.length && j>=0){
            if(target>arr[i][j]) i++;
            else if(target<arr[i][j]) j--;
            else{
                flag = true;
                break;
            }
        }
        System.out.println(flag);
    }
}
