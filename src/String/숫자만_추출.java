package String;

import java.util.Scanner;

public class 숫자만_추출 {
	static int solution(String str) {
		String result = "";
		for (char c : str.toCharArray()) {
			if (Character.isDigit(c)) result += c;
		}
		return Integer.parseInt(result);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(solution(str));
	}
}
