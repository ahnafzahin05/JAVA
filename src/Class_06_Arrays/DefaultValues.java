package Class_06_Arrays;

public class DefaultValues {
    public static void main(String[] args) {
        int[] arr1 = new int[8];
        for (int i=0; i<arr1.length; i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();

        double[] arr = new double[8];
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        char[] arr2 = new char[8];
        for (int i=0; i<arr2.length; i++){
            System.out.print(arr2[i]+" ");
        }
        System.out.println();

        String[] arr3 = new String[8];
        for (int i=0; i<arr3.length; i++){
            System.out.print(arr3[i]+" ");
        }
    }
}
