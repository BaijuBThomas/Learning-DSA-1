import java.lang.*;
import java.util.*;


public class array11 {

    public static int[] remove(int ar[], int x){
        int n = ar.length;
        int cut = x-1;
        int result[] = new int[n-1];

        for(int i = 0;i < cut;i++){
            result[i] = ar[i];
        }
        for(int i = cut;i < n-1;i++){
            result[i] = ar[i+1];
        }
        return result;

    }
   public static void main(String argu[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value of array N : ");
    int n = sc.nextInt();

    int arr[] = new int[n];
    
    for(int i = 0;i < n; i++){
        System.out.print("enter the value of index : "+ i + " :");
        arr[i] = sc.nextInt();
    }

    System.out.print("Enter the index number which is to be deleted X : ");
    int x = sc.nextInt();
    int re[] = remove(arr,x);
    System.out.println("first arry value : " + Arrays.toString(arr));
    System.out.println("updated array value : "+ Arrays.toString(re));

   } 
}
