package solution.medium;

public class JumpGame {

    /*
     * 55. Jump Game
     */
    public boolean canJump(int[] nums) {

        return checkJumpEnable(nums, 0);

    }

    private boolean checkJumpEnable(int[] nums, int currIdx) {
        if (nums[currIdx] == 0) return false;
        if (currIdx == nums.length -1) return true;

        if (!checkJumpEnable(nums, currIdx + nums[currIdx])) {
            return checkJumpEnable(nums, currIdx + 1);
        } else {
            return true;
        }

    }
}
