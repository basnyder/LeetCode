/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Spiral Matrix.
Memory Usage: 37.5 MB, less than 46.67% of Java online submissions for Spiral Matrix.
*/

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        if (matrix.length == 0 || matrix[0].length == 0) {
            return list;
        }
        int across = matrix[0].length - 1;
        int down = matrix.length - 1;
        int i = 0;//ud
        int j = 0;//lr
        while (list.size() < matrix.length * matrix[0].length && down > 0 && across > 0) {
            for (int k = 0; k < across; k++) {
                list.add(matrix[i][j++]);
            }
            for (int k = 0; k < down; k++) {
                list.add(matrix[i++][j]);
            }
            for (int k = 0; k < across; k++) {
                list.add(matrix[i][j--]);
            }
            for (int k = 0; k < down; k++) {
                list.add(matrix[i--][j]);
            }
            i++;
            j++;
            down -= 2;
            across -= 2;
        }
        if (list.size() < matrix.length * matrix[0].length) {
            if (list.size() == matrix.length * matrix[0].length - 1) { 
                list.add(matrix[i][j]);
            } else if (across != 0) {
                for (int k = 0; k < across + 1; k++) {
                    list.add(matrix[i][j++]);
                }
            } else if (down != 0) {
                for (int k = 0; k < down + 1; k++) {
                    list.add(matrix[i++][j]);
                }
            }
        }
        return list;
    }
}