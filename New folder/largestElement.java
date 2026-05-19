
class Solution{

    public static int findLargestElement(int[] arr, int n){
        int max= arr[0];

        for(int i=1;i<n;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }


        return max;
    }

}




class largestElement{

    public static void main(String[] args){

        int[] arr= {10,20,5,15,14,98};
        int n= arr.length;
        int max= Solution.findLargestElement(arr, n);
        System.out.println("The largest Element is:"+max);



    }



}