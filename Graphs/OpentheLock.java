public class OpentheLock {
/*
Problem Link : https://leetcode.com/problems/open-the-lock/

class Solution {
    public int openLock(String[] deadends, String target) {

        Set<String>visited = new HashSet<>();
        for(String deadend: deadends){
            visited.add(deadend);
        }
        if(visited.contains("0000")){
            return -1;
        }
        Queue<String[]>q = new ArrayDeque<>();
        q.add(new String[]{"0000","0"});

        while(!q.isEmpty()){
            String[] current = q.poll();
            String code = current[0];
            int turns = Integer.parseInt(current[1]);
            if(code.equals(target)){
                return turns;
            }
            for(String comb : combinations(code)){
                if(!visited.contains(comb)){
                   q.offer(new String[]{comb, String.valueOf(turns + 1)});
                    visited.add(comb);
                }
            }
        }
    return -1;
    }

    private List<String> combinations(String code){
        ArrayList<String>res = new ArrayList<>();
        for(int i = 0; i < 4; i++){
            char val = (char)((code.charAt(i)-'0'+1)%10+'0');
            String s = code.substring(0,i)+val+code.substring(i+1);
            res.add(s);
            val = (char)((code.charAt(i)-'0'+9)%10+'0');
            s = code.substring(0,i)+val+code.substring(i+1);
            res.add(s);
        }
    return res;
    }
} 
*/
}
