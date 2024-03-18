public class RedundantConnection {
// Problem Link : https://leetcode.com/problems/redundant-connection/
/*
class Solution {
    public int[] findRedundantConnection(int[][] edges) {

        int[]parent = new int[edges.length+1];
        int[]rank = new int[edges.length+1];
        for(int i = 0; i < parent.length; i++){
            parent[i] = i;
        }
        for(int[]edge:edges){
            int v1 = edge[0];
            int v2 = edge[1];
            if(!union(parent,rank,v1,v2)){
                return new int[]{v1,v2};
            }
        }
    return new int[]{};
    }

    private int find(int[]parent, int n){
        if(n == parent[n]){
            return n;
        }
        parent[n] = find(parent,parent[n]);
        return parent[n];
    }

    private boolean union(int[] parent, int[] rank, int n1, int n2){
        int parent1 = find(parent,n1);
        int parent2 = find(parent,n2);

        if(parent1 == parent2){
            return false;
        }
        if(rank[parent1]>rank[parent2]){
            parent[parent2] = parent1;
            rank[parent1]+=rank[parent2];
        }else{
            parent[parent1] = parent2;
            rank[parent2]+=rank[parent1];
        }
    return true;
    }
} 
*/
}
