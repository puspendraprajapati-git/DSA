public class mergeTwoSortedArr {

    public static void main(String[] args){

        int arr1[]= {10,20,30,40,50,60,80};
        int n=arr1.length;
        int arr2[]={55,33,66,55,88};
        int m= arr2.length;
        int mergeArr[] = new int[arr1.length+arr2.length];
        
        for(int i=0;i<n;i++){
            mergeArr[i]=arr1[i];
        }
        for(int i=0;i<m;i++){
            mergeArr[n+i]=arr2[i];
        }

        for (int i : mergeArr) {
            System.out.print(i+" ");
        }

    }

}
