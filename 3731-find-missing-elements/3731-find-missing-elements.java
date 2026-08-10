class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> li=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            int curr=nums[i];
            int next=nums[i+1];
            for(int j=curr+1;j<next;j++){
              li.add(j);
            }
        }
        return li;
    }
}