package Class_06_Arrays;

public class MoveAllZeroestoEnd {
    public static void main(String[] args) {
        int[] arr = {0,1,2,0,3,0,4,5};
        moveZeros(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    //Sliding Window
    public static void moveZeros(int[] arr) {
        int n = arr.length;
        int j = 0; // index of the left most zero

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                // Swap current element with arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        //Another Method
//        int n = arr.length;
//        int j = 0; // pointer for next non-zero position
//
//        // Step 1: Move non-zero elements forward
//        for (int i = 0; i < n; i++) {
//            if (arr[i] != 0) {
//                arr[j] = arr[i];
//                j++;
//            }
//        }
//
//        // Step 2: Fill the rest with zeros
//        while (j < n) {
//            arr[j] = 0;
//            j++;
//        }
    }
}
