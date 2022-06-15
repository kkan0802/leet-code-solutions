package solution.medium;

import java.util.Arrays;

public class NextPermutation {

	/*
	 * 
	 * 31. Next Permutation
	 * 
	 */
	public void nextPermutation(int[] nums) {

		if (nums == null || nums.length <= 1)
			return;

		int targetIdx = 0;

		for (int i = 1; i < nums.length; i++) {
			if (nums[i - 1] < nums[i]) {
				targetIdx = i;
			}
		}

		if (targetIdx == 0) {
			Arrays.sort(nums);
		} else if (targetIdx == nums.length - 1) {
			switchNumber(nums, targetIdx, targetIdx - 1);
		} else {
			int targetvalPrev = nums[targetIdx - 1];
			int targetval = nums[targetIdx];
			int[] copyArr = Arrays.copyOfRange(nums, targetIdx, nums.length);
			int switchVal = Arrays.stream(copyArr).filter(x -> targetvalPrev < x && targetval != x).reduce(999, Math::min);

			if (switchVal == 999) {
				switchVal = targetval;
			}

			int switchIdx = 0;

			for (int i = 0; i < nums.length; i++) {
				if (switchVal == nums[i]) {
					switchIdx = i;
					break;
				}
			}

			switchNumber(nums, switchIdx, targetIdx - 1);
			Arrays.sort(nums, targetIdx, nums.length);
		}

	}

	private void switchNumber(int[] nums, int targetIdx, int switchIdx) {
		int temp = nums[targetIdx];
		nums[targetIdx] = nums[switchIdx];
		nums[switchIdx] = temp;
		Arrays.sort(nums, targetIdx, nums.length);
	}

	public boolean conFirmEquals(int[] srcArr, int[] trtArr) {
		boolean rslt = false;
		
		if (srcArr.length == trtArr.length) {
			for (int i = 0; i < srcArr.length; i++) {
				if (srcArr[i] == trtArr[i]) {
					rslt = true;
				} else {
					rslt = false;
					break;
				}
			}
		}
		
		return rslt;
	}

}
