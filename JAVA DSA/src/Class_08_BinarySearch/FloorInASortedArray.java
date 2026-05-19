package Class_08_BinarySearch;

public class FloorInASortedArray {
    //Floor Func: Floor(3.4) = 3, Floor(3) = 3,
    public static void main(String[] args) {
        int[] arr = {1,2,8,10,10,12,19};
        int x = 10;
        int ans = findFloor(arr,x);
        System.out.println(ans);
    }
    public static int findFloor(int[] arr, int x) {
        // code here
        int left=0, right=arr.length-1, index=-1;

        while(left<=right){
            int mid=(left+right)/2;

            if(arr[mid]<=x){ //for multiple target, we need the last occurrence
                index = mid;
                left = mid+1;
            }
            else right = mid-1;
        }
        return index;
    }
}
