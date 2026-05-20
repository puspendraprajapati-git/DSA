// Find second largest element


public class secondLargestEle {
    
    public static int findSecondLargestEle(int arr[]){

        if (arr.length < 2) {
            return -1; // Array should have at least 2 elements
        }
        int largest= Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        int n=arr.length;


        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            }
            else if(arr[i]>secondLargest && arr[i]!=largest){
                secondLargest=arr[i];
            }
        }
        return secondLargest;
    }
    
    
    public static void main(String[] args){
        int arr[]= {10,40,55,5,6,9,85};

        int ele=findSecondLargestEle(arr);

        System.out.println(ele);



    }
}
