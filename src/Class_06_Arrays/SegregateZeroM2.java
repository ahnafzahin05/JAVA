package Class_06_Arrays;

public class SegregateZeroM2 {
    public static void main(String[] args) {
        int[] arr = {0,1,1,0,1,0,1,1};
        moveOnes(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    //Sliding Window
    public static void moveOnes(int[] arr) {
        int n = arr.length;
        int j = 0; // index of the left most zero

        for (int i = 0; i < n; i++) {
            if (arr[i] != 1) {
                // Swap current element with arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }
}
