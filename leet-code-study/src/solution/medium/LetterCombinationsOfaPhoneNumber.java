package solution.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class LetterCombinationsOfaPhoneNumber {

	/*
	 * 17. Letter Combinations of a Phone Number
	 */
	public List<String> letterCombinations(String digits) {
		List<String> rsltList = new ArrayList<>();

		if (digits == null || digits.isEmpty()) {
			return rsltList;
		}

		Map<String, String> phoneCharacter = new HashMap<>();
		phoneCharacter.put("2", "abc");
		phoneCharacter.put("3", "def");
		phoneCharacter.put("4", "ghi");
		phoneCharacter.put("5", "jkl");
		phoneCharacter.put("6", "mno");
		phoneCharacter.put("7", "pqrs");
		phoneCharacter.put("8", "tuv");
		phoneCharacter.put("9", "wxyz");

		for (int i = 0; i < digits.length(); i++) {
			String numbersLetter = phoneCharacter.get(Character.toString(digits.charAt(i)));

			possibleLetter(numbersLetter, phoneCharacter, rsltList);

		}

		return rsltList;
	}

	private void possibleLetter(String numbersLetter, Map<String, String> phoneCharacter, List<String> rsltList) {

		if (rsltList.isEmpty()) {
			Stream.iterate(0, i -> i + 1).limit(numbersLetter.length()).forEach(idx -> {
				rsltList.add(Character.toString(numbersLetter.charAt(idx)));
			});
		} else {
			List<String> list = new ArrayList<>();

			rsltList.stream().forEach(item -> {
				Stream.iterate(0, i -> i + 1).limit(numbersLetter.length()).forEach(idx -> {
					list.add(item.concat(Character.toString(numbersLetter.charAt(idx))));
				});
			});

			rsltList.clear();
			rsltList.addAll(list);
		}

	}
}
