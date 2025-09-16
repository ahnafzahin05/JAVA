package Class_07_Sorting;

public class SortedOrNot {
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-5};
        //boolean flag = arraySortedOrNot(arr);
        if(arraySortedOrNot(arr)) System.out.println("SORTED");
        else System.out.println("NOT SORTED");
    }
    public static boolean arraySortedOrNot(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]) return false;
        }
        return true;
    }


}
