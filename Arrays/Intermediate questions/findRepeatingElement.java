public class findRepeatingElement {
    public static void main(String[] args){
        // Using nested loops 
        int arr[]={1,0,5,6,9,1,0};

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println("Repeating Elements:"+ arr[i]);
                }
            }
        }


    }
}
