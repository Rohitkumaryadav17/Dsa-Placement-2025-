import java.util.*;
class solution{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter side  of sqaure :");
        int a=sc.nextInt();
        System.out.print("Enter the number :");
       int b=sc.nextInt();
        System.out.print("Enter the number :");
       int c=sc.nextInt();
       int avg=(a+b+c)/3;
       System.out.println("Avrage of the number is : "+avg);   
  int per=4*a*a;
  System.out.println("perimeter of square : "+per);
System.out.print("enter the price of pencile :");
     float a=sc.nextFloat();
     System.out.print("enter the price of eraser :");
    float b=sc.nextFloat();
    System.out.print("enter the price of pen :");
    float c=sc.nextFloat();
    float totalcost=a+b+c;
    // System.out.println("total cost of Item is : "+totalcost);
    double netprice=totalcost+(totalcost*0.18); // formula 
    System.out.println("price after 18% GST : "+netprice);
 int $=6;
 System.out.println($);



 

    }
}