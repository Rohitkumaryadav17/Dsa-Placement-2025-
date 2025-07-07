public class pair {
    public static void arrpair(int arr[]){
        for(int i=0;i<arr.length;i++){
            int curr=arr[i];
            for(int j=i+1;j<arr.length;j++){
                System.out.print("(" + curr + " ,"+ arr[j]+ ")");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6};
        arrpair(arr);
    }
    
}
//// logic 
// (2,3) (2,4) (2,5) (2,6)
// (3,4) (3,5) (3,6)
/// (4,5) (4,6)
// (5.6)
 /// Logic nested loop 
