package solution.medium;

public class JumpGameII {

	/*
	 * 45. Jump Game II
	 */
	public int jump(int[] nums) {

		if (nums == null || nums.length <= 1) return 0;

		int currIdx = 0;
		int targetIdx = nums.length -1;
		int jumpLength = 0;
		
		return calcJump(nums, currIdx, targetIdx, jumpLength, Integer.MAX_VALUE);
	}

	private int calcJump(int[] nums, int currIdx, int targetIdx, int jumpLength, int min) {

		if (currIdx > targetIdx || nums[currIdx] == 0) return Integer.MAX_VALUE;
		if (currIdx == targetIdx) return Math.min(jumpLength, min);

		int tmp = Math.min(calcJump(nums, currIdx + nums[currIdx], targetIdx, jumpLength+1, min), min);

		min = Math.min(calcJump(nums, currIdx+1, targetIdx, jumpLength+1, min), tmp);

		return min;
	}

}
