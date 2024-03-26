public class EvaluateDivison {

/*
Problem Link : https://leetcode.com/problems/evaluate-division/

class Pair{
    String key;
    double value;

    public Pair(String key, double value){
        this.key = key;
        this.value = value;
    }
}

class Solution {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
    Map<String,List<Pair>>adj = new HashMap<>();
    for(int i = 0; i < equations.size(); i++){
        String a = equations.get(i).get(0);
        String b = equations.get(i).get(1);
        double val = values[i];
        adj.putIfAbsent(a,new ArrayList<>());
        adj.putIfAbsent(b,new ArrayList<>());
        adj.get(a).add(new Pair(b,val));
        adj.get(b).add(new Pair(a,1.0/val));
    }
    double[] results = new double[queries.size()];
    for(int i = 0; i < queries.size(); i++){
        String src = queries.get(i).get(0);
        String target = queries.get(i).get(1);
        results[i] = bfs(src,target,adj);
    }
    return results;
    }

    private double bfs(String src, String target, Map<String, List<Pair>> adj){
        if(!adj.containsKey(src)||!adj.containsKey(target)){
            return -1.0;
        }
        Queue<Pair>q = new LinkedList<>();
        Set<String>visited = new HashSet<>();
        q.offer(new Pair(src,1.0));
        visited.add(src);
        while(!q.isEmpty()){
            Pair current = q.poll();
            if(current.key.equals(target)){
                return current.value;
            }
            for(Pair nbh: adj.get(current.key)){
                if(!visited.contains(nbh.key)){
                    q.offer(new Pair(nbh.key,current.value*nbh.value));
                    visited.add(nbh.key);
                }
            }
        }
    return -1.0;
    }
} 
*/
    
}
