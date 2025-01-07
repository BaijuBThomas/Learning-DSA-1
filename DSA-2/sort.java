import java.lang.*;
import java.util.*;

public class sort {

    public static int[] sortTheArray(int ar[], int s, int m, int e){
       
        int p1 = s;
        int p2 = m+1;
        int p3 = 0;
        int temp[] = new int[e-s+1];
        
        while(p1 <= m && p2 <= e){
            if(ar[p1] < ar[p2]){
                temp[p3] = ar[p1];
                p1++;
                p3++;
            }
            else{
                temp[p3] = ar[p2];
                p2++;
                p3++;
            }
        }
        while(p1 <= m){
            temp[p3] = ar[p1];
                p1++;
                p3++; 
        }
        while(p2 <= e){
            temp[p3] = ar[p2];
            p2++;
            p3++;  
        }
        int k = 0;
        for(int i = s;i <= e;i++){
            ar[i] = temp[k];
            k++;
        }
       
        return ar;

    }
    public static void main(String argu[]){
        int ar[] = {4,8,-1,2,8,9,11,3,4,7,13,0};
        int s = 2;
        int m = 6;
        int e = 10;

        System.out.println(" original array "+Arrays.toString(ar));

        int ans[] = sortTheArray(ar,s,m,e);
        System.out.println(" updated array  "+Arrays.toString(ans));
    }
}

// tc O(n)  sc O(n) for the temp array 
// you are given ana array index s,m,e and then sort the array from s, e 
