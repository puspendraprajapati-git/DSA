// search an element--> linear search

public class linearSearch {
    public static void main(String[] args){

        int arr[]={10,2,6,5,8,9};
        int ele=5;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==ele){
                System.out.println("Element is present at index:"+i);
            }
        }
    }
}
