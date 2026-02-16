class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(isselfdividing(i)){
                res.add(i);
            }
        }
        return res;
    }
    public boolean isselfdividing(int x){
        int temp=x;
        while(temp!=0){
            int dig=temp%10;
            if(dig==0||x%dig!=0){
                return false;
            }
            temp/=10;
        }
        return true;
    }
}