package solution.medium;

import java.util.ArrayList;
import java.util.List;

public class MergeIntervals {

    /*
     * 56. Merge Intervals
     */
    public int[][] merge(int[][] intervals) {

        if (intervals.length == 1) return intervals;

        List<int[]> indexList = new ArrayList<>();

        indexList.add(intervals[0]);

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i-1][1] >= intervals[i][0]) {
                indexList.get(indexList.size()-1)[1] = Math.max(intervals[i][0], intervals[i][1]);
            } else {
                indexList.add(intervals[i]);
            }
        }

        int[][] rslt = new int[indexList.size()][2];
        for (int i = 0; i < indexList.size(); i++) {
            rslt[i] = indexList.get(i);
        }

        return rslt;
    }
}
