package Revision;

public class KadanesAlgo_LargestSumContiguousSubarray {
    public static void main(String[] args) {
        int[] arr = {3,4,-5,8,-12,7,6,-2};
        int max = Integer.MIN_VALUE;
        int pS = 0;
        for(int i=0; i<arr.length; i++){
            pS+=arr[i];
            max = Math.max(max,pS);
            //jodi emon hoy je duita element ase duitai neg, tokhn to pS neg i ashbe taina, tai shei neg er max tai store
            //korte hobe agey then pS ke abar zero banate hobe
            //think about [-9,-8]
            if(pS<0) pS = 0;
            //when we get negative value of prefixSum then we make it zero because,
            //jokhn pS neg chole ashbe and then next ele ta add korba tokhn kintu value ta kome jabe, tar mane
            //tmi jei subArray ta nicchila oitai max value paba na, tmake arekta sub array nite hobe, shei sub array
            //ta hobe jei index er jonno pS neg ashce tar porer index theke, tai pS 0 banaye abar calculate kora start
            //kori next sub array er jonno
            //array er value jodi neg hoy but pS jodi neg na hoy tahole pS=0 korina cuz tmi duita case i chinta koro
            //0 korle ki hobe ar na korle ki hobe, kontay value beshi ashbe

        }
        System.out.println(max);
    }
}
