/*
Runtime: 2 ms, faster than 37.35% of Java online submissions for Power of Two.
Memory Usage: 36.2 MB, less than 96.53% of Java online submissions for Power of Two.
*/

class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        String s = Integer.toBinaryString(n);
        int i = s.indexOf("1");
        return i != -1 && i == s.lastIndexOf("1");
    }
}