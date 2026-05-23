// Search an element using binary search


public class binarySearch {  
    public static void main(String[] args){
        int arr[]={10,20,50,60,70,80,90};

        int left=0;
        int right=arr.length-1;
        int mid= (left+right)/2;
        int ele=50;

        for(int i=0;i<arr.length;i++){

            if(ele==arr[mid]){
                System.out.println("element is at: "+ arr[mid]);
            }
        }
    }
}
