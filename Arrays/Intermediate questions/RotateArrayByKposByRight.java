public class RotateArrayByKposByRight {
    
    static void RotateArray(int arr[], int k){
        int n= arr.length;
        k=k%n;

       for(int j=0;j<k;j++){
        int temp=arr[n-1];

         for(int i=n-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
       }
    }
    
    
    public static void main(String[] args){

        int k=2;

        int arr[]= {10,20,30,40,50};
        RotateArray(arr, k);

        for (int i : arr) {
            System.out.print(i+" ");

        }

    }
}
