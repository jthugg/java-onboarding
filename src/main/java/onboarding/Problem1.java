package onboarding;

import java.util.List;

class Problem1 {

	public static int solution(List<Integer> pobi, List<Integer> crong) {
		if (validatePobiAndCrong(pobi, crong)) {
			return -1;
		}
		return runPobiVsCrong(pobi, crong);
	}

	private static boolean validatePobiAndCrong(List<Integer> pobi, List<Integer> crong) {
		if (validateLength(pobi, crong) || validateHasCoverPage(pobi, crong) || validatePage(pobi, crong)) {
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
}