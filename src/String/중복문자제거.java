package String;

import java.util.Scanner;

public class 중복문자제거 {
	static String solution(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			if(i == str.indexOf(str.charAt(i))) result += str.charAt(i);
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
