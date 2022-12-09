package onboarding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Problem1 {

	public static int solution(List<Integer> pobi, List<Integer> crong) {
		if (validatePobiAndCrong(pobi, crong)) {
			return -1;
		}
		return runPobiVsCrong(pobi, crong);
	}

	private static boolean validatePobiAndCrong(List<Integer> pobi, List<Integer> crong) {
		if (validateLength(pobi, crong) || validateHasCoverPage(pobi, crong) || validatePageContinuous(pobi, crong)) {
			return true;
		}
		return false;
	}

	private static boolean validateLength(List<Integer> pobi, List<Integer> crong) {
		if (pobi.size() != 2 || crong.size() != 2) {
			return true;
		}
		return false;
	}

	private static boolean validateHasCoverPage(List<Integer> pobi, List<Integer> crong) {
		if (pobi.get(0) < 1 || pobi.get(1) > 400 || crong.get(0) < 1 || crong.get(1) > 400) {
			return true;
		}
		return false;
	}

	private static boolean validatePageContinuous(List<Integer> pobi, List<Integer> crong) {
		if (pobi.get(1) - pobi.get(0) != 1 || crong.get(1) - crong.get(0) != 1) {
			return true;
		}
		return validateEvenOdd(pobi, crong);
	}

	private static boolean validateEvenOdd(List<Integer> pobi, List<Integer> crong) {
		return pobi.get(0) % 2 == 1 && crong.get(0) % 2 == 1 && pobi.get(1) % 2 == 0 && crong.get(1) == 0;
	}

	private static int runPobiVsCrong(List<Integer> pobi, List<Integer> crong) {
		return compareNumbers(getBestChoice(pobi), getBestChoice(crong));
	}

	private static int getBestChoice(List<Integer> pages) {
		List<Integer> cases = getCases(pages);
		return Collections.max(cases);
	}

	private static List<Integer> getCases(List<Integer> pages) {
		List<Integer> cases = new ArrayList<>();
		cases.add(getSum(pages.get(0)));
		cases.add(getSum(pages.get(1)));
		cases.add(getMul(pages.get(0)));
		cases.add(getMul(pages.get(1)));
		return cases;
	}

	private static Integer getSum(Integer number) {
		int sum = 0;
		for (; number > 0; number /= 10) {
			sum += number % 10;
		}
		return sum;
	}

	private static Integer getMul(Integer number) {
		int mul = 1;
		for (; number > 0; number /= 10) {
			mul *= number % 10;
		}
		return mul;
	}
}