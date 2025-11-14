package Problem_Solving;

import java.util.Arrays;

public class AssignMiceHoles_Greedy {
    public static void main(String[] args) {
        int[] mices = {4, -4, 2};
        int[] holes = {4, 0, 5};
        System.out.println(assignHole(mices,holes));
    }

    private static int assignHole(int[] mices, int[] holes) {
        Arrays.sort(mices);
        Arrays.sort(holes);
        int n = mices.length;
        int max = 0;
        for(int i=0; i<n; i++){
            max = Math.max(max, Math.abs(mices[i]-holes[i]));
        }
        return max;
    }
}
