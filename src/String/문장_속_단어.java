package String;

import java.util.Scanner;

public class 문장_속_단어 {
	static String solution(String[] arr) {
		String result = "";
		for (String s : arr) {
			if (s.length() > result.length()) result = s;
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		String[] arr = str.split(" ");
		String result = solution(arr);
		System.out.println(result);
	}
}
