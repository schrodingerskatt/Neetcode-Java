public class AccountMerge {
    
/*
Problem Link : https://leetcode.com/problems/accounts-merge/

class DSU{
    int parent[];
    int rank[];
    DSU(int sz){
        rank = new int[sz];
        parent = new int[sz];
        for(int i = 0; i < sz; i++){
            parent[i] = i;
            rank[i] = 1;
        }
    }
    public int find(int n){
        if(n == parent[n]){
            return n;
        }
        parent[n] = find(parent[n]);
        return parent[n];
    }
    public boolean union(int n1, int n2){
        int parent1 = find(n1);
        int parent2 = find(n2);
        if(parent1 == parent2){
            return false;
        }
        if(rank[parent1] > rank[parent2]){
            parent[parent2] = parent1;
            rank[parent1]+=rank[parent2];
        }else{
            parent[parent1] = parent2;
            rank[parent2]+=rank[parent1];
        }
        return true;
    }
}


class Solution {
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        
        int n = accounts.size();
        DSU dsu = new DSU(n);
        Map<String, Integer>emailGroup = new HashMap<>();
        for(int i = 0; i < n; i++){
            int accountSize = accounts.get(i).size();
            for(int j = 1; j < accountSize; j++){
                String email = accounts.get(i).get(j);
                String name = accounts.get(i).get(0);
                if(!emailGroup.containsKey(email)){
                    emailGroup.put(email,i);
                }else{
                    dsu.union(i,emailGroup.get(email));
                }
            }
        }

        Map<Integer,List<String>>components = new HashMap<Integer,List<String>>();
        for(String email:emailGroup.keySet()){
            int group = emailGroup.get(email);
            int leader = dsu.find(group);
            if(!components.containsKey(leader)){
                components.put(leader,new ArrayList<String>());
            }
            components.get(leader).add(email);
        }

    List<List<String>>mergedAccounts = new ArrayList<>();
    for(int group:components.keySet()){
        List<String>component = components.get(group);
        Collections.sort(component);
        component.add(0,accounts.get(group).get(0));
        mergedAccounts.add(component);
    }
    return mergedAccounts;  
    }
}
*/
}
