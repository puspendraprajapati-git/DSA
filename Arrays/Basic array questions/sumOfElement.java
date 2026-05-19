class sumOfElement{

    public static int sumOfEle(int arr[] , int n){
        int sum=0;

        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        return sum;
    }


    public static void main(String[] args){

        int arr[]= {10,20,30,40,50};
        int size= arr.length;


        System.out.println(sumOfEle(arr, size));
        
    }   

}