class Solution {
    public int totalWaviness(int num1, int num2) {
        int ans=0;
        for(int i=num1;i<=num2;i++){
            ans+=waviness(i);
        }
        return ans;
     
        
    }
    public int waviness(int num){
        String s=Integer.toString(num);
        int c=0;
        for(int i=1;i<s.length()-1;i++){
            int curr=s.charAt(i);
            if((curr>s.charAt(i-1)&&curr>s.charAt(i+1))||(curr<s.charAt(i-1)&&curr<s.charAt(i+1))){
                c++;
            }
        }
        return c;
    }
}