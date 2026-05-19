public class minElement {

    public static int findMinEle(int arr[], int n){
        int min= arr[0];
        for(int i=1;i<n;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }


    public static void main(String[] args){
        int arr[]= {10,5,1,90,5,6,4,9};

        int size= arr.length;

        System.out.println(findMinEle(arr, size));






    }
}
