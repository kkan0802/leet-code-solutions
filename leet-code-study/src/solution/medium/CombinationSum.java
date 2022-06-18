package solution.medium;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

	/*
	 * 39. Combination Sum
	 */
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> rsltList = new ArrayList<List<Integer>>();

		findcombinationSum(0, candidates, rsltList, target, new ArrayList<>());

		return rsltList;
	}

	private void findcombinationSum(int i, int[] candidates, List<List<Integer>> rsltList, int target,
			List<Integer> arrayList) {

		if (i == candidates.length) {
			if (target == 0 ) {
				rsltList.add(new ArrayList<>(arrayList));
			}
			return;
		}

		if (candidates[i] <= target) {
			arrayList.add(candidates[i]);
			findcombinationSum(i, candidates, rsltList, target - candidates[i], arrayList);
			arrayList.remove(arrayList.size() -1);
		}

		findcombinationSum(i + 1, candidates, rsltList, target, arrayList);

	}
	
}
