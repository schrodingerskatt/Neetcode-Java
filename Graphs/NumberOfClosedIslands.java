public class NumberOfClosedIslands {

/*
Problem Link : https://leetcode.com/problems/number-of-closed-islands/

class Solution {
    public int closedIsland(int[][] grid) {

        int[][]visited = new int[grid.length][grid[0].length];
        int result = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 0 && visited[i][j] == 0){
                    result+=DFS(grid,i,j,visited);
                }
            }
        }
        return result;
    }
    private int DFS(int[][]grid,int r, int c, int[][]visited){
        if(r < 0 || r >= grid.length || c < 0 || c>= grid[0].length){
            return 0;
        }
        if(grid[r][c] == 1 || visited[r][c] == 1){
            return 1;
        }
        visited[r][c] = 1;
        return Math.min(Math.min(DFS(grid,r+1,c,visited),DFS(grid,r-1,c,visited)),Math.min(DFS(grid,r,c+1,visited),DFS(grid,r,c-1,visited)));

    }
}
*/
    
}
