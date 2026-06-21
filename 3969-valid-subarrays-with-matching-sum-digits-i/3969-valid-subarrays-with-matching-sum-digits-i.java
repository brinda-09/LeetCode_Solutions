class Solution {
    public int countValidSubarrays(int[] nums, int x) {
        long[] prefix=new long[nums.length+1];
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            prefix[i+1]=prefix[i]+nums[i];
        }
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                long sum=prefix[j+1]-prefix[i];
                if(isvalid(sum,x)){
                   cnt++;
                }
            }
        }
        return cnt;
    }
    public boolean isvalid(long sum,int x){
        if(sum<0){
            sum=-sum;
        }
        int lastdig=(int)(sum%10);
        if(lastdig!=x){
            return false;
        }
        while(sum>=10){
            sum/=10;
        }
        return sum==x;
    }
}