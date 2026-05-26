// Find union of two arrays

public class unionOfTwoArrays {
    public static void main(String[] args){
        int arr1[] ={1,2,3,4,5,6};
        int arr2[]= {5,6,7,8,9,10};
        int n1=arr1.length;
        int n2=arr2.length;

        int union[]= new int[n1+n2];

        int k=0;

        for(int i=0;i<n1;i++){
            union[k]=arr1[i];
            k++;
        }

        for(int i=0;i<n2;i++){
                boolean found= false;

            for(int j=0;j<k;j++){
                if(arr2[i]==union[j]){
                    found=true;
                    break;
                }
            }
                if(!found){
                    union[k]=arr2[i];
                    k++;
                
            }
        }
        
        for(int i=0;i<k;i++){
            System.out.print(" "+ union[i]);
        }


    }
}
