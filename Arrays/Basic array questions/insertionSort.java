public class insertionSort {
    public static void main(String[] args){
        int arr[]={10,5,6,8,1,14,54,61};

        int n= arr.length;

        for(int i=1;i<n;i++){
            int curr=arr[i]; //5  //2nd pass 6
            int prev=i-1; //i=0  // i=1s
            while(prev >=0 && arr[prev] >curr  ){   //0 >= 0 && 10 > 5  //1>=0 && 5 > 6 no 
                arr[prev+1]=arr[prev];   //arr[1]=a[0] 1->10
            prev--;

            }
            arr[prev+1]=curr; // arr[0]= 5
        }  // 1st pass= [5,10,6,8] 2nd pass=[] 

        for (int i : arr) {
            System.out.print(" "+ i);
        }
    }
}
