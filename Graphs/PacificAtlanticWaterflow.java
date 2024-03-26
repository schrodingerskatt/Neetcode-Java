public class PacificAtlanticWaterflow {
/*
Problem Link : https://leetcode.com/problems/pacific-atlantic-water-flow/
class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {

        int n = heights.length;
        int m = heights[0].length;
        boolean[][]pacific = new boolean[n][m];
        boolean[][]atlantic = new boolean[n][m];
        for(int c = 0; c < m; c++){
            DFS(0,c,pacific,heights,heights[0][c]);
            DFS(n-1,c,atlantic,heights,heights[n-1][c]);
        }
        for(int r = 0; r < n; r++){
            DFS(r,0,pacific,heights,heights[r][0]);
            DFS(r,m-1,atlantic,heights,heights[r][m-1]);
        }
        List<List<Integer>>res = new ArrayList<>();
        for(int r = 0; r < n; r++){
            for(int c = 0; c < m; c++){
                if(pacific[r][c] == true && atlantic[r][c] == true){
                    List<Integer>point = new ArrayList<>();
                    point.add(r);
                    point.add(c);
                    res.add(point);
                }
            }
        }
    return res;   
    }

    private void DFS(int r, int c, boolean[][]visited, int[][]heights, int prevh){
        int n = heights.length;
        int m = heights[0].length;
        if(r < 0 || r >= n || c < 0 || c >= m || heights[r][c] < prevh || visited[r][c] == true){
            return;
        }
        visited[r][c] = true;
        DFS(r+1,c,visited,heights,heights[r][c]);
        DFS(r-1,c,visited,heights,heights[r][c]);
        DFS(r,c+1,visited,heights,heights[r][c]);
        DFS(r,c-1,visited,heights,heights[r][c]);

    }
} 
*/
}
