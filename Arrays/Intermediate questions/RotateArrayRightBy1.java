// Rotate array right by 1 position

public class RotateArrayRightBy1 {
     public static void RotateArr(int[] arr){
        int n= arr.length;
        int temp= arr[n-1];

        for(int i=n-1;i>0;i--){
            arr[i]= arr[i-1];
        }
            arr[0]=temp;
    }

    public static void main(String[] args){

        int arr[]= {10,20,5,60,30}; //{30,10,20,5,60}

        RotateArr(arr);

        for (int i : arr) {
            System.out.print(i+" ");
        }


    }

}
