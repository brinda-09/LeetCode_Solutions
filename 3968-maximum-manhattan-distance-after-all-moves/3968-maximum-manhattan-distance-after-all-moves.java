class Solution {
    public int maxDistance(String moves) {
        int[] freq=new int[128];
        for(char ch:moves.toCharArray()){
            freq[ch]++;
        }
        return Math.abs(freq['D']-freq['U'])+
            Math.abs(freq['L']-freq['R'])+freq['_'];
    }
}