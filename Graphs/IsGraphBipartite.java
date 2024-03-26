public class IsGraphBipartite {

/*
Problem Link : https://leetcode.com/problems/is-graph-bipartite/

class Solution {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[]color = new int[n];
        Arrays.fill(color,-1);
        for(int i = 0; i < n; i++){
            if(color[i] == -1){
                if(checkBipartite(graph,i,1,color)== false){
                    return false;
                }
            }
        }
        return true;   
    }
    public boolean checkBipartite(int[][]graph, int i, int col, int[]color){
        color[i] = col;
        Queue<Integer>q =new LinkedList<>();
        q.add(i);
        while(!(q.isEmpty())){
            int u = q.remove();
            for(int v:graph[u]){
                if(color[v]==color[u]){
                    return false;
                }
                else if(color[v]==-1){
                    color[v] = 1-color[u];
                    q.add(v);
                }
            }
        }
    return true;
    }
}
*/
}
