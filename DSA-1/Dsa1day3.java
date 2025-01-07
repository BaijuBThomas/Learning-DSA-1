import java.lang.*;
import java.util.*;

public class Dsa1day3 {
    //carry forward without optimizes O(n2)

    // public static int pairOfTheArray(char ch[]){
    //     int n = ch.length;
    //     int count = 0;
    //     for(int i = 0; i < n;i++){
    //         if(ch[i] == 'a'){
    //             for(int j = i+1; j < n;j++){
    //                 if(ch[j] == 'g'){
    //                     count = count+1;
    //                 }
    //             }
    //         }
           
    //     }
    //     return count;
    // }
 // carry forward with optimized O(n)
    public static int pairOfTheArray(char ch[]){
        int n = ch.length;
        int frequency = 0;
        int count = 0;

        for(int i = n-1;i >= 0;i--){
            if(ch[i] == 'g'){
                frequency = frequency + 1;
            }
            else if(ch[i] == 'a'){
                count = count + frequency;
            }
        }
        return count;
    }

    public static void main(String argu[]){
        char ch[] = {'b', 'a', 'a', 'g', 'd', 'c', 'a', 'g'};

       int count =  pairOfTheArray(ch);
       System.out.println("The total number of pair of a:g - "+  count);
    }
    
}
