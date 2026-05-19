class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        HashSet<Integer> number=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            number.add(nums1[i]);
        }
        int mini=Integer.MAX_VALUE;
        for(int j=0;j<nums2.length;j++){
                    if(number.contains(nums2[j])){
                        mini=Math.min(nums2[j],mini);
                    }
                }
            
        return mini==Integer.MAX_VALUE?-1:mini;
    }
}