public class GraphValidTree {

// Problem Link : https://leetcode.com/problems/graph-valid-tree/    
/*
class Solution {
    public boolean validTree(int n, int[][] edges) {
        List<List<Integer>>adj = new ArrayList<>();
        boolean[] visited = new boolean[n];
        for(int i = 0; i < n; i++){
            adj.add(new ArrayList<>());
        }
        for(int[]edge:edges){
            adj.get(edge[0]).add(edge[1]);
        }
        int count = 0;
        for(int i = 0; i < n; i++){
            if(!visited[i]){
                DFS(i,adj,visited);
                count++;
            }
        }
        visited = new boolean[n];
        boolean flag = false;
        int parent = -1;
        for(int i = 0; i < n; i++){
            if(!visited[i]){
                if(DFSCycle(i,parent,adj,visited)==true){
                    flag = true;
                    break;
                }
            }
        }

        if(count > 1 || flag == true){
            return false;
        }
        return true;
        
    }

    public void DFS(int i, List<List<Integer>>adj, boolean[]visited){
        visited[i] = true;
        for(int nbh:adj.get(i)){
            if(!visited[nbh]){
                DFS(nbh,adj,visited);
            }
        }
    }

    public boolean DFSCycle(int i, int parent, List<List<Integer>>adj, boolean[]visited){
        visited[i] = true;
        for(int nbh:adj.get(i)){
            if(visited[nbh] == false){
                if(DFSCycle(nbh,i,adj,visited)){
                    return true;
                }
            }
            else if(nbh!=parent){
                return true;
            }
        }
    return false;
    }
} 
*/
    
}
