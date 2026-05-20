// Move all zeros to end


public class MovingAllZeroToEnd {

    public static void moveAllTheZeroes(int[] arr){
        
        int n = arr.length;
        
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                for(int j=i;j<n-1;j++){
                    arr[j]=arr[j+1];
                }
            arr[n-1]=0;
                i--;
            n--;
            }
            

        }


    }

    
    public static void main(String[] args){

        int[] arr={10,0,25,6,0,89};
        moveAllTheZeroes(arr);

        for (int i : arr) {
            System.out.print(i+" ");
        }

    }

}
