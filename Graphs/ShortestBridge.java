public class ShortestBridge {

/*
Problem Link : https://leetcode.com/problems/shortest-bridge/

class Pair{
    int row;
    int col;
    public Pair(int row, int col){
        this.row = row;
        this.col = col;
    }
}

class Solution {
    public int shortestBridge(int[][] grid) {

        int n = grid.length;
        int[][]dirs = {{0,1},{0,-1},{1,0},{-1,0}};
        int[][]visited = new int[n][n];
        boolean flag = false;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 1 && flag == false){
                    dfs(i,j,grid,n,dirs,visited);
                    flag = true;
                }
            }
        }
        Queue<Pair>q = new LinkedList<>();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(visited[i][j] == 1){
                    q.add(new Pair(i,j));
                }
            }
        }
        int bridge = 0;
        while(!q.isEmpty()){
            int s = q.size();
            for(int i = 0; i < s; i++){
                Pair node = q.remove();
                for(int [] d: dirs){
                    int r = node.row+d[0];
                    int c = node.col+d[1];
                    if(r < 0 || r >= n || c < 0 || c >= n || visited[r][c] == 1){
                        continue;
                    }
                    if(grid[r][c] == 1){
                        return bridge;
                    }
                    q.add(new Pair(r,c));
                    visited[r][c]=1;
                }
            }
            bridge++;
        } 
    return -1; 
    }
    public void dfs(int i, int j, int[][]grid, int n ,int[][]dirs,int[][]visited){
        if(i < 0 || i >= n || j < 0 || j >= n || visited[i][j] == 1 || grid[i][j] == 0){
            return;
        }
        visited[i][j] = 1;
        for(int[]dir:dirs){
            dfs(i+dir[0],j+dir[1],grid,n,dirs,visited);
        }
    }

}
*/
    
}
