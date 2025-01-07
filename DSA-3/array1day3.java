import java.lang.*;
import java.util.*;

public class array1day3 {

    // public static int pair(int ar[], int a){
    //     int n = ar.length;
    //     int count = 0;
       
    //     for(int i = 0;i < n;i++){
            
    //         for(int j = 0; j < n;j++){
                
    //             if(ar[i] + ar[j] == a && i != j){
    //                 count = count+1;
    //             }
    //         }

    //     }
    //     return count/2;
    // }
    public static int pair(int ar[], int a){
        int n = ar.length;
        int count = 0;
        for(int i = 1;i < n;i++){
            for(int j = 0;j < n;j++){
                if(ar[i]+ar[j] == a){
                    count = count+1;
                }
            }
        }
        return count;
    }
    public static void main(String argu[]){
        int arr[]= {2,4,2,5,1,3};
        int k = 6;
        ArrayList<Integer> arr = new ArrayList<>();

        int result = pair(arr,k);

        System.out.println("The count of i , j : "+result);
    }
    
}
