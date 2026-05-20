public class checkIfArraySorted {

    public static void sortedArr(int arr[]){
        for(int i=0;i<arr.length-2; i++){
            if(arr[i]>arr[i+1]){
                System.out.println("Array is not sorted");
                return ;
            }
        }
        System.out.println("Array is sorted");
    }


    public static void main(String[] args){
        int arr[]= {10,5,20,30,40,50,60};

        sortedArr(arr);

    }
}
