// Rotate array left by 1 position

public class RotateArrayBy{

    public static void RotateArr(int[] arr){
        int n= arr.length;
            int temp= arr[0];

        for(int i=0; i<n-1;i++){
            arr[i]= arr[i+1];

            }
            arr[n-1]=temp;
        }

    


    public static void main(String[] args){

        int arr[]= {10,20,5,60,30};

        RotateArr(arr);

        for (int i : arr) {
            System.out.print(i+" ");
        }


    }


}