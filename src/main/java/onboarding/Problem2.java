package onboarding;

public class Problem2 {

	public static String solution(String cryptogram) {
		while (hasDuplicatedPart(cryptogram)) {
			cryptogram = removeDuplicatedPart(cryptogram, getDuplicatedPart(cryptogram));
		}
		return cryptogram;
	}
}
