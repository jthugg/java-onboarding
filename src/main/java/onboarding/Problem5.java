package onboarding;

import java.util.ArrayList;
import java.util.List;

public class Problem5 {

	public static List<Integer> solution(int money) {
		return collectMoney(money);
	}

	private static List<Integer> collectMoney(int money) {
		List<Integer> wallet = new ArrayList<>();
		for(int factor = 50000; factor >= 1; factor /= makeFactor(factor)) {
			wallet.add(money / factor);
			money %= factor;
		}
		return wallet;
	}

	private static int makeFactor(int factor) {
		if(factor == 10) {
			return 10;
		}
		if(String.valueOf(factor).charAt(0) == '5') {
			return 5;
		}
		return 2;
	}
}
