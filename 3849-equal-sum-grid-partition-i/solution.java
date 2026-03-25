class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        long totalSum = 0;

        // total sum of grid
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                totalSum += grid[i][j];
            }
        }

        // if odd → not possible
        if(totalSum % 2 != 0) return false;

        // check horizontal cuts
        long prefixSum = 0;
        for(int i = 0; i < n - 1; i++) {
            long rowSum = 0;

            for(int j = 0; j < m; j++) {
                rowSum += grid[i][j];
            }

            prefixSum += rowSum;

            if(prefixSum == totalSum - prefixSum) {
                return true;
            }
        }

        // check vertical cuts
        prefixSum = 0;
        for(int j = 0; j < m - 1; j++) {
            long colSum = 0;

            for(int i = 0; i < n; i++) {
                colSum += grid[i][j];
            }

            prefixSum += colSum;

            if(prefixSum == totalSum - prefixSum) {
                return true;
            }
        }

        return false;
    }
}
