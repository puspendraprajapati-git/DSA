public class countEvenOdd {

    static void countEvenOddNum(int arr[]){
        int n= arr.length;
        int countEven=0;
        int countOdd=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                countEven++;
            }
            else{
                countOdd++;
            }
        }
        System.out.println("Even:" + countEven+ " Odd:"+ countOdd);
    }

    public static void main(String[] args){

        int arr[] = {10,20,5,6,8,99,78};

        countEvenOddNum(arr);

    }

}
