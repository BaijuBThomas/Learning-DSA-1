import java.lang.*;
import java.util.*;

public class contest2 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value for N : ");
        int N = sc.nextInt();

        for(int i = 1;i<=N;i++){
            int a =1;
        for(int j = 1;j<=N-i;j++){
            System.out.print(" ");
        }
        for(int k = 1;k<=i;k++){
            System.out.print(a+" ");
            a++;
        }
        System.out.println();
        }
    }
    
}
