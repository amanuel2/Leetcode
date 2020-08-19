class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] ret = new int[n][n];
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                ret[j][Math.abs(i - (n - 1))] = matrix[i][j];
            }
        }
        for (int i = 0; i < n; i++) {
            matrix[i] = ret[i];
        }
    }
}