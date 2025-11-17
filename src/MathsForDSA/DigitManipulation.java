package MathsForDSA;

public class DigitManipulation {
    public static void main(String[] args) {
        int[] arr = {2,5,6,7,4};
        //You've to print 47652, and have to start calculation/operation from arr[0] first.
        int num = 0;
        for(int i=0; i<arr.length; i++){
            num = (int) (arr[i]*Math.pow(10,i) + num);
        }
        System.out.println(num);
    }
}
