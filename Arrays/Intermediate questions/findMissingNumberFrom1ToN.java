public class findMissingNumberFrom1ToN {

    public static int missingNumber(int[] nums, int N) {
       int xor1=0;
       int xor2=0;
        // int n=nums.length;

        for(int i=1;i<=N;i++){
            xor1^=i;

        }
        for(int i=0;i<N-1;i++){
            xor2 ^=nums[i];
        }

        return xor1^xor2;

    }

    public static void main(String[] args){
        int nums[]= {1,2,3,4,6};

        int ans=missingNumber(nums,6);

        System.out.println("Missing Number:"+ans);

    }




}    

