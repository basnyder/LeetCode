

class Solution {
    public int[][] spiralMatrixIII(int R, int C, int r0, int c0) {
        int[][] out = new int[R*C][2];
        int count = 0;
        int i = r0;
        int j = c0;
        int len = 1;
        while (count < R * C) {
            for (int k = 0; k < len; k++) {
                if (in(R,C,i,j)) {
                    out[count][0] = i;
                    out[count++][1] = j;
                }
                j++;
            }
            for (int k = 0; k < len; k++) {
                if (in(R,C,i,j)) {
                    out[count][0] = i;
                    out[count++][1] = j;
                }
                i++;
            }
            len++;
            for (int k = 0; k < len; k++) {
                if (in(R,C,i,j)) {
                    out[count][0] = i;
                    out[count++][1] = j;
                }
                j--;
            }
            for (int k = 0; k < len; k++) {
                if (in(R,C,i,j)) {
                    out[count][0] = i;
                    out[count++][1] = j;
                }
                i--;
            }
            len++;
        }
        return out;
    }
    
    public boolean in(int r, int c, int i, int j) {
        return i >= 0 && j >= 0 && i < r && j < c;
    }
}