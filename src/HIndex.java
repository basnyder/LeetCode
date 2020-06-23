/*
Runtime: 1 ms, faster than 43.88% of Java online submissions for H-Index.
Memory Usage: 36.9 MB, less than 96.12% of Java online submissions for H-Index.
*/

class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int max = 0;
        for (int i = 1; i <= citations.length; i++) {
            max = Math.max(max, Math.min(citations[citations.length - i], i));
        }
        return max;
    }
}