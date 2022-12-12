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
}
