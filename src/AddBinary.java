/*
Runtime: 4 ms, 29.47%
Memory Usage: 40.2 MB 6.444%
*/

class Solution {
    public String addBinary(String a, String b) {
        String s = "";
        int al = a.length();
        int bl = b.length();
        char carry = '0';
        for (int i = 0; i < Math.max(al, bl); i++) {
            char c = (char) (carry + ((i < al) ? a.charAt(al - 1 - i) : '0') + ((i < bl) ? b.charAt(bl - 1 - i) : '0'));
            if (c == 3 * '0') {
                s = '0' + s;
                carry = '0';
            } else if (c == '1' + 2 * '0') {
                s = '1' + s;
                carry = '0';
            } else if (c ==  2 * '1' + '0') {
                s = '0' + s;
                carry = '1';
            } else if (c == 3 * '1') {
                s = '1' + s;
                carry = '1';
            }
        }
        if (carry == '1') {
            s = '1' + s;
        }
        return s;
    }
}