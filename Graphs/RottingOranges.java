public class RottingOranges {

/*

Problem Link : https://leetcode.com/problems/rotting-oranges/

class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]>q = new ArrayDeque<>();
        int fresh = 0;
        for(int i = 0; i < grid.length;i++){
            for(int j = 0; j < grid[0].length;j++){
                if(grid[i][j] == 1){
                    fresh++;
                }
                if(grid[i][j] == 2){
                    q.add(new int[]{i,j});
                }
            }
        }
        int time = 0;
        int [][] directions = {{0,1},{0,-1},{1,0},{-1,0}};
        while(!q.isEmpty() && fresh > 0){
            int size = q.size();
            for(int i = 0; i < size; i++){
                int[]pos = q.poll();
                int r = pos[0];
                int c = pos[1];
                for(int [] dir: directions){
                    int row = r+dir[0];
                    int col = c+dir[1];
                    if(row < 0 || row >= grid.length || col < 0 || col >= grid[0].length || grid[row][col]!=1){
                        continue;
                    }
                    grid[row][col] = 2;
                    q.add(new int[]{row,col});
                    fresh--;
                }
            }
            time++;
        }
    return fresh == 0 ? time : -1;
    }
} 
*/
    
}
