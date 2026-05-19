package Class_11_Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {10,2,3,4,5,6,7,8};
        int k = 58, lo=0, hi=arr.length-1;
        System.out.println(search(arr,k,lo,hi));
    }

    private static int search(int[] arr, int k, int lo, int hi) {
        if(lo>hi) return -1;

        int mid = lo + (hi-lo)/2;
        if(arr[mid]==k) return mid;
        else if(arr[mid]>k) return search(arr,k,lo,mid-1);
        else return search(arr,k,mid+1,hi);
    }
}
