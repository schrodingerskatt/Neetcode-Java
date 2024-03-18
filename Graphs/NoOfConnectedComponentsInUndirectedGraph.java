public class NoOfConnectedComponentsInUndirectedGraph {

// Problem Link : https://leetcode.com/problems/number-of-connected-components-in-an-undirected-graph/
/*
class Solution {
    public int countComponents(int n, int[][] edges) {

        List<List<Integer>>adj = new ArrayList<>();
        boolean[] visited = new boolean[n];
        for(int i = 0; i < n; i++){
            adj.add(new ArrayList<>());
        }
        for(int []edge:edges){
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        int count = 0;
        for(int i = 0; i < n; i++){
            if(visited[i] == false){
                DFS(i,adj,visited);
                count++;
            }
        }
    return count;
    }

    private void DFS(int i, List<List<Integer>>adj, boolean[]visited){
        visited[i] = true;
        for(int nbh: adj.get(i)){
            if(!visited[nbh]){
                DFS(nbh,adj,visited);
            }
        }
    }
}
*/
    
}
