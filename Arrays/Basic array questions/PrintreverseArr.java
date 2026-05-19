public class reverseArr {
    
    public static void reverseArray(int arr[], int n){
        

        for(int i=n-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }


    public static void main(String[] args){

        int arr[]= {10,5,6,9,47,88,45};
        int n = arr.length;

        reverseArray(arr, n);

    }

}
