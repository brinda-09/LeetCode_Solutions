class Solution {
    public long maxSubarraySum(int[] nums, int k) {
        return Math.max(solve(nums,k,true),solve(nums,k,false));
    }
    public long solve(int[] nums,int k,boolean divide){
        long next0=Long.MIN_VALUE;
        long next1=Long.MIN_VALUE;
        long next2=Long.MIN_VALUE;
        long ans=Long.MIN_VALUE;
        for(int i=nums.length-1;i>=0;i--){
            int curr=nums[i];
            long mod=divide?(long)curr/k:(long)curr*k;
            long dp2=Math.max(curr,curr+Math.max(0L,next2));
            long dp1=Math.max(Math.max(mod,mod+Math.max(0L,next1)),Math.max(mod,mod+Math.max(0L,next2)));
            long dp0=Math.max(Math.max(curr,curr+Math.max(0L,next0)),Math.max(mod,mod+Math.max(0L,next1)));
            next0=dp0;
            next1=dp1;
            next2=dp2;
            ans=Math.max(ans,dp0);
        }
        return ans;
        
    }
}