public class ShortestPathwithAlternatingColor {
// Problem Link : https://leetcode.com/problems/shortest-path-with-alternating-colors/
/*
import java.util.*;

class Solution {
    public int[] shortestAlternatingPaths(int n, int[][] redEdges, int[][] blueEdges) {
        Map<Integer, List<Integer>> red = new HashMap<>();
        Map<Integer, List<Integer>> blue = new HashMap<>();
        for (int[] edge : redEdges) {
            red.computeIfAbsent(edge[0], k -> new ArrayList<>()).add(edge[1]);
        }
        for (int[] edge : blueEdges) {
            blue.computeIfAbsent(edge[0], k -> new ArrayList<>()).add(edge[1]);
        }

        int[] ans = new int[n];
        Arrays.fill(ans, -1);
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{0, 0, -1});
        Set<String> visited = new HashSet<>();
        visited.add("0,-1");

        while (!q.isEmpty()) {
            int[] current = q.poll();
            int node = current[0];
            int length = current[1];
            int edgeColor = current[2];

            if (ans[node] == -1) {
                ans[node] = length;
            }
            if (edgeColor != 0) {
                for (int nbh : red.getOrDefault(node, new ArrayList<>())) {
                    String key = nbh + ",0";
                    if (!visited.contains(key)) {
                        visited.add(key);
                        q.offer(new int[]{nbh, length + 1, 0});
                    }
                }
            }
            if (edgeColor != 1) {
                for (int nbh : blue.getOrDefault(node, new ArrayList<>())) {
                    String key = nbh + ",1";
                    if (!visited.contains(key)) {
                        visited.add(key);
                        q.offer(new int[]{nbh, length + 1, 1});
                    }
                }
            }
        }
        return ans;
    }
} 
*/
    
}
