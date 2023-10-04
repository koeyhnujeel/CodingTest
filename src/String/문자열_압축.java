package String;

import java.util.Scanner;

public class 문자열_압축 {
	static String solution(String str) {
		String result = "";
		String s = str + " ";
		int cnt = 1;

		for (int i = 0; i < str.length() - 1; i++) {
			if (s.charAt(i) == s.charAt(i + 1)) cnt++;
			else {
				result += s.charAt(i);
				if (cnt > 1) result += cnt;
				cnt = 1;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String result = solution(str);
		System.out.println(result);
	}
}
