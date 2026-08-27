class Solution {
    public int numIslands(char[][] grid) {
        int rows=grid.length;
        int cols=grid[0].length;
        int count=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]=='1'){
                    count++;
                    dfs(i,j,grid);
                }
            }
        }
        return count;
    }
    public void dfs(int r,int c,char[][] grid){
        int rows=grid.length;
        int cols=grid[0].length;
      if(r<0||c<0||r>=rows||c>=cols||grid[r][c]=='0'){
        return;
      }
      grid[r][c]='0';
      dfs(r+1,c,grid);
      dfs(r,c+1,grid);
      dfs(r-1,c,grid);
      dfs(r,c-1,grid);
    }
}