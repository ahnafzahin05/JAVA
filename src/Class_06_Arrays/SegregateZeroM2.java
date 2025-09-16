package Class_06_Arrays;

public class SegregateZeroM2 {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,0};
        int n = arr.length - 1;
        int i=0, j=n;
        while(i<j){
            if(arr[i]==0) i++;
            if(arr[j]==1) j--;
            if(arr[i]==1 && arr[j]==0 && i<j){
                arr[i] = 0;
                arr[j] = 1;
                i++;
                j--;
            }
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
