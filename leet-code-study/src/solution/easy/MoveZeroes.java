package solution.easy;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class MoveZeroes {

    /*
     * 283. Move Zeroes
     */
    public void moveZeroes(int[] nums) {
        Queue<Integer> nonZeroItmList = new LinkedList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nonZeroItmList.add(nums[i]);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (!nonZeroItmList.isEmpty()) {
                nums[i] = nonZeroItmList.poll();
            } else {
                nums[i] = 0;
            }
        }

    }
}
