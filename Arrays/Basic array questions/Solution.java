public class Solution {
    public static int findDuplicate(int[] nums) {
        int n=nums.length;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                    if(nums[i]==nums[j]){
                        return nums[i];
                    }
            }
        }

        return -1;
    }

    public static void main(String[] args){
        int[] nums={1,2,5,5,4};

        int dup=findDuplicate(nums);

        System.out.println("Duplicate ele:"+dup);
    }

}