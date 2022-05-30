package solution.medium;

public class LongestPalindrome {

	/*
	 * 5. Longest Palindromic Substring
	 */
	public String longestPalindrome(String s) {
		if (s == null || "".equals(s)) return "";

		int chckStIdx = 0, maxLen = 0;

		String longestSubstring = "";
		
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {
			String tmpStr = Character.toString(s.charAt(i));
			int index = sb.indexOf(tmpStr, chckStIdx);
			if (index > -1) {
				
				chckStIdx = Math.min(chckStIdx, index+1);
				
				if (!this.isPalindrome(s.substring(index, i+1))) {
					continue;
				}
				
				int subMax = Math.max(maxLen, i - index);
				if (maxLen < subMax) {
					longestSubstring = s.substring(index, i+1);
					maxLen = subMax;
				}
			}
			sb.append(tmpStr);

		}
		
		String palindrome = longestSubstring.length() > 0? 
				longestPalindrome(s.replace(longestSubstring, ""))
				: "";

		longestSubstring = (palindrome != null && palindrome.length() > longestSubstring.length()) ?
				palindrome:
					longestSubstring;
		return longestSubstring;
	}
	
	private boolean isPalindrome(String palindromeString) {
		
		int mid = (palindromeString.length() / 2) + (palindromeString.length() % 2);
		
		for (int i = 0; i < mid - (palindromeString.length() % 2); i++) {
			if (!Character.toString(palindromeString.charAt(i))
					.equals(Character.toString(palindromeString.charAt(palindromeString.length() - 1 - i)))) {
				return false;
			}
		}
		
		return true;
	}
}
