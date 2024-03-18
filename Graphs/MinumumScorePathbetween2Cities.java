public class MinumumScorePathbetween2Cities {
/*
Problem Link : https://leetcode.com/problems/minimum-score-of-a-path-between-two-cities/

class Solution {
    public int minScore(int n, int[][] roads) {
         Map<Integer, List<int[]>> adj = new HashMap<>();
        for(int[]r:roads){
            adj.computeIfAbsent(r[0],k->new ArrayList<>()).add(new int[]{r[1], r[2]});
            adj.computeIfAbsent(r[1],k->new ArrayList<>()).add(new int[]{r[0], r[2]});
        }
        int[] minDistance = {Integer.MAX_VALUE};
        boolean[]visited = new boolean[n+1];
        DFS(1,adj,visited,minDistance);
        return minDistance[0];
    }

    public void DFS(int i, Map<Integer,List<int[]>>adj, boolean[]visited, int[] minDistance){
        if(visited[i]){
            return;
        }
        visited[i] = true;
        for(int[]nbh:adj.getOrDefault(i,new ArrayList<>())){
            int nbd = nbh[0];
            int wt = nbh[1];
            minDistance[0] = Math.min(minDistance[0],wt);
            DFS(nbd,adj,visited,minDistance);
        }
    }
} 
*/  
}
