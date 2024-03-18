public class ShortestPathinBinaryMatrix {
/*
Problem Link : https://leetcode.com/problems/shortest-path-in-binary-matrix/

class TPair {
    int row;
    int col;
    int count;
    public TPair(int row, int col, int count) {
        this.row = row;
        this.col = col;
        this.count = count;
    }
}
class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        if (grid[0][0] == 1 || grid[n - 1][n - 1] == 1) {
            return -1; 
        }
        int[][] visited = new int[n][n];
        visited[0][0] = 1;
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}, {1, 1}, {-1, -1}, {1, -1}, {-1, 1}};
        Queue<TPair> q = new LinkedList<>();
        q.add(new TPair(0, 0, 1));
        while (!q.isEmpty()) {
            TPair node = q.remove();
            int r = node.row;
            int c = node.col;
            int steps = node.count;
            if (r == n - 1 && c == n - 1) {
                return steps;
            }
            for (int[] dir : directions) {
                int nextR = r + dir[0];
                int nextC = c + dir[1];
                if (nextR >= 0 && nextR < n && nextC >= 0 && nextC < n && grid[nextR][nextC] == 0 && visited[nextR][nextC] != 1) {
                    q.add(new TPair(nextR, nextC, steps + 1));
                    visited[nextR][nextC] = 1;
                }
            }
        }
        return -1;
    }
}
 
*/
}
