public class CourseSchedule {
    /*
     class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {

        int []indegree = new int[numCourses];
        List<List<Integer>>adj = new ArrayList<>();
        for(int i = 0; i < numCourses; i++){
            adj.add(new ArrayList<>());
        }
        for(int[]node:prerequisites){
            adj.get(node[1]).add(node[0]);
            indegree[node[0]]++;
        }
        int count = 0;
        Queue<Integer>q = new LinkedList<>();
        for(int u = 0; u < numCourses; u++){
            if(indegree[u] == 0){
                q.add(u);
            }
        }
        while(!q.isEmpty()){
            int u = q.poll();
            count++;
            for(int v: adj.get(u)){
                indegree[v]--;
                if(indegree[v] == 0){
                    q.add(v);
                }
            }
        }
        return count == numCourses;
    }
}
    */
}
