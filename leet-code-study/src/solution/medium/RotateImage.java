package solution.medium;

public class RotateImage {

    /*
     * 48. Rotate Image
     */
    public void rotate(int[][] matrix) {
        if (matrix == null) return;

        int[][] copyMatrix = new int[matrix.length][matrix[0].length];

        copyArray(matrix, copyMatrix);

        int targetLength = matrix.length;

        for (int i = 0; i < targetLength/2; i++) {
            for (int j = 0; j < targetLength; j++) {
                matrix[j][targetLength-1 -i] = copyMatrix[i][j];
            }
            for (int j = targetLength -1; j > 0; j--) {
                matrix[targetLength-1 -i][targetLength-1 -j] = copyMatrix[j][targetLength-1 -i];
            }
            for (int j = targetLength -1; j > 0; j--) {
                matrix[targetLength-1 -j][i] = copyMatrix[targetLength-1 -i][targetLength-1 -j];
            }
            for (int j = 1; j < targetLength-1; j++) {
                matrix[i][j] = copyMatrix[targetLength-1 -j][i];
            }
        }
        
    }

    private void copyArray(int[][] src, int[][] target) {
        for (int i = 0; i < src.length; i++) {
            for (int j = 0; j < src[i].length; j++) {
                target[i][j] = src[i][j];
            }
        }
    }
}
