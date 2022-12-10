package onboarding;

import java.util.ArrayList;
import java.util.List;

public class Problem2 {

	public static String solution(String cryptogram) {
		while (hasDuplicatedPart(cryptogram)) {
			cryptogram = removeDuplicatedPart(cryptogram, getDuplicatedPart(cryptogram));
		}
		return cryptogram;
	}

	private static boolean hasDuplicatedPart(String cryptogram) {
		if(cryptogram.length() == 0) {
			return false;
		}
		return getDuplicatedPart(cryptogram).size() > 0;
	}

	private static List<String> getDuplicatedPart(String cryptogram) {
		List<String> duplicatedParts = new ArrayList<>();
		String duplicatedPart = String.valueOf(cryptogram.charAt(0));
		for (int count = 1; count < cryptogram.length(); count++) {
			if (cryptogram.charAt(count - 1) == cryptogram.charAt(count)) {
				duplicatedPart += cryptogram.charAt(count);
			}
			if ((cryptogram.charAt(count - 1) != cryptogram.charAt(count)) || count == cryptogram.length() - 1) {
				if(duplicatedPart.length() > 1) {
					duplicatedParts.add(duplicatedPart);
				}
				duplicatedPart = String.valueOf(cryptogram.charAt(count));
			}
		}
		return duplicatedParts;
	}

	private static String removeDuplicatedPart(String cryptogram, List<String> duplicatedParts) {
		for (String duplicatedPart : duplicatedParts) {
			cryptogram = cryptogram.replace(duplicatedPart, " ");
		}
		return cryptogram.replaceAll(" ", "");
	}
}
