package solution.medium;

import java.util.Arrays;

public class SearchA2DMatrix {

    /*
     * 74. Search a 2D Matrix
     */

    public boolean searchMatrix(int[][] matrix, int target) {
        boolean searchRslt = false;
        for (int i = 0; i < matrix.length; i++) {
            if (target >= matrix[i][0] && target <= matrix[i][matrix[i].length - 1]) {
                return searchTarget(matrix[i], target);
            }
        }
        return searchRslt;
    }

    private boolean searchTarget(int[] matrix, int target) {
        if (matrix == null || matrix.length == 0) return false;
        int midIdx = matrix.length / 2;
        if (matrix[midIdx] == target) return true;

        if (matrix[midIdx] < target) {
            return searchTarget(Arrays.copyOfRange(matrix, midIdx+1, matrix.length), target);
        } else if (matrix[midIdx] > target) {
            return searchTarget(Arrays.copyOfRange(matrix, 0, midIdx), target);
        }

        return false;
    }

}
