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
		if (validateLength(pobi, crong) || validateCoverPage(pobi, crong) || validatePage(pobi, crong)) {
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
}