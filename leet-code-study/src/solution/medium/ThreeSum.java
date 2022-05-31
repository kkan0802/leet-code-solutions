package solution.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThreeSum {
    
    /*
     * 15. 3Sum
     */
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> rsltList = new ArrayList<>();
        
        if (nums == null || nums.length < 3) return rsltList;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> itemList = Arrays.asList(nums[i], nums[j], nums[k]);
                        Collections.sort(itemList);

                        if (!rsltList.contains(itemList)) {
                            rsltList.add(itemList);
                        }
                    }
                }
            }
        }
        
        return rsltList;
    }
}
