public class reverseArray {

    public static void reverseArray(int[] arr, int n){

        int start=0;
        int end= n-1;

        while(start < end){

            int temp;
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            
            start++;
            end--;
        }
    }


    
    public static void main(String[] args){

        int arr[]= {10,20,55,66,88,99};
        int n = arr.length;

        reverseArray(arr, n);

        // for (int i : arr) {
        //     System.out.print(i+" ");
        // }

        for(int i=0; i<n; i++){
            System.out.print(arr[i]);
        }

    }
}

