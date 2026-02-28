class Solution {
    public List<String> buildArray(int[] target, int n) {
        ArrayList<String> res=new ArrayList<>();
        int num=0;
        for(int i=1;i<=n&&num<target.length;i++){
            if(i==target[num]){
                res.add("Push");
                num++;
            }else{
                res.add("Push");
                res.add("Pop");
            }
        }
        return res;
    }
}