package Class_07_Sorting;

public class MoveAllZerostoend {
    public static void print(int[] arr){
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {1,0,-2,3,0,4,-5,0,10,0,12};
        print(arr);
        int n = arr.length;
        //another approach, O(n), it'll be more clear in sliding window
        int j = 0;  // position to put the next non-zero

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) { //just understand that, if a[i]!=0 then swap it!
                // Swap only if i and j are different
                if (i != j) { //this cond is not mandatory
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++; //here, j is preserving the zero & moves it rightwards whenever a[i]!=0
            }//a[i]==0 hole just i++ korbo taile a[j] er moddhe 0 store hoye thakbe, tahole porer iteration jei iteration e a[i]=0 hobe sheitar sathe swap koraye dibo
            print(arr);
        }
        //print(arr);
        //Output analysis (Check rough copy) i refers to index number
//      i=0  1 0 -2 3 0 4 -5 0 10 0 12
//      i=1  1 0 -2 3 0 4 -5 0 10 0 12
//      i=2  1 -2 0 3 0 4 -5 0 10 0 12
//      i=3  1 -2 3 0 0 4 -5 0 10 0 12
//      i=4  1 -2 3 0 0 4 -5 0 10 0 12
//      i=5  1 -2 3 4 0 0 -5 0 10 0 12
//      i=6  1 -2 3 4 -5 0 0 0 10 0 12
//      i=7  1 -2 3 4 -5 0 0 0 10 0 12
//      i=8  1 -2 3 4 -5 10 0 0 0 0 12
//      i=9  1 -2 3 4 -5 10 0 0 0 0 12
//      i=10  1 -2 3 4 -5 10 12 0 0 0 0




        // an easy approach, O(n)
//        int n = arr.length;
//        int j = 0; // index to place the next non-zero element
//
//        // First pass: move non-zeros forward
//        for (int i = 0; i < n; i++) {
//            if (arr[i] != 0) {
//                arr[j] = arr[i];
//                j++;
//            }
//        }
//
//        // Fill the rest with zeros
//        while (j < n) {
//            arr[j] = 0;
//            j++;
//        }




        //using bubble sort O(n^2)

//        for(int i=0; i<arr.length-1; i++){
//            boolean isSorted = true;
//            for(int j=0; j<arr.length-1-i; j++){
//                if(arr[j]==0){
//                    arr[j] = arr[j+1];
//                    arr[j+1] = 0;
//                    isSorted = false;
//                }
//            }
//            if(isSorted) break;
//        }
        //print(arr);
    }
}
