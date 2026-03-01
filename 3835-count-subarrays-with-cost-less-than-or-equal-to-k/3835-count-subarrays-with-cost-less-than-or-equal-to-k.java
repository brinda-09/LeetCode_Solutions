class Solution {
    public long countSubarrays(int[] nums, long k) {
        Deque<Integer> minpq=new ArrayDeque<>();
        Deque<Integer> maxpq=new ArrayDeque<>();
        long res=0;
        int l=0;
        for(int r=0;r<nums.length;r++){
            while(!minpq.isEmpty()&&nums[minpq.peekLast()]>=nums[r])
                minpq.pollLast();
            minpq.addLast(r);
            while(!maxpq.isEmpty()&&nums[maxpq.peekLast()]<=nums[r])
                maxpq.pollLast();
            maxpq.addLast(r);
            while((long)(r-l+1)*(nums[maxpq.peekFirst()]-nums[minpq.peekFirst()])>k){
                if(maxpq.peekFirst()==l)
                maxpq.pollFirst();
                if(minpq.peekFirst()==l)
                minpq.pollFirst();
                   l++;
            }
             res+=r-l+1;
        }
        return res;
    }
}