package Class_08_BinarySearch;

public class r {
    public static void main(String[] args) {
        int[] arr = {-2,-1,-1,1,2,3};
        System.out.println(max(arr));
    }
    public static int max(int arr[]){
        //finding the last occurrence of NEG
        int left=0, right=arr.length-1;
        int negindex=-1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(arr[mid]>=0) right = mid-1;
            else{
                negindex = mid;
                left = mid+1;
            }
        }
        int negnum = negindex+1;

        //finding the first occurence of POS
        left=0; right=arr.length-1;
        int posindex =-1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(arr[mid]<=0) left = mid+1;
            else{
                posindex = mid;
                right = mid-1;
            }
        }
        int posnum = 0;
        if(posindex!=-1) posnum = arr.length - posindex;
        return Math.max(posnum,negnum);
    }
}
