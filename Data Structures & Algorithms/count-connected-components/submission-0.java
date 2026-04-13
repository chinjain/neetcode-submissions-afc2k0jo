class Solution {
    public int countComponents(int n, int[][] edges) {

        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }

        int res = 0;
        boolean[] visit = new boolean[n];

        for(int i = 0; i < n; i++){
            if(!visit[i]){
                bfs(i,adj,visit);
                res++;
            }
        }
        return res;
    }

    static void bfs(int start, List<List<Integer>> adj, boolean[] visit){
         Queue<Integer> q = new LinkedList<>();
         q.offer(start);
         visit[start] = true;


         while(!q.isEmpty()){
            int node = q.poll();

            for(int neighbour : adj.get(node)){
                if(!visit[neighbour]){
                    visit[neighbour] = true;
                    q.add(neighbour);
                }
            }
         }
    }
}
