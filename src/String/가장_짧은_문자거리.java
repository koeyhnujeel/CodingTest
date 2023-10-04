package String;

import java.util.Scanner;

public class 가장_짧은_문자거리 {
	static int[] solution(String str, char t) {
		int[] result = new int[str.length()];
		int distance = 200;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == t) {
				distance = 0;
			}
			result[i] = distance;
			distance++;
		}

		distance = 200;
		for (int i = str.length() - 1; i >= 0; i--) {
			if (str.charAt(i) == t) {
				distance = 0;
			}
			result[i] = Math.min(result[i], distance);
			distance++;
		}

		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] tmp = sc.nextLine().split(" ");
		String str = tmp[0];
		char t = tmp[1].charAt(0);
		int[] result = solution(str, t);

		for (int i : result) {
			System.out.print(i + " ");
		}
	}
}
