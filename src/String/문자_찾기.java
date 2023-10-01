package String;

import java.util.Scanner;

public class 문자_찾기 {
	static int output = 0;

	static void solution(String s, char c) {
		String str = s.toUpperCase();
		char target = Character.toUpperCase(c);

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == target) {
				output++;
			}
		}
	}

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String s = in.next();
		char c = in.next().charAt(0);

		solution(s, c);

		System.out.println(output);
	}
}
