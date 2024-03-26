public class MinVerticesToReachAllNodes {
/*
Problem Link : https://leetcode.com/problems/minimum-number-of-vertices-to-reach-all-nodes/
class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        List<List<Integer>>adj = new ArrayList<>();
        for(int i = 0; i < n; i++){
            adj.add(new ArrayList<>());
        }
        int[]indegree = new int[n];
        for(List<Integer> edge:edges){
           adj.get(edge.get(0)).add(edge.get(1));
           indegree[edge.get(1)]++;
        }
        List<Integer>ans = new ArrayList<>();
        for(int i = 0; i < indegree.length; i++){
            if(indegree[i] == 0){
                ans.add(i);
            }
        }
    return ans;
    }
}
*/
    
}
