class Solution {
    public String addBinary(String a, String b) {
        char[] chararrA=a.toCharArray();
        char[] chararrB=b.toCharArray();
        int i=chararrA.length-1;
        int j=chararrB.length-1;
        StringBuilder sb=new StringBuilder();
        int carry=0;
        while(i>=0||j>=0||carry>0){
            int anum=i>=0?chararrA[i]-'0':0;
            int bnum=j>=0?chararrB[j]-'0':0;
            int sum=anum+bnum+carry;
            int dig=sum%2;
            carry=sum/2;
            i--;
            j--;
            sb.append((char)(dig+'0'));
        }
        return sb.reverse().toString();
    }
}