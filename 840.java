class Solution {
    int k = (3 * (3 ^ 2 + 1)) / 2; // n(n^2)/2

    public int numMagicSquaresInside(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int square = 0;
        for (int y = 0; y < rows - 2; y++) {
            for (int x = 0; x < cols - 2; x++) {
                if (grid[y + 1][x + 1] != 5)
                    continue;
                if (magic(grid[y][x], grid[y][x + 1], grid[y][x + 2], grid[y + 1][x], grid[y + 1][x + 1],
                        grid[y + 1][x + 2], grid[y + 2][x], grid[y + 2][x + 1], grid[y + 2][x + 2]))
                    square++;
            }
        }

        return square;
    }

    public boolean magic(int... nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (Integer num : nums) {
            if (num < 1 || num > 9)
                return false;
            if (set.contains(num))
                return false;
            set.add(num);
        }

        return (nums[0] + nums[1] + nums[2] == 15 && nums[3] + nums[4] + nums[5] == 15
                && nums[6] + nums[7] + nums[8] == 15 && nums[0] + nums[3] + nums[6] == 15
                && nums[1] + nums[4] + nums[7] == 15 && nums[2] + nums[5] + nums[8] == 15
                && nums[0] + nums[4] + nums[8] == 15 && nums[2] + nums[4] + nums[6] == 15);
    }
}