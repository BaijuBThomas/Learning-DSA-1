import java.lang.*;
import java.util.*;

public class fun1 {

   static int fact(int a){
        int answer = 1;

        for(int i = 1;i <= a ;i++){
            answer = answer*i;
        }
        return answer;
          
    }
static int sum(int a,int b){
    int s = a+b;
    return s;
static void max(int N, int M){
    if(N>=M){
        System.out.println("N : "+ N +" is greater");
    }
    else{
        System.out.println("M : "+ M +" is greater");
    }
}
}
 static int factor(int a){
    int sum = 0 ;;
    for(int i = 1;i <= a;i++){
        if(a % i == 0){
            sum = sum +i;
        }
    }
    return sum;

// }
// static void swapNumber(int x,int y){
//  int c = 0;
//  c = x;
//  x = y;
//  y = c;
//  System.out.println("Swap value of N : "+x);
//  System.out.println("Swap value of M : "+y);

// }
    public static void main(String [] argu){
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the value of N : ");
        // int N = sc.nextInt();
        int arr[] = new int[5];
        

        // for(int i = 0;i < N;i++){
        //     System.out.println("enter the value : ");
    
        //     arr[i] = sc.nextInt();
        // }
        System.out.println("array value : "+ Arrays.toString(arr));
        Arrays.toString(arr)
        System.out.print("Enter the value of M : ");
        int M = sc.nextInt();
        //  swapNumber(N,M);
        System.out.print("Enter the value of o : ");
        int M = sc.nextInt();
         
        System.out.print("Enter the value of M : ");
        int M = sc.nextInt();
        //  max(N,M);
       
        int out1 = fact(3);
        System.out.println(out1);
        int out2 = fact(4);
        System.out.println(out2);

        
    }
    
}
