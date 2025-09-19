package Class_08_BinarySearch;

public class FloorSqrt {
    public static void main(String[] args) {
        int n = 25;
        System.out.println(floorsqrt(n));
    }
    public static int floorsqrt(int n){
        // T.C = O(logn)
        int left=1, right=n/2;
        int floor = -1;

        while(left<=right){
            int mid = (left+right)/2;
            if(mid*mid > n){
                right = mid-1;
            }
            else if(mid*mid < n){
                floor = mid;
                left = mid+1;
            }
            else return mid;
        }
        return floor;



//        // T.C = O(sqrt(n))
//        for(int i=1; i<=n/2; i++){
//            if(i*i == n) return i;
//            else if(i*i > n) return i-1;
//        }
//        return 1;
    }
}
