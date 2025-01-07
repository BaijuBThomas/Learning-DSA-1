import java.lang.*;
import java.util.*;


public class array2day5 {

    public static int[][] ninetyDegree(int ar[][]){
        int n = ar.length;
        int m = ar[0].length;
        int ans[][] = new int[m][n];

        for(int i = 0;i < n;i++){
            for(int j = 0;j < m;j++){
               ans[j][n-1-i] = ar[i][j]; 
            }
        }
        return ans;
    }
    public static void main(String argu[]){
       
        int arr[][] = {{7,2,3},
                        {6,3,2},
                        {1,4,5},
                        {1,3,5}};

         for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        int ans[][] = ninetyDegree(arr);
        
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }

       
        
    }
    
}
