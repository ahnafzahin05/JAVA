package Class_06_Arrays;

public class SecondMax {
    public static void main(String[] args) {
        int[] arr = {10,15,8,10,1,5,8,-8,10,15,10,001,8};
        int max = Integer.MIN_VALUE;
        int secmax = max;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max) { secmax = max; max = arr[i]; } //secmax er moddhe oldmax ke rekhe max ke update kore deo
            if(arr[i]>secmax && arr[i]<max) secmax = arr[i];
        }
        System.out.println(max);
        System.out.println(secmax);
    }
}
