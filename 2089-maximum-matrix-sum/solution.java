class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long sum = 0;
        int min = Integer.MAX_VALUE;
        int negativeCount = 0;

        for (int[] row : matrix) {
            for (int val : row) {
                if (val < 0) negativeCount++;
                int abs = Math.abs(val);
                sum += abs;
                min = Math.min(min, abs);
            }
        }

        if (negativeCount % 2 == 0) {
            return sum;
        } else {
            return sum - 2L * min;
        }
    }
}
