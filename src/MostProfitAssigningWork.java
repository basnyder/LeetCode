/*
Runtime: 1188 ms, faster than 5.08% of Java online submissions for Most Profit Assigning Work.
Memory Usage: 40.9 MB, less than 62.32% of Java online submissions for Most Profit Assigning Work.
*/

class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int count = 0;
        for (int i = 0; i < worker.length; i++) {
            int best = -1;
            for (int j = 0; j < profit.length; j++) {
                if (worker[i] >= difficulty[j]) {
                    if (best == -1 || profit[j] > profit[best]) {
                        best = j;
                    }
                }
            }
            if (best != -1) {
                count += profit[best];
            }
        }
        
        return count;
    }
}