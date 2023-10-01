package String;

import java.util.Scanner;

public class 대소문자_변환 {
	static String solution(String s) {
		String result = "";

		for (char c : s.toCharArray()) {
			if(Character.isLowerCase(c)) result += Character.toUpperCase(c);
			else result += Character.toLowerCase(c);
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
