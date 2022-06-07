package solution.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateMatrixBorder {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(new RotateMatrixBorder().solution(6, 6, new int [][] {{2,2,5,4}, {3,3,6,6}, {5,1,6,3}})));
		System.out.println(Arrays.toString(new RotateMatrixBorder().solution(3, 3, new int [][] {{1,1,2,2}, {1,2,2,3}, {2,1,3,2}, {2,2,3,3}})));
		System.out.println(Arrays.toString(new RotateMatrixBorder().solution(100, 97, new int [][] {{1,1,100,97}})));
	}

	/*
	 * 행렬 테두리 회전
	 */
	public int[] solution(int rows, int columns, int[][] queries) {
		
		int [][] matrix = new int [rows][columns];
		initMatrix(matrix);
		
		List<Integer> rsltList = new ArrayList<Integer>();
		for (int i = 0; i < queries.length; i++) {
			rsltList.add(rotate(matrix, queries[i]));
		}
		
		int[] answer = rsltList.stream().mapToInt(Integer::intValue).toArray();
		
		return answer;
	}
	
	private int rotate(int [][] matrix, int [] range) {
		int minNum = matrix.length * matrix[0].length;
		
		int tempNum = minNum+1;
		int curr = minNum+1;
		
		for (int i = range[1] - 1; i < range[3]; i++) {
			curr = matrix[range[0] - 1][i];
			matrix[range[0] - 1][i] = tempNum;
			tempNum = curr;
			minNum = Math.min(minNum, tempNum);
		}
		
		for (int i = range[0]; i < range[2]; i++) {
			curr = matrix[i][range[3] - 1];
			matrix[i][range[3] - 1] = tempNum;
			tempNum = curr;
			minNum = Math.min(minNum, tempNum);
		}
		
		for (int i = range[3] - 2; i > range[1] - 2; i--) {
			curr = matrix[range[2]-1][i];
			matrix[range[2]-1][i] = tempNum;
			tempNum = curr;
			minNum = Math.min(minNum, tempNum);
		}
		
		for (int i = range[2] - 2; i > range[0] - 2; i--) {
			curr = matrix[i][range[1]-1];
			matrix[i][range[1]-1] = tempNum;
			tempNum = curr;
			minNum = Math.min(minNum, tempNum);
		}
		
		return minNum;
	}
	
	private void initMatrix(int [][] matrix) {
		int interval = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = ++interval;
			}
		}
	}
}
