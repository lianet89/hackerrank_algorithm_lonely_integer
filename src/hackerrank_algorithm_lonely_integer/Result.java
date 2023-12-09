package hackerrank_algorithm_lonely_integer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Result {
	public static int lonelyInteger(List<Integer> a) {
		int n = a.size();
		int lonelyInteger = 0;
		List<Integer> lonely = new ArrayList<Integer>();

		if (1 <= n && n < 100 && n % 2 == 1) {
			for (Integer i : a) {
				if (Collections.frequency(a, i) == 1) {
					lonely.add(i);
				}
			}
			if (lonely.size() == 1) {
				lonelyInteger = lonely.get(0);
			}
		}
		return lonelyInteger;
	}

}
