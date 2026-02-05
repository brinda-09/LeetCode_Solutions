class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null||strs.length==0)
        return "";
        int len=strs[0].length();
        for(int i=1;i<strs.length;i++){
            int j=0;
            while(j<len&&j<strs[i].length()&&strs[0].charAt(j)==strs[i].charAt(j)){
                j++;
            }
            len=j;
        }
        return strs[0].substring(0,len);
    }
}