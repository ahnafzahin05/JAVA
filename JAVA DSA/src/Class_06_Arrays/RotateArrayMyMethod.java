package Class_06_Arrays;

public class RotateArrayMyMethod {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int d = 4; //d mane first er d ta element ke dhore last e boshaye deo
        for(int i=1; i<=d; i++){
            int LMIX = 0, SIX = 1; //LMIX --> LeftMostIndex, jeikhan theke korte chai
            int temp = arr[0];
            while(LMIX < arr.length - 1){ //jei porjonto korte chai
                arr[LMIX] = arr[SIX];
                LMIX++;
                SIX++;
            }
            arr[LMIX] = temp;
        }
        for(int ele: arr){
            System.out.print(ele+" ");
        }
    }
}
