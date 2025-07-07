import java.util.*;
public class condition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int a=sc.nextInt();
        /// condition check//
        if(a>=0){
            System.out.println("Positive");

        }   
        else{
            System.out.println("Negative");
        }
    
   
    double temp=103.5;  // reason error  By default 
    if(temp>100){
        System.out.println("have fever");
    }
    else{
        System.out.println("no fever");
    }


    }
} 
