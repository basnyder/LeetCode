class Solution {
    public String reverseWords(String s) {
        String[] strs = s.split(" ");
        s = "";
        for (int i = strs.length - 1; i >= 0; i--) {
            if (strs[i].isEmpty()) {
                continue;
            }
            s += " " + strs[i];           
        }
        return (s.length() > 1 ? s.substring(1) : s).trim();
    }
}