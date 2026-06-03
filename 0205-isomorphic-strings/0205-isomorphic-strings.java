class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Integer> maps=new HashMap<>();
        HashMap<Character,Integer> mapt=new HashMap<>();
        for(int i=0;i<s.length();i++){
           if(!maps.containsKey(s.charAt(i))){
            maps.put(s.charAt(i),i);
           }
           if(!mapt.containsKey(t.charAt(i))){
            mapt.put(t.charAt(i),i);
           }
           if(!maps.get(s.charAt(i)).equals(mapt.get(t.charAt(i))))
           return false;
        }
        return true;
    }
}