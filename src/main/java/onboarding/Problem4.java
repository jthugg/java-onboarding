package onboarding;

public class Problem4 {

	public static String solution(String word) {
		char[] spellsOfWord = word.toCharArray();
		StringBuilder convertedWord = new StringBuilder();
		for(char spell : spellsOfWord) {
			convertedWord.append(checkSpell(spell));
		}
		return convertedWord.toString();
	}

	private static char checkSpell(char spell) {
		if(isLowerCase(spell)) {
			return convertLowerCase(spell);
		}
		if(isUpperCase(spell)) {
			return convertUpperCase(spell);
		}
		return spell;
	}

	private static boolean isUpperCase(char spell) {
		return spell >= 65 && spell <= 90;
	}

	private static boolean isLowerCase(char spell) {
		return spell >= 97 && spell <= 122;
	}
}
