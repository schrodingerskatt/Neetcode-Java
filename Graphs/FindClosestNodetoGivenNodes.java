public class FindClosestNodetoGivenNodes {

/*
Problem Link : https://leetcode.com/problems/find-closest-node-to-given-two-nodes/

class Solution {
    public int closestMeetingNode(int[] edges, int node1, int node2) {
        
        Map<Integer,List<Integer>> graph = new HashMap<>();
        for(int i = 0; i < edges.length; i++){
            graph.putIfAbsent(i, new ArrayList<>());
            graph.get(i).add(edges[i]);
        }
        Map<Integer,Integer>mp1 = new HashMap<>();
        Map<Integer,Integer>mp2 = new HashMap<>();
        DFS(node1,graph,mp1,0);
        DFS(node2,graph,mp2,0);
        int ans = -1;
        int minDistance = Integer.MAX_VALUE;
        for(int i = 0; i < edges.length; i++){
            if(mp1.containsKey(i)&&mp2.containsKey(i)){
                int dist = Math.max(mp1.get(i),mp2.get(i));
                if(dist < minDistance){
                    minDistance = dist;
                    ans = i;
                }
            }
        }
    return ans;
    }
    public void DFS(int u, Map<Integer,List<Integer>>graph, Map<Integer,Integer>mp, int dist){
        mp.put(u,dist);
        if(graph.containsKey(u)){
            for(int v : graph.get(u)){
                if(!mp.containsKey(v)){
                    DFS(v, graph, mp, dist+1);
                }
            }
        }
    }
}
*/
    
}
