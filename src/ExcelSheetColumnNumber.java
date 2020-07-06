/*
Runtime: 1 ms, faster than 100.00% of Java online submissions for Excel Sheet Column Number.
Memory Usage: 38.4 MB, less than 40.14% of Java online submissions for Excel Sheet Column Number.
*/

class Solution {
    public int titleToNumber(String s) {
        int val = 0;
        // char[] c = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
        // for (int i = 0; i < c.length; i++) {
            val *= 26;
            val += s.charAt(i) - 'A' + 1;
            // val += c[i] - 'A' + 1;
        }
        return val;
    }
}