class Solution {
    public int numberOfSpecialChars(String word) {
        int[] lastlower=new int[26];
        int[] firstupper=new int[26];
        Set<Integer> invalid=new HashSet<>();
        Arrays.fill(lastlower,-1);
        Arrays.fill(firstupper,-1);
        for(int i=0;i<word.length();i++){
            int ch=word.charAt(i);
            if(ch>='a'&&ch<='z'){
                int idx=ch-'a';
                lastlower[idx]=i;
                if(firstupper[idx]!=-1){
                    invalid.add(idx);
                }
            }else{
                int idx=ch-'A';
                if(firstupper[idx]==-1){
                    firstupper[idx]=i;
                }
            }
        }
        int splcount=0;
        for(int i=0;i<26;i++){
            if(lastlower[i]!=-1&&firstupper[i]!=-1&&!invalid.contains(i)){
                splcount++;
            }
        }
        return splcount;
    }
}