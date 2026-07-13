class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        int res1=0;
        int res2=0;
        String[] st=startTime.split(":");
        String[] et=endTime.split(":");
        res1+=Integer.parseInt(st[0])*60*60;
        res1+=Integer.parseInt(st[1])*60;
        res1+=Integer.parseInt(st[2]);
        res2+=Integer.parseInt(et[0])*60*60;
        res2+=Integer.parseInt(et[1])*60;
        res2+=Integer.parseInt(et[2]);
        return Math.abs(res1-res2);
    }
}