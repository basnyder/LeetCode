/*
Runtime: 126 ms, faster than 53.49% of Java online submissions for Check If a String Contains All Binary Codes of Size K.
Memory Usage: 56.1 MB, less than 37.75% of Java online submissions for Check If a String Contains All Binary Codes of Size K.
*/

class Solution {
    // public boolean hasAllCodes(String s, int k) {
    //     boolean[] has = new boolean[1 << k];
    //     for (int i = 0; i < s.length() - k + 1; i++) {
    //         has[Integer.parseInt(s.substring(i, i + k), 2)] = true;
    //     }
    //     for (int i = 0; i < has.length; i++) {
    //         if (!has[i]) {
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    
    public boolean hasAllCodes(String s, int k) {
        Set<String> set = new HashSet<>(1 << k);
        for (int i = 0; i < s.length() - k + 1; i++) {
            set.add(s.substring(i, i + k));
        }
        return set.size() == (1 << k);
    }

    // public boolean hasAllCodes(String s, int k) {
    //     Set<Integer> set = new HashSet<>(1 << k);
    //     for (int i = 0; i < s.length() - k + 1; i++) {
    //         set.add(Integer.parseInt(s.substring(i, i + k), 2));
    //     }
    //     return set.size() == (1 << k);
    // }
}