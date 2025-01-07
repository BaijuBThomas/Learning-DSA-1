import java.util.*;


public class Dsa1prefixsum {

    /* the tc of the above function is O(Q*E) not and ideal thing */
    // public static long[] rangeSum(int ar[], int mat[][]){
    //     int Q = mat.length;
    //     long answer[] = new long[Q];

    //     for(int i = 0; i < Q;i++){
    //         int start = mat[i][0];
    //         int end = mat[i][1];
    //         long sum = 0;
    //         for(int j = start;j <= end;j++){
    //             sum = sum +ar[j];
    //         }
    //         answer[i] = sum;
    //     }
    //     return answer;
    // }
    /*tc is O(n*q) sc - O(N) */

    public static long[] rangeSum(int ar[], int mat[][]){
        int n = ar.length;
        long psum[] = new long[n];
        psum[0] = ar[0];

        for(int i = 1;i < n;i++) {
            psum[i] = psum[i-1]+ar[i];
        }
        int q = mat.length;
        long answer[] = new long[q];
        for(int i = 0;i < q;i++){
            int start = mat[i][0];
            int end = mat[i][1];
            long value = 0;
            if(start == 0){
                value = psum[end];
            }
            else{
                value = psum[end] -psum[start-1];
            }
            answer[i] = value;
        }
        return answer;
        
    }

    public static void main(String argu[]){
        int ar[] = {-3,6,2,4,5,2,8,-9,3,1};
        int mat[][] = {{4, 8}, {3, 7}, {1, 3}, {7, 7}, {3, 6}, {0, 4}};

       long answer[] =  rangeSum(ar,mat);
       System.out.println(Arrays.toString(answer));

    }
}
// int n = A.length;
// long psum[] = new long[n];
// psum[0] = A[0];
// for(int i = 1;i < n;i++){
//     psum[i] = psum[i-1]+A[i];
// }
// int q = B.length;
// long answer[] = new long[q];

// for(int i = 0;i < q;i++){
//   int start = B[i][0];
//   int end = B[i][1];
//   long value;
//   if(start == 0){
//       value =psum[end];
//   }
//   else{
//       value = psum[end]-psum[start-1];
//   }
//   answer[i] = value;

// }

// return answer;