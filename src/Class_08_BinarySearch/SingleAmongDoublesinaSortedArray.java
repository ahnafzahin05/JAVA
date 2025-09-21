package Class_08_BinarySearch;

public class SingleAmongDoublesinaSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,4,50,50,65,65};
        System.out.println(findOnce(arr));
    }
    public static int findOnce(int[] arr){
        int n = arr.length; //arr.length will never be EVEN
        //handling the edge cases
        if(n==1) return arr[0];
        if(arr[0]!=arr[1]) return arr[0];
        if(arr[n-1] != arr[n-2]) return arr[n-1];

        int left = 0, right = n-1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid+1]) return arr[mid];

            int first = mid, sec = mid; //coordinates of pair
            if(arr[mid-1]==arr[mid]) first = mid-1; //out of bound error will never come cuz we already handled the edge cases
            else if(arr[mid]==arr[mid+1]) sec = mid+1;

            //counting total num of digits on the left and right side of the pair
            int leftCount = first - left, rightCount = right - sec;
            if(leftCount%2==0) left = sec + 1; //go to the odd part
            else right = first - 1;
        }
        return -1;
    }
}
