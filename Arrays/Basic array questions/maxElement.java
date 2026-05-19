



class maxElement{

    static int findMaxElement(int[] arr , int n){
        int max=arr[0];

        for(int i=1; i<n; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }


        return max;
    }

    public static void main(String[] args){

        int[] arr= {10,2050,10,30,50,90000};
        int size= arr.length;

        // System.out.println(size);

        int maxEle=findMaxElement(arr, size);
        System.out.println(maxEle);

    }


}