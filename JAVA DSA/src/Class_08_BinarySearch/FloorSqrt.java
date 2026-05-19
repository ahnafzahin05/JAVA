package Class_08_BinarySearch;

public class FloorSqrt {
    public static void main(String[] args) {
        int n = 25;
        System.out.println(floorsqrt(n));
    }
    public static int floorsqrt(int n){
        // T.C = O(logn)
        int left = 1, right = n;
        int floor = -1;
        if(n==0) return 0;
        while(left<=right){
            int mid = left + (right-left)/2;

            if(mid > n/mid) right = mid-1; //mid*mid can cross 2*31 -1 space i.e. int limit, so to overcome this overflow
            //error instead if writing if(mid*mid> n) we simply took divide m by n, then no overflow error will occur
            else if(mid < n/mid){
                floor = mid;
                left = mid+1;
            } else return mid;
        }
        return floor; //we could also return right



//        // T.C = O(sqrt(n))
//        for(int i=1; i<=n/2; i++){
//            if(i*i == n) return i;
//            else if(i*i > n) return i-1;
//        }
//        return 1;
    }
}
