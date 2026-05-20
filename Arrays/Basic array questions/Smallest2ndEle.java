// Find second smallest element


public class Smallest2ndEle {


    public static int secondSmallestEle(int arr[]){
        if(arr.length<2){
            return -1;
        }
        int n=arr.length;
        int smallest=Integer.MAX_VALUE;
        int secondSmallest= Integer.MAX_VALUE;

        

        for(int i= 0; i<n;i++){
            if(arr[i]<smallest){
                secondSmallest=smallest;
                smallest= arr[i];
            }
            else if(arr[i]<secondSmallest && arr[i] != smallest){
                secondSmallest=arr[i];
            }
        }
        return secondSmallest;
    }

    public static void main(String[] args){
        int arr[] ={1,2,8,9,6,48,55,69};

        int ele=secondSmallestEle(arr);

        System.out.println(ele);

        
    }
}