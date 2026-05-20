// Find duplicate elements

public class DuplicateEle {
    public static void main(String[] args){

        int arr[]= {10,5,68,9,4,5,10,5,68,9};

        for(int i=0;i<arr.length;i++){
            int count=1;

            boolean alreadyVisited= false;

            for(int k=0;k<i;k++){
                if(arr[i]==arr[k]){
                    alreadyVisited=true;
                    break;
                }
            }
            
            if(alreadyVisited){
                continue;
            }
            
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
        // System.out.println(arr[i]+"->"+count);
        // System.out.println();
        
        if(count>1){
            System.out.println(arr[i]+"->"+ count+" ");
        }


        }
    }
}
