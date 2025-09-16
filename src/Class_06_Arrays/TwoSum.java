package Class_06_Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {1,5,8,-3};
        int target = 2;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                int sum =0;
                sum = arr[i] + arr[j];
                if(sum==target) System.out.println("("+i+","+j+")");
            }
        }
    }
}
