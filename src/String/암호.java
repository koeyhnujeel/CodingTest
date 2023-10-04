package String;

import java.util.Scanner;

public class 암호 {
	static String solution(String str) {
		String result = "";
		String tmp = "";
		int cnt = 0;
		for (int i = 0; i < str.length(); i++) {
			tmp += str.charAt(i);
			cnt++;

			if (cnt == 7) {
				char c = (char)Integer.parseInt(tmp, 2);
				result += c;
				tmp = "";
				cnt = 0;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		str = str.replace("#", "1");
		str = str.replace("*", "0");
		System.out.println(solution(str));
	}
}
