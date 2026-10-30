class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int max1=Integer.MIN_VALUE;
        int sum=0;
        int tot=0;
        for(int i=0;i<nums.length;i++){
             sum+=nums[i];
             tot+=nums[i];
             max1=Math.max(max1,sum);
             if(sum<0){
                sum=0;
             }
        }
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=(nums[i]*-1);
            
        }
        int max2=Integer.MIN_VALUE;
        int sum1=0;
        for(int i=0;i<arr.length;i++){
             sum1+=arr[i];
             
             max2=Math.max(max2,sum1);
             if(sum1<0){
                sum1=0;
             }
        }
        max2=(max2*-1);
if (max1 < 0) {
    return max1;
}
        return Math.max(max1,tot-max2);
    }
}