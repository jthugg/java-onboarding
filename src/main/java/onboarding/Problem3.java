package onboarding;

public class Problem3 {

	public static int solution(int number) {
		int countClap = 0;
		for(int eachNumber = 1; eachNumber <= number; eachNumber++) {
			if(String.valueOf(eachNumber).contains("3") || String.valueOf(eachNumber).contains("6") ||
					String.valueOf(eachNumber).contains("9")) {
				countClap = count369(String.valueOf(eachNumber), countClap);
			}
		}
		return countClap;
	}

	private static int count369(String eachNumber, int countClap) {
		for(int i = 0; i < eachNumber.length(); i++) {
			if(eachNumber.charAt(i) == '3' || eachNumber.charAt(i) == '6' || eachNumber.charAt(i) == '9') {
				countClap++;
			}
		}
		return countClap;
	}
}
