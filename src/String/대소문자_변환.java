import java.util.Scanner;

public class 대소문자_변환 {
	static String solution(String s) {
		String result = "";
		char limit = 'Z';

		for (char c : s.toCharArray()) {
			if ((int)c <= (int)limit) {
				result += Character.toLowerCase(c);
			} else {
				result += Character.toUpperCase(c);
			}
		}

		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		String result = solution(str);
		System.out.println(result);
	}
}
