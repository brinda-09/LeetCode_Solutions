class Solution {
    public String reverseVowels(String s) {
        StringBuilder sb=new StringBuilder(s);
        int i=0;
        int j=s.length()-1;
        String vow="aeiouAEIOU";
        while(i<j){
          while(i<j&&vow.indexOf(sb.charAt(i))==-1){
            i++;
          }
          while(i<j&&vow.indexOf(s.charAt(j))==-1){
            j--;
          }
          char temp=s.charAt(i);
          sb.setCharAt(i,s.charAt(j));
          sb.setCharAt(j,temp);
          i++;
          j--;

        }
        return sb.toString();
    }
}