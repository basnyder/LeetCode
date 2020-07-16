/*
Runtime: 23 ms, faster than 5.65% of Java online submissions for Goat Latin.
Memory Usage: 41.1 MB, less than 5.02% of Java online submissions for Goat Latin.
*/

class Solution {
    public String toGoatLatin(String S) {
        String[] strs = S.split(" ");
        String as = "a";
        String out = "";
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
        for (int i = 0; i < strs.length; i++) {
            out += " ";
            char c = strs[i].charAt(0);
            if (vowels.contains(c)) {
                out += strs[i];
            } else {
                if (strs[i].length() > 1) {
                    out += strs[i].substring(1);
                }
                out += c;
            }
            out += "ma" + as;
            as += 'a';
        }
        return out.substring(1);
    }
}