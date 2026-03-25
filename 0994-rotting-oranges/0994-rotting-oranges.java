class Solution {
    public int orangesRotting(int[][] grid) {
        int rows=grid.length;
        int cols=grid[0].length;
        Queue<int[]> q=new LinkedList<>();
        int fresh=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]==2){
                    q.offer(new int[]{i,j});
                }
                if(grid[i][j]==1)
                fresh++;
            }
        }
        int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
        int minute=0;
        while (!q.isEmpty()&&fresh>0) {
            int size=q.size();
            for(int i=0;i<size;i++){
            int[] cur = q.poll();
            int r = cur[0], c = cur[1];
            for (int[] d : dir) {
                int nr = r + d[0];
                int nc = c + d[1];

                if (nr >= 0 && nr < rows && nc >= 0 && nc < cols && grid[nr][nc] == 1) {
                    grid[nr][nc] = 2;
                    fresh--;
                    q.offer(new int[]{nr, nc});
                }}
            }
            minute++;
        }

        if(fresh== 0 )
        return minute ;
        return -1;
    }
}