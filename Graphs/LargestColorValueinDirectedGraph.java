public class LargestColorValueinDirectedGraph {

/*
Problem Link : https://leetcode.com/problems/largest-color-value-in-a-directed-graph/

class Solution {
    public int largestPathValue(String colors, int[][] edges) {

        Map<Integer,List<Integer>>adj = new HashMap<>();
        int N = colors.length();

        int[]indegree = new int[N];
        for(int[]edge:edges){
            int u = edge[0];
            int v = edge[1];
            adj.computeIfAbsent(u,k->new ArrayList<>()).add(v);
            indegree[v]++;
        }
        Queue<Integer>q = new LinkedList<>();
        int[][]colorval = new int[N][26];
        for(int i = 0; i < N; i++){
            if(indegree[i] == 0){
                q.add(i);
                colorval[i][colors.charAt(i)-'a'] = 1;
            }
        }

        int answer = 0;
        int countNodes = 0;

        while(!q.isEmpty()){
            int u = q.poll();
            countNodes++;
            answer = Math.max(answer,colorval[u][colors.charAt(u)-'a']);
            for(int v: adj.getOrDefault(u, new ArrayList<>())){
                for(int i = 0; i < 26; i++){
                   colorval[v][i] = Math.max(colorval[v][i], colorval[u][i] + (colors.charAt(v) - 'a' == i ? 1 : 0));
                }
                indegree[v]--;
                if(indegree[v] == 0){
                    q.add(v);
                }
            }
        }
        if(countNodes < N){
            return -1;
        }
        return answer;
        
    }
}
*/
}
