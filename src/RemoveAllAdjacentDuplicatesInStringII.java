/*
Runtime: 5 ms, faster than 85.34% of Java online submissions for Remove All Adjacent Duplicates in String II.
Memory Usage: 40 MB, less than 55.95% of Java online submissions for Remove All Adjacent Duplicates in String II.
*/

class Solution {
    public String removeDuplicates(String s, int k) {
        boolean remove;
        int i = 0;
        while (i < s.length() - k + 1) {
            remove = true;
            int j = 1;
            while (j < k) {
                if (s.charAt(i) != s.charAt(i + j)) {
                    remove = false;
                    break;
                }
                j++;
            }
            if (remove) {
                return removeDuplicates(s.substring(0, i) + s.substring(i + k), k);
            }
            i += j;
        }
        return s;
    }
}