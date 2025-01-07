import java.util.*;


public class Dsa1Equilibrium {

    public static int solve(int ar[]){
        int n = ar.length;
        int psum[] = new int[n];
        psum[0] = ar[0];

        for(int i = 1;i < n;i++){
            psum[i] = psum[i-1]+ar[i];
        }
        int count = 0;
        for(int i = 0;i < n;i++){
            int left;
            if(i == 0){
                left = 0;
            }
            else{
                left = psum[i-1];
            }
            int right = psum[n-1]-psum[i];
            if(left == right){
                count = count + 1;
            }
        }
        return count;
    }
    public static void main(String argu[]){
        int[] A = {-7,1,5,2,-4,3,0};
        System.out.println(solve(A));
        

      

    }
    
}
