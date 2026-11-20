class Solution {
    public int compress(char[] chars) {
        int n=chars.length;
        if (n==1){
            return 1;
        }
        int i=0;
        int j=0;
        StringBuilder sb=new StringBuilder();
        while(i<n){
            char ch=chars[i];
            int count=1;
            while(i<n-1&&chars[i]==chars[i+1]){
                i++;
                count++;
            }
            chars[j++]=ch;
            if(count>1){
                sb.append(count);
                while(sb.length()>0){
                    chars[j++]=sb.charAt(0);
                    sb.deleteCharAt(0);
                }
            }
            i++;
        }
        return j;
    }
}