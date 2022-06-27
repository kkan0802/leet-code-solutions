package solution.medium;

public class SortColors {

    /*
     * 75. Sort Colors
     */
    public void sortColors(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            int min = nums[i];
            int minIdx = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (min > nums[j]) {
                    min = nums[j];
                    minIdx = j;
                }
            }
            if (minIdx != i) switchNumber(nums, i, minIdx);
        }
    }

    private void switchNumber(int[] nums, int src, int trgt) {
        int tmp = nums[trgt];
        nums[trgt] = nums[src];
        nums[src] = tmp;
    }
}
