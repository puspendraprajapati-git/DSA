// Rearrange positive and negative numbers alternatively

public class RearrangeTheNumbersInPosAndNeg {

    public static void RearrangeTheNumbers(int arr1[],int arr2[]){

        int n=arr1.length;
        int j=0;
        for(int i=0; i<n;i++){
            if(arr1[i]>0){
                arr2[j]=arr1[i];
                j++;
            }
        }
        for(int i=0; i<n;i++){
            if(arr1[i]<0){
                arr2[j]= arr1[i];
                j++;
            }
        }
    }


    public static void main(String[] args){

        int arr1[]={10,20,50, -231231,-9,4,-8,-9,10,60,-9999,-88778};
        int arr2[]=new int[arr1.length];

        RearrangeTheNumbers(arr1, arr2);

        for (int i : arr1) {
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i : arr2){
            System.out.print(i+" ");
        }

    }
}
