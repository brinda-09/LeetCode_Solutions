class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] freq=new int[128];
        int start=0;
        int end=0;
        int maxlength=0;
        while(end<s.length()){
            char ch=s.charAt(end);
            freq[ch]++;
            while(freq[ch]>1){
                freq[s.charAt(start)]--;
                start++;
            }
            int windowLength=end-start+1;
            maxlength=Math.max(maxlength,windowLength);
            end++;
        }
        return maxlength;

    }
}