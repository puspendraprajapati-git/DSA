public class removeDuplicateElementFromSortedArray {
        public static void main(String[] args){

            int arr[]={5,6,81,2,1,5, 5, 5};
            int n=arr.length;
            for(int i=0;i<n;i++){
                for(int j=0;j<n-i-1;j++){
                    if(arr[j]>arr[j+1]){
                    int temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    }
                }
            }
            System.out.println("Sorted array:");
            for (int i : arr) {
                System.out.print(" "+ i);
            }

            int k=0;
            for(int j=1;j<n;j++){
                if(arr[k]!=arr[j]){
                    k++;
                    arr[k]=arr[j];
                }
            }
            System.out.println();
            System.out.println("Removed duplicate array:");
            for(int i=0;i<=k;i++){
                System.out.print(" "+arr[i]);
            }
        }
}
