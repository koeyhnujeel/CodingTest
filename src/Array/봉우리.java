package Array;

import java.util.Scanner;

public class 봉우리 {
	static void solution(int n, int[][] arr) {
		int cnt = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				int num = arr[i][j];
				if (num > arr[i - 1][j] && num > arr[i + 1][j] && num > arr[i][j - 1] && num > arr[i][j + 1]) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n+2][n+2];
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		solution(n, arr);
	}
}
