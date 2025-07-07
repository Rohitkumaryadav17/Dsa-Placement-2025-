/// Sub array : continous part of array 
/// 2,    2,3  2,3,4   2,3,4,5,6
/// 3 ,   34 , 345 3456
/// 4 , 45 456
/// 5, 56
/// 6   

public class subarray {

    public static void  Solution(int arr[]){
        for(int  i=0;i<arr.length;i++){   /// start 
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(arr[k]+" "); /// subaray

                }
                System.out.println();

            }
            System.out.println();

        }

    }
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6};
        Solution(arr);
    }
    
}
