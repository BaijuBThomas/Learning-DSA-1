// import java.lang.*;
import java.util.*;


public class Dsa1leaderofarray {

    public static int[] leaderOfArray(int ar[]){
        int n = ar.length;
        int max = ar[0];
        int count  = 1;
        

        for(int i = 1; i < n;i++){
            if(max < ar[i]){
                max = ar[i];
                count  = count +1;
            }
        }
        
        return count ;
    }

    public static void main(String argu[]){
        int arr[] = {4,2,3,9,7,10};

        int count = leaderOfArray(arr);
        System.out.println("Total count of leader in an array : "+ count);
    }
    
}
