public class reverse {
public static void Reverse(int arr[]){
    int first = 0, last=arr.length-1;
    while(first< last){
        // swapp 
        int temp=arr[last];
        arr[last]=arr[first];
        arr[first]=temp;
        first++;
        last--;
    }   
  
 }
    public static void main(String[]args){
        int arr[]={2,3,4,6};
        Reverse(arr);
        for(int i=0;i<=arr.length-1;i++ ){
            System.out.print(arr[i]+ " " );

        }
    
    }
    
}
// TC ==O(n)
// Sc=O(1) constant

