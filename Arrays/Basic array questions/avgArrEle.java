public class avgArrEle {
    
    static int avgSum(int arr[], int n){
        int avg=0;


        for(int i=0;i<n;i++){
            avg=avg+arr[i];
        }

        return avg/n;
    }

    public static void main(String[] args){
        int arr[]= {10,52,6,2,5,8,9,4};

        int n= arr.length;

        // avgSum(arr, n);

        System.out.println(avgSum(arr, n));

    }


}
