class Solution {
    public boolean isValidSudoku(char[][] board) {
        // row by row
        Set<Character> set_row = new HashSet();
        Set<Character> set_col = new HashSet();
        // Set<Character> set = new HashSet();
        for (int i = 0, x = 0; i < board.length; i++, x += 3) {
            for (int j = 0, y = 0; j < board.length; j++, y += 3) {
                if (board[i][j] != '.') {
                    if (set_row.contains(board[i][j]))
                        return false;
                    set_row.add(board[i][j]);
                }
                if (board[j][i] != '.') {
                    if (set_col.contains(board[j][i]))
                        return false;
                    set_col.add(board[j][i]);
                }
                /*
                 * 1 2 3 4 5 6 7 8 9
                 */
                if (x < 9 && y < 9) {
                    Set<Character> set = new HashSet();
                    int count = 0;
                    for (int c = 0; c < 3; c++) {
                        for (int d = 0; d < 3; d++) {
                            char curr = board[x + d][y + c];
                            if (curr != '.') {
                                set.add(curr);
                                count++;
                            }
                        }
                    }

                    if (set.size() != count) {
                        return false;
                    }
                }
            }
            set_row.removeAll(set_row);
            set_col.removeAll(set_col);
            // set.removeAll(set);

        }

        /*
         * [["5","3",".",".","7",".",".",".","."], ["6",".",".","1","9","5",".",".","."]
         * [".","9","8",".",".",".",".","6","."], ["8",".",".",".","6",".",".",".","3"],
         * ["4",".",".","8",".","3",".",".","1"], ["7",".",".",".","2",".",".",".","6"],
         * [".","6",".",".",".",".","2","8","."], [".",".",".","4","1","9",".",".","5"],
         * [".",".",".",".","8",".",".","7","9"]]
         * 
         */

        return true;

    }
}