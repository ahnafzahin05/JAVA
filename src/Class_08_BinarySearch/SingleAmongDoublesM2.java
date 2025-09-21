package Class_08_BinarySearch;

public class SingleAmongDoublesM2 {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,4,5,5,6,6,7,7};
        System.out.println(findOnce(arr));
    }
    public static int findOnce(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // Force mid to be even - this is the key optimization!
            if (mid % 2 == 1) {
                mid--;
            }

            // Check if the pair at even position is intact
            if (arr[mid] == arr[mid + 1]) {
                // Pair is intact - single element is on the RIGHT side
                left = mid + 2;
            } else {
                // Pair is broken - single element is on the LEFT side (including mid)
                right = mid;
            }
        }

        return arr[left];

//        Step 1: The Pattern Recognition
//        In a normal array with all pairs:
//        Array:   [1, 1, 2, 2, 3, 3, 4, 4, 5, 5]
//        Indices:  0  1  2  3  4  5  6  7  8  9
//          ↑     ↑     ↑     ↑     ↑
//        Even positions where pairs START
//        Key insight: Pairs always start at even indices (0, 2, 4, 6, 8...)
//
//        Step 2: What Happens with a Single Element
//        Array:   [1, 1, 2, 2, 3, 3, 4, 50, 50, 65, 65]
//        Indices:  0  1  2  3  4  5  6   7   8   9  10
//          ↑     ↑     ↑     ↑
//        Pairs start here   Single element!
//        After the single element, the pattern shifts!
//
//        Step 3: The Magic Check
//        My algorithm always checks at EVEN indices:
//
//        Pick a middle point
//        Force it to be even (if odd, subtract 1)
//        Check if the pair is intact:
//
//        arr[even_index] == arr[even_index + 1] → Pattern intact → Single element is on the RIGHT
//        arr[even_index] != arr[even_index + 1] → Pattern broken → Single element is on the LEFT
    }
}
