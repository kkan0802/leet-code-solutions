package solution.medium;

import java.util.Arrays;

public class FindFirstAndLastPositionOfElementInSortedArray {

	/*
	 * 34. Find First and Last Position of Element in Sorted Array
	 */
	public int[] searchRange(int[] nums, int target) {
		int[] rslt = new int[] { -1, -1 };

		searchRecursive(nums, target, 0, rslt);

		return rslt;
	}
	
	private void searchRecursive(int[] nums, int target, int currIdx, int[] rslt) {

		if (nums == null || nums.length == 0) return;

		int mid = nums.length / 2;
		if (nums[mid] == target) {
			if (rslt[0] == -1) {
				rslt[0] = currIdx + mid;
			} else {
				rslt[0] = Math.min(rslt[0], currIdx + mid);
			}
			if (rslt[1] == -1) {
				rslt[1] = currIdx + mid;
			} else {
				rslt[1] = Math.max(rslt[1], currIdx + mid);
			}
			
		} 
		if (nums[mid] >= target) {
			searchRecursive(Arrays.copyOfRange(nums, 0, mid), target, currIdx, rslt);
		} 

		if (nums[mid] <= target) {
			searchRecursive(Arrays.copyOfRange(nums, mid + 1, nums.length), target, currIdx + mid + 1, rslt);
		}

	}
}
