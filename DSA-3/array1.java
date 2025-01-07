import java.lang.*;
import java.util.*; 
import java.util.Arrays;


public class array1 {
    //function to find the sum 
    // static void printArray(int ap[]){
    //     Scanner sc = new Scanner(System.in);
    //     int sum = 0;
    //     for(int i = 0;i < ap.length;i++){
    //         System.out.print("Enter the value for array index : "+ i + " : ");
    //         ap[i] = sc.nextInt();
    //         sum = sum +ap[i];
    //     }
    //     System.out.println(sum);
        
    // }
    /*---//function to find k 
    static int frequency(int ar[], int a){
        int f = 0;
        for(int i = 0;i < ar.length;i++){
            if(ar[i] == a){
                f=f+1;
            }
        }
        return f;
    }
        
        //max function 
        static int max(int arr[]){
            int m = arr[0];
            for(int i = 1;i < arr.length;i++){
                if(m < arr[i]){
                    m = arr[i];
                }
            }
            return m;
        }
        */
        // insert and element in arrya 

        public static int[] insertValue(int ar[], int x, int y){
            int len = ar.length;
            int insert = x-1;

            int result[] = new int[len+1];

            for(int i = 0;i < insert;i++){
                result[i] = ar[i];
            }
            result[insert]= y;

            for(int i = insert+1; i<= len;i++){
                result[i] = ar[i-1];
            }
            return result;
        }
    public static void main(String[] argu ){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array arr : " );
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0;i < n;i++){
            System.out.print("Enter the value for array index : "+ i + " : ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the index number X : " );
        int X = sc.nextInt();
        System.out.print("Enter the value of Y  : " );
        int Y = sc.nextInt();
        int [] pri = insertValue(arr, X,Y);
        System.out.println(Arrays.toString(arr));
        System.out.println("The value of the new array : "+Arrays.toString(pri));
    }
    
}
