/*
Runtime: 11 ms, faster than 83.26% of Java online submissions for Power of Three.
Memory Usage: 39.2 MB, less than 61.23% of Java online submissions for Power of Three.
*/

class Solution {
    public boolean isPowerOfThree(int n) {
        // return n != 0 && Math.pow(3, (int) (Math.log10(n)/Math.log10(3) + 0.000001)) == n;
        return n != 0 && (Math.log10(n)/Math.log10(3)) % 1 == 0;
    }
}