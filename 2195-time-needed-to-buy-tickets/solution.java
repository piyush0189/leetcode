class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<int[]> q = new LinkedList<>();
        
        for (int i = 0; i < tickets.length; i++) {
            q.add(new int[]{tickets[i], i});
        }
        int time = 0;

        while (!q.isEmpty()) {
            int[] curr = q.remove();
            curr[0]--;
            time++;

            if (curr[0] > 0) {
                q.add(curr);
            } else if (curr[1] == k) {
                return time;
            }
        }

        return time;
    }
}
