class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int temp[]= new int[n1+n2];
        int k=0;
        
        for(int i=0;i<n1;i++){
            boolean alreadyPresent= false;

            //check for duplicates
            for(int x=0;x<k;x++){
                if(temp[x]==nums1[i]){
                    alreadyPresent=true;
                    break;
                }
            }
            //if present move to next i value
            if(alreadyPresent){
                continue;
            }

            for(int j=0;j<n2;j++){
                if(nums1[i]==nums2[j]){
                    temp[k]=nums1[i];
                    k++;
                     break;

                }
            }



        }
            int ans[]=new int[k];

        for(int i=0;i<k;i++){
            ans[i]=temp[i];
        }
        return ans;
    }
}