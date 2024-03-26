public class DetonatetheMaximumBombs {
/*
Problem Link : https://leetcode.com/problems/detonate-the-maximum-bombs/

class Solution {
    public int maximumDetonation(int[][] bombs) {
        Map<Integer,List<Integer>> graph = new HashMap<>();
        int n = bombs.length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == j){
                    continue;
                }
                long x1 = bombs[i][0];
                long y1 = bombs[i][1];
                long r1 = bombs[i][2];

                long x2 = bombs[j][0];
                long y2 = bombs[j][1];
                long r2 = bombs[j][2];

                long distance = (x2-x1)*(x2-x1)+(y2-y1)*(y2-y1);
                if(r1*r1 >= distance){
                    graph.putIfAbsent(i, new ArrayList<>());
                    graph.get(i).add(j);
                }

            }
        }
        int result = 0;
        Set<Integer> visited = new HashSet<>();
        for(int i = 0; i < n; i++){
            DFS(i, visited, graph);
            int count = visited.size();
            result = Math.max(result, count);
            visited.clear();
        }
        return result;
    }
    public void DFS(int u, Set<Integer> visited, Map<Integer, List<Integer>> graph){
        visited.add(u);
        if(graph.containsKey(u)) {
            for (int v : graph.get(u)) {
                if (!visited.contains(v)) {
                    DFS(v, visited, graph);
                }
            }
        }
    }
}

*/  
}
