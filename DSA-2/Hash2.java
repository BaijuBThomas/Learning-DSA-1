import java.lang.*;
import java.util.*;

public class Hash2 {
    public static boolean zeroSub(int ar[]){
        int n = ar.length;
        HashSet<Integer>hs = new HashSet<>();
        hs.add(0);
        int psum[] = new int[n];
        psum[0] = ar[0];

        for(int i = 1;i < n;i++){
            psum[i] = psum[i-1] + ar[i];
        }

        for(int i = 0;i < n;i++){
            if(hs.contains(psum[i])){
                return true;
            }
            else{
                hs.add(psum[i]);
            }
        }
        return false;
    }
    public static void main(String argu[]){
        int ar[]={2,-5,3,6};

      boolean hr =   zeroSub(ar);
      System.out.println(hr);
    }
}
