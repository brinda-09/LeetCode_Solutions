class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] res=new int[2];
        int[] freq=new int[nums.length+1];
        for(int n:nums){
            freq[n]++;
        }
        for(int i=1;i<=nums.length;i++){
            if(freq[i]==2){
                res[0]=i;
            }
            if(freq[i]==0){
                res[1]=i;
            }
        }
        return res;
    }
}