package Class_11_Recursion;

public class RecursionOnArrays {
    public static void main(String[] args) {
        int[] arr = {1,5,3,4,8,3,2};

        recPrint(arr,0);
        System.out.println();

        recPrintRev(arr,0); //best method to reverse
        System.out.println();

        recPrintRevM2(arr,arr.length-1);
        System.out.println();

        System.out.println(linearSearch(arr,0,1));
    }

    public static void recPrint(int[] arr, int idx){
        if(idx==arr.length) return;
        System.out.print(arr[idx]+" ");
        recPrint(arr,idx+1);
    }

    public static void recPrintRev(int[] arr, int idx){
        if(idx==arr.length) return;
        recPrintRev(arr,idx+1);
        System.out.print(arr[idx]+" ");
    }

    public static void recPrintRevM2(int[] arr, int idx){
        if(idx<0) return;
        System.out.print(arr[idx]+" ");
        recPrintRevM2(arr,idx-1);
    }

    public static boolean linearSearch(int[] arr, int idx, int k){
        if(idx==arr.length) return false;
        if(arr[idx]==k) return true;
        return linearSearch(arr,idx+1,k);
    }
}
