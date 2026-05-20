// Copy one array into another

class CopyArrayIntoOther{
    
    public static void copyFunction(int arr1[], int arr2[]){
        int n=arr1.length;
        for(int i=0 ; i<n;i++){
            arr2[i]=arr1[i]; 
        }

    }
    
    public static void main(String[] args){
        int arr1[]={10,20,30,40,50,60};
        int arr2[]=new int[arr1.length];

        copyFunction(arr1, arr2);

        for (int i : arr1) {
            System.out.print(" "+ i );
        }
            System.out.println();

        for (int i : arr2) {
            System.out.print(" "+i);
        }

    }
}