package solution.medium;

public class UniqueBinarySearchTrees {

	/*
	 * 96. Unique Binary Search Trees
	 */
	public int numTrees(int n) {
		if (n <= 2) return n;
		if (n == 3) return 5;

		int [] count = new int[n+1];

		count[0] = 1;
		count[1] = 1;
		count[2] = 2;

		for (int i = 3; i <= n; i++) {
			int left = 0;
			int right = i - 1;

			while (left < right) {
				count[i] += 2 * count[left]*count[right];
				left++;
				right--;
			}

			if (left == right) {
				count[i] += count[left] * count[right];
			}
		}

		return count[n];
	}
}
