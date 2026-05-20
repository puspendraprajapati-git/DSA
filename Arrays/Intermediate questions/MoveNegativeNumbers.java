public class MoveNegativeNumbers {

    static void moveNegativeNum(int[] arr){

        int n= arr.length;
        int temp;

        for(int i=0; i<n;i++){

            if(arr[i]<0){
                temp=arr[n-1];
                arr[n-1]=arr[i];
                arr[i]=temp;
            n--;
                i--;
            }
        }

    }


    public static void main(String[] args){
        int arr[] = {10,-1,-5,10,15,-8,-6,-5};

        moveNegativeNum(arr);
        
        for (int i : arr) {
            System.out.print(" "+i);
        }

    }
}
