// Find frequency of each element



public class FrequencyOfElements {
    public static void main(String[] args){
        int arr[] = {1,2,2,3,1,4,2};

        for(int i=0;i<arr.length;i++){
            int count= 1;

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

            System.out.println(arr[i]+"->"+count);
        }
    }
}
