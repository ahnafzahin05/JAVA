package Class_06_Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {432,6,57,12,321,54,9,5,-4,-3,-1};
        int target = 53;
        boolean flag = false;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                flag = true;
                break;
            }
        }
        if(flag) System.out.println("Exists");
        else System.out.println("DNE");
    }
}
