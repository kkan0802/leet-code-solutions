package solution.medium;

public class MinimumPathSum {

	/*
	 * 64. Minimum Path Sum
	 */
	public int minPathSum(int[][] grid) {
		return movePaths(grid, 0, 0, 0, Integer.MAX_VALUE);
	}

	public int movePaths(int[][] grid, int currX, int currY, int sumVal, int minSum) {

		if (currX == grid.length - 1 && currY == grid[grid.length - 1].length - 1) {
			return Math.min(sumVal + grid[currX][currY], minSum);
		}

		if (currX < grid.length - 1) {
			minSum = Math.min(movePaths(grid, currX + 1, currY, sumVal + grid[currX][currY], minSum), minSum);
		}
		if (currY < grid[grid.length - 1].length - 1) {
			minSum = Math.min(movePaths(grid, currX, currY + 1, sumVal + grid[currX][currY], minSum), minSum);
		}

		return minSum;
	}
}
