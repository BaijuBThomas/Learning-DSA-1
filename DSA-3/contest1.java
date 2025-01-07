import java.util.*;

public class contest1 {

    public static int uniqueElements(int ar[]){
        int n = ar.length;
        int count1 = 0;
        
        for(int i = 0;i < n;i++){
            int firstEle = ar[i];
            int count = 0;
            for(int j = 0;j < n;j++){
            int secondEle = ar[j];
            if(firstEle == secondEle){
                count = count+1;
            }
        
            }
            if(count > 1){
                count1++;

            }
           
        }
        return count1;
    }

    public static void main(String argu[]){
    

       int  arr []= {1,2,3,5,4,6,4,5,4,1,2,6,4,7,8,9,4,51,1,12};

       int ans =  uniqueElements(arr);
       System.out.println(ans);
    }
    
}
