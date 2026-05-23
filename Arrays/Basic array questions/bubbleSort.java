public abstract class bubbleSort {
    public static void main(String[] args){
        int arr[] = {1,5,9,4,1,2,3,5};
        int n=arr.length;

        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp; 
                }
            }
        }
        for (int i : arr) {
        System.out.print(i+" ");
        }
    }
}
