import java.lang.*;
import java.util.*;

public class array1reverse {

    // public static int[] reverse(int ar[]){
    //     int n = ar.length;
    //     int rev[] = new int[n];
        
    //     for(int i = n-1;i >= 0;i--){
    //         rev[n-i-1] = ar[i];
    //     }
    //     return rev;
    // }
    // public static int [] reverse1(int ar[],int start, int end){
        
        
    //     while(start < end){
    //         int temp = ar[start];
    //         ar[start] = ar[end];
    //         ar[end] = temp;
    //         start++;
    //         end--;
    //     }
    //     return ar;
    // }
    public static int max(int ar[]){
        int n = ar.length;
        int mx = ar[0];
        int count = 0;
        for(int i = 1;i < n;i++){
            
            if(ar[i] > mx){
                mx = ar[i];
                count = 1;
            }
            else if(ar[i] == mx){
                count++;
            }
        }
        int result = n-count;

        return result;

    }
    public static void main(String argu[]){
        int arr[] = {10,20,30,40,50,50,50,50,50,3};
        // System.out.println("original string : "+Arrays.toString(arr));
       

        // int res[] =  reverse(arr);
        // System.out.println("original array : "+Arrays.toString(arr));
        // System.out.println("reversed array : "+Arrays.toString(res));
        // int [] reversed = reverse1(arr,B,C);
        // System.out.println("reverse string : "+Arrays.toString(reversed));
        int output = max(arr);
        System.out.println("The number of elements gretaer is : "+ output);
    }
    
}
