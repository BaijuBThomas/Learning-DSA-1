import java.util.*;
import java.lang.*;


public class Dsa1subarrya1 {

    public static int solve(int ar[]){
        int n= ar.length;
        int ans =0;

        for(int i = 0;i < n;i++){
            int sum = 0;
           for(int j = i;j < n;j++){  
                // for(int k = i;k <= j;k++){
                    sum = sum+ar[j];
                // }  
                   ans = ans+sum;
                   
                // System.out.println(sum);
            }
         
        }
        return ans;

    }

    public static void main(String argu[]){
        int[] A = {3,4,2};
        // System.out.println();
        System.out.println(solve(A));

      

    }
    
}
