package Problem_Solving;

public class MinCoins_Greedy {
    public static void main(String[] args) {
        int n = 39;
        int[] arr = {10,5,2,1};
        int i=0;
        while(n>0){
            int ans = n/arr[i]; //counting number of coins for each coin
            for(int j=1; j<=ans; j++){ //printing that no. of coin for that coin
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            n%=arr[i];
            i++;
        }
    }
}
