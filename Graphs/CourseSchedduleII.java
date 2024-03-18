public class CourseSchedduleII {

/*
class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[]indegree = new int[numCourses];
        List<List<Integer>>adj = new ArrayList<>();
        for(int i = 0; i < numCourses; i++){
            adj.add(new ArrayList<>());
        }
        for(int[]nodes:prerequisites){
            adj.get(nodes[1]).add(nodes[0]);
            indegree[nodes[0]]++;
        }
        Queue<Integer>q = new LinkedList<>();
        for(int u = 0; u < numCourses; u++){
            if(indegree[u] == 0){
                q.add(u);
            }
        }
        int res[] = new int[numCourses];
        int i = 0;
        while(!q.isEmpty()){
            int u = q.poll();
            res[i] = u;
            i++;
            for(int v: adj.get(u)){
                indegree[v]--;
                if(indegree[v] == 0){
                    q.add(v);
                }
            }

        }
    return (i == numCourses) ? res : new int[0];
    }
} 
*/
}
