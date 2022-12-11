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
}
