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
}