package solution.medium;

public class UniquePaths {

	/*
	 * 62. Unique Paths
	 */
	public int uniquePaths(int m, int n) {
		return movePaths(0, 0, m - 1, n - 1, 0);
	}

	public int movePaths(int currX, int currY, int targetX, int targetY, int pathCnt) {

		if (currX == targetX && currY == targetY) {
			return pathCnt + 1;
		}

		if (currX < targetX) {
			pathCnt = movePaths(currX + 1, currY, targetX, targetY, pathCnt);
		}
		if (currY < targetY) {
			pathCnt = movePaths(currX, currY + 1, targetX, targetY, pathCnt);
		}

		return pathCnt;
	}
}
