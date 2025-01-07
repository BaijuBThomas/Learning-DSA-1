import java.util.Arrays;
 import java.lang.*;



public class array2day4 {
    //adding two matix i & j values 

    // public static int[][] addingMat(int arr1[][],int arr2[][]){
    //     int n = arr1.length;
    //     int m = arr1[0].length;
       

    //     int ar[][] = new int [n][m];

    //     for(int i = 0;i < n;i++){
    //         for(int j = 0;j < m;j++){
    //             ar[i][j] = arr1[i][j]+arr2[i][j];
    //         }
    //     }
    //     return ar;
    // }
    //* function for reverisn i,j into j,i */
    // public static int [][] reverseMat(int ar1[][]){
    //     int n = ar1.length;
    //     int m = ar1[0].length;

    //     int ans[][] = new int[m][n];

    //     for(int i = 0;i < n;i++){
    //         for(int j = 0;j < m;j++){
    //             ans[j][i] = ar1[i][j];

    //         }
    //     }
    //     return ans;
    // }

    public static int [][] reverseMat(int arr[][]){
        int n = arr.length;
        int m = arr[0].length;
        for(int i = 0;i < n;i++){
            int start = 0;
            int end = m-1;
            while(start < end){
                int temp = arr[i][start];
                arr[i][start] = arr[i][end];
                arr[i][end] = temp;
                start++;
                end--;
            }
        }
        return arr;
       
    }

    public static void main(String argu[]){
        int arr1[][] = {{7,2,3},{6,3,2},{1,4,5},{1,3,5}};
        // int arr2[][] = {{3,4},{7,2},{6,4}};

        // int ar[][] = addingMat(arr1,arr2);
        // System.out.println(Arrays.deepToString(ar));
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        
        // System.out.println(Arrays.deepToString(arr1));
        int ans[][] = reverseMat(arr1);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
       
        //  System.out.println(Arrays.deepToString(ans)); 

    }
    
}
