class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start=0;
        int end=0;
        int maxlen=0;
        HashMap<Character,Integer> map=new HashMap<>();
        while(end<s.length()){
            char left=s.charAt(end);
            map.put(left,map.getOrDefault(left,0)+1);
            while(map.get(left)>1){
              char ch=s.charAt(start);
              map.put(ch,map.getOrDefault(ch,0)-1);
              start++;
            }
            maxlen=Math.max(maxlen,end-start+1);
            end++;
        }
        return maxlen;
    }
}