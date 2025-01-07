import java.lang.*;
import java.util.*;

public class sorti {
    public static int[] sortTheLastElement(int ar[]){
        int n = ar.length;
        int x = ar[n-1];
        int j = 0;

        for(int i = 0;i < n-1;i++){
            if(ar[i] < x){
                int temp = ar[i];
                ar[i] = ar[j];
                ar[j] = temp;
                j++;
            }
            
        }
        int temp = ar[n-1]; 
        ar[n-1] = ar[j];
        ar[j] = temp;
        return ar;
    }
    public static void main(String argu[]){
        int ar[] = {9,8,1,6,5,11,4,7};
        
        System.out.println(Arrays.toString(ar));
        int ans[] = sortTheLastElement(ar);
        System.out.println(Arrays.toString(ans));
    }
}

