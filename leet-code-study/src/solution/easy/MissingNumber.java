package solution.easy;

import java.util.Arrays;
import java.util.stream.Stream;

public class MissingNumber {

	/*
	 * 268. Missing Number
	 */
	public int missingNumber(int[] nums) {
		
		Arrays.sort(nums);
		return Stream.iterate(0, i -> i+1)
			.limit(nums.length +1)
//			.forEach(System.out::println);
			.filter(idx -> {
				if (nums.length == idx) {
					return true;
				} else if (nums[idx] != idx) {
					return true;
				} else {
					return false;
				}
			})
			.mapToInt(Integer::intValue)
			.findAny().getAsInt();
	}
}
