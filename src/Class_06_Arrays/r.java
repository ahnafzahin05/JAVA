package Class_06_Arrays;

public class r {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15,27};
        int target = 22;
        boolean flag = false;
        int start = 0, end = arr.length-1;
        while(start<end){
            int sum = arr[start] + arr[end];
            if(sum == target){
                System.out.println(arr[start]+" "+arr[end]);
                flag = true;
                break;
            }
            else if(sum>target) end--;
            else start++;
        }
        if(flag==false) System.out.println("no pair");
    }
}
