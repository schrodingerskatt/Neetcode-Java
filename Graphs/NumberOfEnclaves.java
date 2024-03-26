public class NumberOfEnclaves {

/*
Problem Link : https://leetcode.com/problems/number-of-enclaves/

class Solution {
    public int numEnclaves(int[][] grid) {
    int visited[][] = new int[grid.length][grid[0].length];
    int directions [][] = {{0,1},{1,0},{0,-1},{-1,0}};
    int land = 0;
    int boderland = 0;
    for(int i = 0; i < grid.length; i++){
        for(int j = 0; j < grid[0].length; j++){
            land+=grid[i][j];
            if(grid[i][j] == 1 && visited[i][j] == 0 && (i == 0 || i == grid.length-1 || j == 0 || j == grid[0].length-1)){
                boderland+=DFS(grid,i,j,visited,directions); 
            }
        }
    }
    return land-boderland;
    }

    private int DFS(int[][]grid,int i, int j, int[][]visited,int[][]directions){
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || visited[i][j] == 1 || grid[i][j] == 0){
            return 0;
        }
        visited[i][j] = 1;
        int res = 1;
        for(int[]dir:directions){
            res+=DFS(grid,i+dir[0],j+dir[1],visited,directions);
        }
        return res;
    }
}
*/
    
}
