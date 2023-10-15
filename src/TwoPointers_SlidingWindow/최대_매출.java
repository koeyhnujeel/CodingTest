package TwoPointers_SlidingWindow;

import java.util.Scanner;

public class 최대_매출 {
	static void solution(int n, int k, int[] arr) {
		int max = 0;
		int sum = 0;
		for (int i = 0; i < k; i++) sum += arr[i];
		max = sum;

		for (int j = k; j < n; j++) {
			sum += arr[j] - arr[j - k];

			max = Math.max(max, sum);
		}
		System.out.println(max);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		solution(n, k, arr);
	}
}
