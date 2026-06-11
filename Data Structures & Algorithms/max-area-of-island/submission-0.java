class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1)
                    max = Math.max(dfs(grid, i, j), max);
            }
        }

        return max;
    }

    private int dfs(int[][] grid, int i, int j) {
        grid[i][j] = 0;
        int sum = 1;
        if (i > 0 && grid[i-1][j] == 1) 
            sum += dfs(grid, i-1, j);
        if (j > 0 && grid[i][j-1] == 1) {
            sum += dfs(grid, i, j-1);
        }
        if (i < grid.length-1 && grid[i+1][j] == 1)
            sum += dfs(grid, i+1, j);
        if (j < grid[0].length-1 && grid[i][j+1] == 1) {
            sum += dfs(grid, i, j+1);
        }

        return sum;
    }
}
