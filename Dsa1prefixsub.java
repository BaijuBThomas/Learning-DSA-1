
import java.util.*;
import java.lang.*;

public class Dsa1prefixsub {

    // Kadane's algorithm

    public static long solve(int ar[]){
        int n = ar.length;
        long ans = ar[0];
        long sum = ar[0];

        for(int i = 1;i < n;i++){
            if( sum < 0){
                sum = 0;
            }
            sum = sum +ar[i];

            if(sum > 0){
                ans = sum;
            }
        }
          
        return ans;
    } 
    // public static long solve(int ar[]){
    //     int n = ar.length;
    //     long ans = ar[0];
    //     long sum = ar[0];

    //     for(int i = 1; i < n; i++){
    //         sum = Math.max(ar[i], sum + ar[i]);
    //         ans = Math.max(ans, sum);
    //     }
    //     return ans;
    // }
    
    
    public static void main(String argu[]){
        int[] A = {5,6,7,-3,2,-10,-12,8,12,-4,7};
        // System.out.println();
        System.out.println(solve(A));
    }
    
}



