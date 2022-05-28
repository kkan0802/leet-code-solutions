package solution.medium;

public class LengthOfLongestSubstring {

	/*
	 * 3. Longest Substring Without Repeating Characters
	 */
	public int lengthOfLongestSubstring(String s) {
		int chckStIdx = 0, maxLen = 0;
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < s.length(); i++) {
			String tmpStr = Character.toString(s.charAt(i));
			int index = sb.indexOf(tmpStr, chckStIdx);
			if (index > -1) {
				chckStIdx = index + 1;
				maxLen = Math.max(maxLen, i - index);
			}
			sb.append(tmpStr);
			
		}
		
		return maxLen;
	}
}
