package solution.medium;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {

	/*
	 * 22. Generate Parentheses
	 */
	public List<String> generateParenthesis(int n) {
		List<String> rsltList = new ArrayList<String>();

		backtrack(rsltList, "", 0, 0, n);
		return rsltList;

	}

	private void backtrack(List<String> res, String currentString, int open, int close, int max) {

		if (currentString.length() == max * 2) {
			res.add(currentString);
			return;
		}

		if (open < max)
			backtrack(res, currentString + "(", open + 1, close, max);
		if (close < open)
			backtrack(res, currentString + ")", open, close + 1, max);

	}
}
