public class main {
    public static void main(String[] args){
        int arr[]={10,20,30,40,50,60};
        int n= arr.length;
        int k=2;

        for(int i=0;i<k;i++){
            int temp= arr[0];
            for(int j=0;j<n-1;j++){
                arr[j]=arr[j+1]; 
            }
            arr[n-1]=temp;
        }
        for (int i : arr) {
        System.out.print(" "+ i);
        }

    }
    
}