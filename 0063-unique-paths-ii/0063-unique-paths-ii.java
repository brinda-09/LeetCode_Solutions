class Solution {
    long[][] dp;
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
         dp=new long[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        long res=fun(0,0,m,n,obstacleGrid);
        return (int)res;
    }
    private long fun(int i, int j,int m ,int n,int[][] grid){
        if(i>=m ||j>=n||i<0||j<0||grid[i][j]==1)
        return 0;
        if(i==m-1&& j==n-1){
            return 1;
        }
        
        if(dp[i][j]!=-1)
        return dp[i][j];
        return dp[i][j]=fun(i+1,j,m,n,grid)+fun(i,j+1,m,n,grid);
    }
}
       