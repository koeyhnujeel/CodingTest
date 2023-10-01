package String;

import java.util.Scanner;

public class 특정_문자_뒤집기 {
	static String solution(String str) {
		char[] arr = str.toCharArray();
		int idxL = 0;
		int idxR = arr.length - 1;

		while (idxL < idxR) {
			if (!Character.isAlphabetic(arr[idxL])) idxL++;
			else if (!Character.isAlphabetic(arr[idxR])) idxR--;
			else {
				char tmp = arr[idxL];
				arr[idxL] = arr[idxR];
				arr[idxR] = tmp;
				idxL++;
				idxR--;
			}
		}
		return String.valueOf(arr);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		System.out.println(solution(str));
	}
}
