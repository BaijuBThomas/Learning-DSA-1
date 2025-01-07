import java.lang.*;
import java.util.*;

public class Hash1 {
   public static void main(String argu[]){
    // HashSet<Integer> hs = new HashSet<>();
    HashMap<Integer , Integer> hs = new HashMap<>();

    hs.put(10,100);
    hs.put(20,200);
    hs.put(30,300);
    hs.put(40,400);
     hs.remove(20);
     if(hs.containsKey(80)){
        System.out.println("400 is present ");
     }
     else{
        System.out.println("not present");
     }

    System.out.println(hs);
    System.out.println(hs.size());
   } 
}
