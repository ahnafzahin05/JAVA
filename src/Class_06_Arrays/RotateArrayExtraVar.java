package Class_06_Arrays;

public class RotateArrayExtraVar {
    public static void main(String[] args) {
        //using extra variable

        int[] arr = {1,2,3,4,5,6,7,8,9};
        int d = 8; //d mane first er d element ke dhore last e boshaye deo
        int[] arr2 = new int[arr.length];
        int temp = d;
        for(int i = 0; i<arr.length - d; i++, temp++){
            arr2[i] = arr[temp];
        }
        for(int i = arr.length - d, j = 0; i<arr.length; i++, j++){
            arr2[i]  = arr[j];
        }
        for(int ele : arr2){
            System.out.print(ele+" ");
        }

    }
}
