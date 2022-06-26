package solution.medium;

import java.util.HashSet;
import java.util.Set;

public class SetMatrixZeroes {

	/*
	 * 73. Set Matrix Zeroes
	 */
	public void setZeroes(int[][] matrix) {

		Set<int[]> zeroSet = new HashSet<int[]>();

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == 0) {
					zeroSet.add(new int[] { i + 1, j });
					zeroSet.add(new int[] { i, j + 1 });
					zeroSet.add(new int[] { i - 1, j });
					zeroSet.add(new int[] { i, j - 1 });
				}
			}
		}

		zeroSet.iterator().forEachRemaining(targetArr -> {
			int x = fixIdx(targetArr[0], matrix.length);
			int y = fixIdx(targetArr[1], matrix[0].length);
			matrix[x][y] = 0;
		});

	}

	private int fixIdx(int idx, int maxLen) {

		if (idx >= maxLen)
			return 0;
		else if (idx < 0)
			return maxLen - 1;
		else
			return idx;

	}
}
