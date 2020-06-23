/*
Runtime: 1 ms, faster than 56.90%
Memory Usage: 46 MB, less than 84.17%
*/

class Solution {
    public void reverseString(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            char c = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = c;
        }
    }
}