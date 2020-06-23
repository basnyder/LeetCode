/*
Runtime: 2 ms, faster than 6.98% of Java online submissions for H-Index II.
Memory Usage: 46.4 MB, less than 96.07% of Java online submissions for H-Index II.
*/

class Solution {
    public int hIndex(int[] citations) {
        int max = 0;
        for (int i = 1; i <= citations.length; i++) {
            max = Math.max(max, Math.min(citations[citations.length - i], i));
        }
        return max;
    }
}