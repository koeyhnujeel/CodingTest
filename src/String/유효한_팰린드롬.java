package String;

import java.util.Scanner;

public class 유효한_팰린드롬 {
	static String solution(String str) {
		String tmp = str.toUpperCase().replaceAll("[^A-Z]", "");
		String reverse = new StringBuilder(tmp).reverse().toString();
		return tmp.equals(reverse) ? "YES" : "NO";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String result = solution(str);
		System.out.println(result);
	}
}
