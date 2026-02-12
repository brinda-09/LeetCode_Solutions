class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
        return false;
        int rev=0;
        int input=x;
        while(input!=0){
            int dig=input%10;
            rev=rev*10+dig;
            input=input/10;
        }
        if(rev!=x)
        return false;
        return true;
    }
}