class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        return Math.min(canFinish(landStartTime,landDuration,waterStartTime,waterDuration),
        canFinish(waterStartTime,waterDuration,landStartTime,landDuration)
        );
    }
    public int canFinish(int[] fs,int[] fd,int[] ss,int[] sd){
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<fs.length;i++){
            mini=Math.min(mini,fs[i]+fd[i]);
        }
        int ans=Integer.MAX_VALUE;
        for(int j=0;j<ss.length;j++){
            ans=Math.min(ans,Math.max(mini,ss[j])+sd[j]);
        }
        return ans;
    }
}