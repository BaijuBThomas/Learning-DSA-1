import java.lang.*;
import java.util.*;
import java.util.ArrayList;

public class ArrayList1day3 {

    public static ArrayList<Integer> addingOne(ArrayList<Integer>ar){
        int n = ar.size();

        for(int i = 0;i < n;i++){
            int x = ar.get(i);
            ar.set(i,x+1);
        }
        return ar;
    }
    public static void main(String args[]){

        ArrayList <Integer> arr = new ArrayList<>();

        arr.add(5);
        arr.add(19);
        arr.add(40);
        arr.add(60);
        // arr.add(50);

        // arr.remove(2);
        System.out.println("original ArrayList : "+arr);
    //    System.out.println(arr.get(3));
        ArrayList<Integer> mad = addingOne(arr);
        
        System.out.println("updated Arraylist : "+mad);
        // System.out.println("print arrayList"+arr);
        // System.out.println(arr.size());

        ArrayList<Integer> tem = new ArrayList<>();
        tem.add(99);
        tem.add(9);
        tem.add(229);
        tem.add(4);
        tem.add(199);
        System.out.println("original data before sort : "+ tem);
        //ascending order
        Collections.sort(tem);
        System.out.println("data after sort ascending"+tem);
        //decending order
        Collections.sort(tem, Collections.reverseOrder());
        System.out.println("decending order : "+tem);
        


    }
    
}
