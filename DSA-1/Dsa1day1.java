import java.lang.*;
import java.util.*;


public class Dsa1day1 {
    //reversing an array

    // public static void reverseAr(int ar[],int s,int e){

    //     int temp = 0;
            
    //         while(s < e){
    //             temp = ar[s];
    //             ar[s] = ar[e];
    //             ar[e] = temp;
    //             s++;
    //             e--;
    //         }
    
    //     System.out.println("reverse array : "+ Arrays.toString(ar));
        
    // }

    public static void reverseMid(int ar[] , int k){
        int n = ar.length;
        k = k%n;
        int temp = 0;
        int s = 0;
        int e = n-1;

        while(s < e){
            temp = ar[s];
            ar[s] = ar[e];
            ar[e] = temp;
            s++;
            e--;
        }
        System.out.println("Reverse the entire array : "+ Arrays.toString(ar));
            int s1 = 0;
        int e1 = k-1;
        while(s1 < e1){
            temp = ar[s1];
            ar[s1] = ar[e1];
            ar[e1] = temp;
            s1++;
            e1--;
        }
        System.out.println("reverse till the k elements : "+Arrays.toString(ar));
        int s2 = k;
        int e2 = n-1;
        while(s2 < e2){
            temp = ar[s2];
            ar[s2] = ar[e2];
            ar[e2] = temp;
            s2++;
            e2--;
        }
        System.out.println("final array after reversal : "+Arrays.toString(ar));
    }

    public static void main(String argu[]){
        
        int arr[] = {4,1,6,9,2,14,7,8,3};
        int k = 5;

        System.out.println("original Array : "+Arrays.toString(arr));

         reverseMid(arr,k);

        //Time complexity 1 & 2 snippets
        
    //    for(int i = 1;i <= n;i*=2){
    //     for(int j = 1; j <= n;j++){
    //         System.out.println(i+j+" ");
    //     }
    //     System.out.println();
    //    }

    // int a = 0, i = N;
    // while(i){
    //     a = a+i;
    //     i=i/2;
    // }
    // for (int i = 1;i <= 100; i *=2){
    //     for(int j = 1; j <= n;j++){
    //         System.out.println(i+j+" ");
    //     }
    //     System.out.println();
    // }

    // int func(int n){
    //     int s = 0;
    //     for(int i =1; i*i*i <= n;i++){
    //         s= s+i;
    //     }
    //     return s;
    // }
        // public void solve() {
        //     int i = 1;
        //     while(i < n){
        //         int x = i;
        //         while(x--> 0){
        //             //O(1) operation
        //         }
        //         i++;
        //     }
        // }
        // int a = 0, b =0;
        // for(int i = 0;i < n;i++){
        //     for(int j = 0;j < n;j++){
        //         a = a + j;
        //     }
        // }
        // for ( k =0; k < n;k++){
        //     b = b+k;
        // }

        // public void solve(int n){
        //     for(int i=0;i<Math.pow(2,n);i++){
        //         int j=i;
        //         while(j>0){
        //             j -= 1;
        //         }
        //     }
        // }

        // for(int i =0; i < n;i++){
        //     for(int j = i-1;j >=0;j++){
        //         ans += i+j;
        //     }
        // }

    }
    
}
