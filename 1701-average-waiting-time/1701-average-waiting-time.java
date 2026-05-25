class Solution {
    public double averageWaitingTime(int[][] customers) {
        int n=customers.length;
        double time_waiting=customers[0][1];
        int finished_prev=customers[0][0]+customers[0][1];
        for(int i=1;i<n;i++){
            int[] times=customers[i];
            int arrive=times[0];
            int start_cook=Math.max(arrive,finished_prev);
            int end_cook=start_cook+times[1];
            finished_prev=end_cook;
            time_waiting+=end_cook-arrive;
        }
        return time_waiting/n;
    }
}