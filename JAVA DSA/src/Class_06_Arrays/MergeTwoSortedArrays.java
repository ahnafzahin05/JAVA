package Class_06_Arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] a = {2,5,6,9,20};
        int[] b = {1,3,4,5,7,8};
        int[] c = new int[a.length + b.length];
        merge(c,a,b);
        for(int ele : c){
            System.out.print(ele+" ");
        }
    }

    public static void merge(int[] c, int[] a, int[] b) {
        int i=0, j=0, k=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]) c[k++] = a[i++]; //instead of writing i++ and k++
            else c[k++] = b[j++]; //instead of writing j++ and k++
        }
        while(j<b.length) c[k++] = b[j++]; //if(i==a.length) //"a" array ended, b er baki elements niye neo
        while(i<a.length) c[k++] = a[i++]; //if(j==b.length) //"b" array ended, a er baki elements niye neo
    }
}
