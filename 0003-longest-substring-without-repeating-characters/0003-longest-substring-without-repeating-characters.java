class Solution {
    public int lengthOfLongestSubstring(String s) {
       int start=0;
       int end=0;
       int maxlen=0;
       HashMap<Character,Integer> map=new HashMap<>();
       while(end<s.length()){
          map.put(s.charAt(end),map.getOrDefault(s.charAt(end),0)+1);
          while(map.get(s.charAt(end))>1){
             map.put(s.charAt(start),map.get(s.charAt(start))-1);
             start++;
          }
          maxlen=Math.max(maxlen,end-start+1);
          end++;
       }
       return maxlen;
    }
}