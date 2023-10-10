package Array;

import java.util.Scanner;

public class 점수계산 {
	static void solution(int[] arr) {
		int result = 0;
		int score = 0;

		for (int i : arr) {
			if(i == 1) {
				score++;
				result += score;
			} else {
			score = 0;
			}
		}
		System.out.println(result);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		solution(arr);
	}
}
