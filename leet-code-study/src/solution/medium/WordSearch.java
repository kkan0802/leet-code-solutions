package solution.medium;

import java.util.ArrayList;

import java.util.Arrays;

import java.util.List;

 

public class WordSearch {

	/*
	 * 79. Word Search
	 */
	public boolean exist(char[][] board, String word) {
		if (board == null || word == null)
			return false;

		char[] charArray = word.toCharArray();

		List<int[]> startIdxList = new ArrayList<>();

		findStartIdx(board, charArray, startIdxList);

		if (startIdxList.isEmpty())
			return false;

		for (int[] startIdx : startIdxList) {

			boolean findExist = findExist(board, charArray, startIdx);

			if (findExist)
				return findExist;

		}

		return false;

	}

	private boolean findExist(char[][] board, char[] charArray, int[] startIdx) {

		if (charArray.length <= 1)
			return true;

		List<int[]> usedIdxList = new ArrayList<>(Arrays.asList(startIdx));

		return findNextChar(board, usedIdxList, startIdx, charArray, 1);

	}

	private boolean findNextChar(char[][] board, List<int[]> usedIdxList, int[] startIdx, char[] charArray,
			int currIdx) {

		if (charArray.length == currIdx)
			return true;

		int row = startIdx[0];

		int col = startIdx[1];

		int[] up = (isPossibleMove(board, usedIdxList, row, col - 1)) ? new int[] { row, col - 1 } : null;
		int[] right = (isPossibleMove(board, usedIdxList, row + 1, col)) ? new int[] { row + 1, col } : null;
		int[] down = (isPossibleMove(board, usedIdxList, row, col + 1)) ? new int[] { row, col + 1 } : null;
		int[] left = (isPossibleMove(board, usedIdxList, row - 1, col)) ? new int[] { row - 1, col } : null;

		if (up != null) {
			if (board[up[0]][up[1]] == charArray[currIdx]) {
				usedIdxList.add(up);
				boolean rslt = findNextChar(board, usedIdxList, up, charArray, currIdx + 1);
				if (rslt) {
					return true;
				} else {
					usedIdxList.remove(usedIdxList.size() - 1);
				}
			}
		}

		if (right != null) {
			if (board[right[0]][right[1]] == charArray[currIdx]) {
				usedIdxList.add(right);
				boolean rslt = findNextChar(board, usedIdxList, right, charArray, currIdx + 1);
				if (rslt) {
					return true;
				} else {
					usedIdxList.remove(usedIdxList.size() - 1);
				}
			}
		}

		if (down != null) {
			if (board[down[0]][down[1]] == charArray[currIdx]) {
				usedIdxList.add(down);
				boolean rslt = findNextChar(board, usedIdxList, down, charArray, currIdx + 1);
				if (rslt) {
					return true;
				} else {
					usedIdxList.remove(usedIdxList.size() - 1);
				}
			}
		}

		if (left != null) {
			if (board[left[0]][left[1]] == charArray[currIdx]) {
				usedIdxList.add(left);
				boolean rslt = findNextChar(board, usedIdxList, left, charArray, currIdx + 1);
				if (rslt) {
					return true;
				} else {
					usedIdxList.remove(usedIdxList.size() - 1);
				}
			}
		}

		return false;

	}

	private boolean isPossibleMove(char[][] board, List<int[]> usedIdxList, int row, int col) {

		if (0 > row) return false;
		if (0 > col) return false;
		if (board.length - 1 < row) return false;
		if (board[row].length - 1 < col) return false;
		if (contains(usedIdxList, new int[] { row, col })) return false;
		return true;

	}

	private boolean contains(List<int[]> usedIdxList, int[] trgt) {
		for (int[] idx : usedIdxList) {
			if (idx[0] == trgt[0] && idx[1] == trgt[1])
				return true;
		}

		return false;

	}

	private void findStartIdx(char[][] board, char[] charArray, List<int[]> startIdxList) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] == charArray[0])
					startIdxList.add(new int[] { i, j });
			}
		}
	}

}