import java.lang.*;
import java.text.NumberFormat;
import java.util.*;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input : ");
        int value = sc.nextInt();
        System.out.print("enter the value for x : ");
        int x = sc.nextInt();
        System.out.print("Enter the value for y : ");
        int y = sc.nextInt();
        
        if(value%x ==0 && value%y == 0){
            System.out.println("FizzBuzz");
        }
        else if(value%x == 0){
            System.out.println("Fizz");
        }
        else if(value%y == 0){
            System.out.println("Buzz");
        }
        else{
            System.out.print(value+",");
            System.out.print(x+" ,");
            System.out.print(y);
        }  
      
        
    }
}

