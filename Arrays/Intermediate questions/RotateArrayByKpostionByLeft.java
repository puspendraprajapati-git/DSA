// Rotate array by K positions left

public class RotateArrayByKpostionByLeft {

    public static void RotateArrayByK(int arr[], int k){
        int n =arr.length;
        k=k%n;
        for(int i=0;i<k;i++){

        int temp=arr[0];

        for(int j=0; j<n-1;j++){
                arr[j]= arr[j+1];            
        }
        
        arr[n-1]= temp;
        }
    }


    public static void main (String[] args){
        int k=2;

           int[] arr = {10, 20, 30, 40, 50};


        RotateArrayByK(arr,k);

        for (int i : arr) {
            System.out.print(i+" ");
        }



    }

}
