package String;

import java.util.Scanner;

public class 회문_문자열 {
	static String solution(String str) {
		String origin = str.toUpperCase();
		String reverse = new StringBuilder(origin).reverse().toString();

		return origin.equals(reverse) ? "YES" : "NO";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String result = solution(str);

		System.out.println(result);
	}
}
