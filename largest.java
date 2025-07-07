public class largest{
    public static int getlargest(int arr[]){
        int largest=Integer.MIN_VALUE;//// -infiity
        int smallest=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(largest<arr[i]){
                largest=arr[i];

            }
            if(smallest>arr[i]){
                smallest=arr[i];

            }
        }
        System.out.println("Smallest valuse is :"+smallest);
        return largest;


    }
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6};
        System.out.println("largest value is :"+getlargest(arr));
        
        

        
    }
}
