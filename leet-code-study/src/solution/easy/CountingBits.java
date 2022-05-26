package solution.easy;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CountingBits {

	/*
	 * 338. Counting Bits
	 */
	public int[] countBits(int n) {

		List<Integer> rsltList
			= Stream.iterate(0, i -> i + 1)
					.limit(n+1)
					.collect(ArrayList::new
							, (list, idx) -> {
								ArrayDeque<Integer> arrDeque = numberToBits(idx);
								arrDeque.removeIf(x -> x == 0);
								list.add(arrDeque.size());
							}
							, ArrayList::addAll);
		
		return rsltList.stream().mapToInt(Integer::intValue).toArray();
	}
	
	private ArrayDeque<Integer> numberToBits(int n) {
		ArrayDeque<Integer> arrDeque = new ArrayDeque<Integer>();

		while (n != 0) {
			arrDeque.addFirst(n % 2);
			n = n / 2;
		}
		return arrDeque;
	}
	
}
