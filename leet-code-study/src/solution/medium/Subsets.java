package solution.medium;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

    /*
     * 78. Subsets
     */
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> rslt = new ArrayList<>();
        if (nums == null) return rslt;

        extractItemCase(nums, rslt, new ArrayList<>(), 0);

        return rslt;
    }

    private void extractItemCase(int[] nums, List<List<Integer>> list, List<Integer> subSet, int startIdx) {
        if (nums.length == startIdx) {
            list.add(new ArrayList<>(subSet));
            return;
        }

        extractItemCase(nums, list, subSet, startIdx + 1);
        subSet.add(nums[startIdx]);
        extractItemCase(nums, list, subSet, startIdx + 1);
        subSet.remove(subSet.size() - 1);

    }
}
