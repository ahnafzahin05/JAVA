package Class_08_BinarySearch;

public class Code {
    public static void main(String[] args) {
        int[] arr = {-76,-4,9,28,47,49,510,615,9911,99999};
        int left = 0, right = arr.length - 1;
        int target = 47;
        int index= -1;

        while(left<=right){ // for exact search
            int mid = left + (right - left) / 2;  // Prevents overflow

            if(arr[mid]==target){
                index = mid; // Found target
                break;
            }
            else if(arr[mid]>target){ // go left, exclude the right part including mid of the current array
                right = mid - 1; // Target is in left half
            }
            else if(arr[mid]<target){ //go right, exclude the left part including mid of the current array
                left = mid + 1; // Target is in right half
            }
        }
        System.out.println(index);
    }
}
