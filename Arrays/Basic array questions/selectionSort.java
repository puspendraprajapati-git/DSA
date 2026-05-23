public class selectionSort {
    public static void main(String[] args){
        int arr[]={10,5,6,8,9,11};

        int n=arr.length;

        for(int i=0;i<n-1;i++){
            int min_index=i;
            for(int j=i+1;j<n;j++){
                if(arr[min_index]>arr[j]){
                    min_index=j;
                }
            }
            // swap
            int temp=arr[i];
            arr[i]=arr[min_index];
            arr[min_index]=temp;
        }
        for (int i : arr) {
            System.out.print(" "+ i);
        }
    }
}
