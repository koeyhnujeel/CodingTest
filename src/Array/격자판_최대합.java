package Array;

import java.util.Scanner;

public class 격자판_최대합 {
	static void solution(int n, int[][] arr) {
		int max = 0;

		for (int i = 0; i < n; i++) {
			int sum1 = 0;
			int sum2 = 0;
			for (int j = 0; j < n; j++) {
				sum1 += arr[i][j];
				sum2 += arr[j][i];
			}
			max = Math.max(max, sum1);
			max = Math.max(max, sum2);
		}

		int sum1 = 0;
		int sum2 = 0;
		for (int i = 0; i < n; i++) {
			sum1 += arr[i][i];
			sum2 += arr[i][n - i - 1];
		}
		max = Math.max(max, sum1);
		max = Math.max(max, sum2);

		System.out.println(max);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		solution(n, arr);
	}
}
