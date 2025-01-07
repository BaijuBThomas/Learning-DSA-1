 import java.util.*;
 import java.lang.*;
import java.util.ArrayList;


public class ArrayList1day3pro {

    // public static ArrayList<Integer> evenNumber(ArrayList<Integer>ar){
    //     int n = ar.size();
    //     ArrayList<Integer> ans = new ArrayList<>();
    //     for(int i = 0;i < n;i++){
    //         if((ar.get(i)) % 2 == 0){
    //          ans.add(ar.get(i));
    //         }

    //     }
    //     return ans;
    // }
    public static ArrayList<Integer> fre(ArrayList<Integer>al){
        int n = al.size();
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i = 0;i < n;i++){
            int count = 0;
            for(int j = 0;j < n;j++){
                if((al.get(i)) == (al.get(j))){
                    count = count+1;
                }
            }
            if(count == 1){
                ans.add((al.get(i)));
            }
            }
            return ans;
    }
    public static void main(String argu[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(10);
        list.add(8);
        list.add(2);
        list.add(8);
        list.add(10);
        list.add(11);
    
        ArrayList<Integer> ans = fre(list);
        System.out.println("Even number : "+ans);
    }
    
}
