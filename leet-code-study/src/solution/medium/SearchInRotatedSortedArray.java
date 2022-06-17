package solution.medium;

import java.util.Arrays;

public class SearchInRotatedSortedArray {

    /*
     * 33. Search in Rotated Sorted Array
     */
    public int search(int[] nums, int target) {

        if (nums == null || nums.length == 0) return -1;

        int mid = nums.length / 2;

        if (nums[mid] == target) {
            return mid;
        } else if (isLeft(nums[mid], Math.min(nums[0], nums[mid]), target)) {
            return searchRecursive(Arrays.copyOfRange(nums, 0, mid), target, 0);
        } else {
            return searchRecursive(Arrays.copyOfRange(nums, mid + 1, nums.length), target, mid + 1);
        }

    }

    private int searchRecursive(int[] nums, int target, int curIdx) {

        if (nums == null || nums.length == 0) return -1;

        int mid = nums.length / 2;

        if (nums[mid] == target) {
            return curIdx + mid;
        } else if (isLeft(nums[mid], Math.min(nums[0], nums[mid]), target)) {
            return searchRecursive(Arrays.copyOfRange(nums, 0, mid), target, curIdx);
        } else {
            return searchRecursive(Arrays.copyOfRange(nums, mid + 1, nums.length), target, curIdx + mid + 1);
        }

    }

    private boolean isLeft(int num1, int num2, int val) {
        int minVal = Math.min(num1, num2);
        int maxVal = Math.max(num1, num2);

        return minVal <= val && maxVal >= val;
    }
}
