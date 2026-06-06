class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] res=new int[nums.length];
        int sum=0;
        int temp=0;
        for(int i=0;i<nums.length;i++){
         sum+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            sum-=nums[i];
            res[i]=Math.abs(temp-sum);
            temp+=nums[i];
        }
        return res;
    }
}