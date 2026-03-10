class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res=new int[nums.length];
        int right=nums.length-1;
        int left=0;
        int pos=nums.length-1;
        while(left<=right){
            int leftpq=nums[left]*nums[left];
            int rightpq=nums[right]*nums[right];
            if(leftpq>rightpq){
                res[pos]=leftpq;
                left++;
            }else{
                res[pos]=rightpq;
                right--;
            }
            pos--;
        }
        return res;
    }
}