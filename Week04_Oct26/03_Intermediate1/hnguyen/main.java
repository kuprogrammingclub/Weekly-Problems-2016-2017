import java.util.*;
import static java.util.Arrays.asList;
public class main2 {
	public static List<String> f(int sum, int currentToken, int previousToken) {
		if (sum == 0 && currentToken == 10) return asList("");
		if (currentToken > 9) return new ArrayList<String>();
		List<String> results = new ArrayList<String>();
		for (String s : f(sum-currentToken, currentToken+1, currentToken)) {
			results.add(currentToken == 1 ? (currentToken + s) : ("+" + currentToken + s));
		}
		if (previousToken != 0) {
			for (String s : (previousToken < 0 ? f(sum-9*previousToken+currentToken, currentToken+1, 10*previousToken-currentToken) : f(sum-9*previousToken-currentToken, currentToken+1, 10*previousToken+currentToken))) {
				results.add(currentToken + s);
			}
		}
		if (currentToken != 1) {
			for (String s : f(sum+currentToken, currentToken+1, -currentToken)) {
				results.add("-" + currentToken + s);
			}
		}
		return results;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (String s : f(100, 1, 0)) {
			System.out.println(s);
		};
	}
}
