import java.util.ArrayList;

public class ArrayList2day6 {

    public static ArrayList<ArrayList<Integer>> evenNumber(ArrayList<ArrayList<Integer>> ar){

        int n = ar.size();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        
        for(int i = 0;i < n;i++){
            ArrayList<Integer> row = new ArrayList<>();
            int m = ar.get(i).size();
            for(int j = 0;j < m;j++){
                
                if((ar.get(i).get(j)) % 2 == 0){
                  row.add(ar.get(i).get(j));
                }
            }
            ans.add(row);
        }
        return ans;
    }

    public static void main(String argu[]){

        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

        ArrayList<Integer>inner1 = new ArrayList<>();
        inner1.add(3);
        inner1.add(10);
        inner1.add(2);
        
        ArrayList<Integer>inner2 = new ArrayList<>();
        inner2.add(2);
        inner2.add(7);
        inner2.add(6);
        inner2.add(9);
        inner2.add(4);
        ArrayList<Integer>inner3 = new ArrayList<>();
        inner3.add(18);
        inner3.add(20);
        inner3.add(11);
        inner3.add(6);
        
        arr.add(inner1);
        arr.add(inner2);
        arr.add(inner3);

      

        for(int i = 0;i < arr.size();i++){

            for(int j = 0;j < arr.get(i).size();j++){
                System.out.print(arr.get(i).get(j)+ " ");
            }
            System.out.println();
        }
        System.out.println();
        ArrayList<ArrayList<Integer>> ans = evenNumber(arr);

        // System.out.println(ans);

        for(int i = 0;i < ans.size();i++){

            for(int j = 0;j < ans.get(i).size();j++){
                System.out.print(ans.get(i).get(j)+ " ");
            }
            System.out.println();
        }


    }
    
}
